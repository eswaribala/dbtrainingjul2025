import React from 'react';


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
       <label htmlFor="userName">User Name</label>
       <input
         id="userName"
         name="userName"
         type="text"
         onChange={formik.handleChange}
         value={formik.values.userName}
       />
 
        <label htmlFor="password">Password</label>
       <input
         id="password"
         name="password"
         type="password"
         onChange={formik.handleChange}
         value={formik.values.password}
       />

       <button type="submit">Submit</button>
     </form>
   );
 };
export default Login;
