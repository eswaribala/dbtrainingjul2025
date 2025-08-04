import React from 'react';
import Banner from '../atoms/Banner';
import Login from './Login/Login';
import Register from './Registration/Registration';
import { Routes,Route } from 'react-router-dom';
import Dashboard from './Dashboard';


import './FormLayout.css'


const FormLayout=()=>{

    const[isRegister, setIsRegister] = React.useState(false);   
    const [isLoggedIn, setIsLoggedIn] = React.useState(false);  
    function handleChange(newStatus){
        setIsRegister(newStatus);
    }
    function handleLoginStatus(status) {
        setIsLoggedIn(status);
    }
    return(
   <div className='formLayout'> 
        {(!isLoggedIn)&& (
    <div className='formLayout'>
        <Banner />
        {(!isRegister) ? <Login registerStatus={handleChange} loginStatus={handleLoginStatus} /> : <Register registerStatus={handleChange}/>}
    </div>
    ) }

        {isLoggedIn && (
            <Routes>
               
                <Route path="/login" element={<Login />} />
                <Route path="/register" element={<Register />} />
                <Route path="/dashboard" element={<Dashboard />} />
                
               </Routes>
        )}

   </div>
    )
}

export default FormLayout;