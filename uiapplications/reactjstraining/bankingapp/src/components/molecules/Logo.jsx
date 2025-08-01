import React from 'react';
import LogoImage from '../atoms/LogoImage';
import LogoText from '../atoms/LogoText';
import './Logo.css'


const Logo=()=>(
    <div className='Logo'>
        <LogoText />
        <LogoImage/>
    </div>
)

export default Logo;