import React from 'react';
import { TextField } from '@mui/material';

 import { useFormik } from 'formik';
 
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
     },
   });
   return (
     <form onSubmit={formik.handleSubmit}>
       

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
         value={formik.values.userName}
         fullWidth
         margin="normal">
        </TextField>
       <button type="submit">Submit</button>
     </form>
   );
 };
export default Login;
