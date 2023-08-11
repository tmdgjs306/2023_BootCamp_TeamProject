package com.example.temp_spring.domain.dto;

import com.example.temp_spring.Security.SHA256;
import com.example.temp_spring.domain.user.User;
import com.example.temp_spring.domain.user.UserRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.security.NoSuchAlgorithmException;

/**
 * Project Name: F.E.C
 * Team: Newbies
 * author: 한승헌
 * Description: 회원 가입 기능 처리 시 사용자가 입력한 정보를 Entity로 바꿔주는 기능
 *              id, password, name 관련 무결성 로직
 *              password 정책 관련 로직 ( 비밀번호는 8~20 자리 이내 이어야 한다.)
 *              password 정보를 DB에 저장할 떄는 해싱하여 저장
 */
@Getter
@Setter
@NoArgsConstructor
public class JoinRequest {
    private SHA256 sha256 = new SHA256();
    private String loginId;
    private String password;
    private String salt = sha256.getSalt();
    private String email;

    private Long farmId;

    public User toEntity() throws NoSuchAlgorithmException {
        return User.builder()
                .loginId(this.loginId)
                .passwd(sha256.encrypt(this.password+salt,3))
                .email(this.email)
                .role(UserRole.USER)
                .salt(this.salt)
                .farmId(this.farmId)
                .build();
    }
}