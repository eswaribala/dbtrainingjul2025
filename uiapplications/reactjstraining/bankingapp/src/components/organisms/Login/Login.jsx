import React from 'react';
import { Button, TextField } from '@mui/material';

 import { useFormik } from 'formik';
import './Login.css';
 
 const Login = () => {
   // Note that we have to initialize ALL of fields with values. These
   // could come from props, but since we don’t want to prefill this form,
   // we just use an empty string. If we don’t do this, React will yell
   // at us.
   const formik = useFormik({
     initialValues: {
       userName: '',
       password: '',
     },
     onSubmit: values => {
       alert(JSON.stringify(values, null, 2));
       formik.setValues({
         userName: '',
         password: '',
       });
     },
   });
   return (
     <form onSubmit={formik.handleSubmit} className='login'>
       

       <TextField
         id="userName"
         name="userName"
         label="User Name"
         variant="outlined"
         onChange={formik.handleChange}
         value={formik.values.userName}
         fullWidth
         margin="normal"
       />

      <TextField  id="password"
         name="password"
         label="Password"
         variant="outlined"
         onChange={formik.handleChange}
         value={formik.values.password}
         fullWidth
         margin="normal">
        </TextField>
      <Button type="submit" variant="contained" color="primary">
        Submit
      </Button>
     </form>
   );
 };
export default Login;
