<<<<<<< Updated upstream
import React from 'react';
import './App.css';

const ManageUsers = () => {
    return (
        <div>Manage users</div>
=======

import SideBar from '../../../Components/Sidebar/SideBar';
import Header from '../../../Components/Header/Header';

const ManageUsers = () => {
    return (
        <div className="overflow-hidden w-screen h-screen flex bg-[#14213d]">
            <SideBar />
            <Header />
            <div className="flex-1 flex flex-col ">
                Users
            </div>
        </div>
>>>>>>> Stashed changes
    )
}

export default ManageUsers;