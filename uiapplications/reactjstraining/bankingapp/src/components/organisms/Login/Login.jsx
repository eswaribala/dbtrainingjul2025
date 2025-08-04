import React from 'react';
import { Button, TextField } from '@mui/material';

import { useFormik } from 'formik';
import './Login.css';
import * as Yup from 'yup';

const validationSchema = Yup.object({
  userName: Yup.string()
    .required('User Name is required'),
  password: Yup.string()
    .required('Password is required'),
})


 
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
      validationSchema: validationSchema,
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
       <fieldset>
       <legend>Login</legend>
       <TextField
         id="userName"
         name="userName"
         label="User Name"
         variant="outlined"
         onChange={formik.handleChange}
         value={formik.values.userName}
         onError={formik.errors.userName && Boolean(formik.errors.userName)}
         helperText={formik.errors.userName}
         fullWidth
         margin="normal"
       />

      <TextField  id="password"
         name="password"
         label="Password"
         variant="outlined"
         onChange={formik.handleChange}
         value={formik.values.password}
         onError={formik.errors.password && Boolean(formik.errors.password)}
         helperText={formik.errors.password}
         fullWidth
         margin="normal"
       />

      <Button type="submit" variant="contained" color="primary">
        Submit
      </Button>
  </fieldset>
     </form>
   );
 };
export default Login;
