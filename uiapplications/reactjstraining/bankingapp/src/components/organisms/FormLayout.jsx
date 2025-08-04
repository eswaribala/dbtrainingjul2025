import React from 'react';
import Banner from '../atoms/Banner';
import Login from './Login/Login';
import Register from './Registration/Registration';
import './FormLayout.css'


const FormLayout=()=>{

    const[isRegister, setIsRegister] = React.useState(false);   
    function handleChange(newStatus){
        setIsRegister(newStatus);
    }
    return(
    <div className='formLayout'>
        <Banner />
        {(!isRegister) ? <Login registerStatus={handleChange} /> : <Register />}
    </div>
    )
}

export default FormLayout;