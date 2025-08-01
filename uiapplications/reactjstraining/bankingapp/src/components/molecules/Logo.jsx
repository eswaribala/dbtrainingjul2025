import React from 'react';
import LogoImage from '../atoms/LogoImage';
import LogoText from '../atoms/LogoText';
import Timer from '../atoms/Timer'
import './Logo.css'


const Logo=()=>(
    <div className='logo'>
        <LogoText />
        <Timer/>
        <LogoImage/>
       
    </div>
)

export default Logo;