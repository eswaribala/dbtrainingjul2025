import React from 'react';
import Banner from '../atoms/Banner';
import Login from './Login/Login';
import './FormLayout.css'


const FormLayout=()=>(
    <div className='formLayout'>
        <Banner />
        <Login />
    </div>
)

export default FormLayout;