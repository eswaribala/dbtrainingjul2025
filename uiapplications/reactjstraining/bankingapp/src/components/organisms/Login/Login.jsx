import React from 'react';
import { Button, TextField } from '@mui/material';
import axios from 'axios';
import { useFormik } from 'formik';
import './Login.css';
import * as Yup from 'yup';
import { useNavigate } from 'react-router-dom';

const validationSchema = Yup.object({
  userName: Yup.string()
    .required('User Name is required'),
  password: Yup.string()
    .required('Password is required'),
})


 
 const Login = ({registerStatus,loginStatus}) => {
   // Note that we have to initialize ALL of fields with values. These
   // could come from props, but since we don’t want to prefill this form,
   // we just use an empty string. If we don’t do this, React will yell
   // at us.
    const navigate = useNavigate();

   function handleRegister() {
      registerStatus(true);
   }  

   const formik = useFormik({
     initialValues: {
       userName: '',
       password: '',
     },
      validationSchema: validationSchema,
     onSubmit: values => {
     //  alert(JSON.stringify(values, null, 2));
       axios.post('https://postman-echo.com/post', values)
       .then(response => {
         console.log(response.data);
         loginStatus(true); // Update login status
         // Handle successful login here, e.g., redirect or show a success message
         navigate('/dashboard');
       })
       .catch(error => {
         console.error('Login error:', error);
         loginStatus(true); // Update login status
         // Handle successful login here, e.g., redirect or show a success message
         navigate('/dashboard');
       })
      

       formik.setValues({
         userName: '',
         password: '',
       });
     },
   });
   return (
    <div className='loginContainer'>
     <form onSubmit={formik.handleSubmit} className='login'>
       <fieldset>
       <legend>Login</legend>
       <TextField
         id="userName"
         name="userName"
         label="User Name"
         variant="outlined"
         onChange={formik.handleChange}
         value={formik.values.userName}
         onError={formik.touched.userName && formik.errors.userName && Boolean(formik.errors.userName)}
         helperText={formik.touched.userName &&formik.errors.userName}
         fullWidth
         margin="normal"
       />

      <TextField  id="password"
         name="password"
         label="Password"
         variant="outlined"
         onChange={formik.handleChange}
         value={formik.values.password}
         onError={formik.touched.password && formik.errors.password && Boolean(formik.errors.password)}
         helperText={formik.touched.password && formik.errors.password}
         fullWidth
         margin="normal"
       />

      <Button type="submit" variant="contained" color="primary">
        Submit
      </Button>
  </fieldset>
     </form>
     <div>
    <a href="#" onClick={handleRegister}>Don't have an account? Register </a>
   </div>
   </div>
   );
   
 };
export default Login;
