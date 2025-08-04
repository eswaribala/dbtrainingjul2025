import React, { use } from 'react';
import {useFormik} from 'formik';
import { Button, TextField } from '@mui/material';
import styles from './Registration.css';

const Registration = () => {
   // Note that we have to initialize ALL of fields with values. These
   // could come from props, but since we don’t want to prefill this form,
   // we just use an empty string. If we don’t do this, React will yell
   // at us.
   const formik = useFormik({
     initialValues: {
       firstName: '',
       lastName: '',
       email: '',
       dob: '',
       phone: '',
       userName: '',
       password: '',
     },
     onSubmit: values => {
       alert(JSON.stringify(values, null, 2));
     },
   });
   return (
     <form onSubmit={formik.handleSubmit} className="registration">
       <fieldset>
        <legend>Registration</legend>
        <TextField
          id="firstName"
          name="firstName"
          label="First Name"
          variant="outlined"
          value={formik.values.firstName}
          onChange={formik.handleChange}
          onBlur={formik.handleBlur}
          error={formik.touched.firstName && Boolean(formik.errors.firstName)}
          helperText={formik.touched.firstName && formik.errors.firstName}
          fullWidth
          margin="normal"
        />
        <TextField
          id="lastName"
          name="lastName"
          label="Last Name"
          variant="outlined"
          value={formik.values.lastName}
          onChange={formik.handleChange}
          onBlur={formik.handleBlur}
          error={formik.touched.lastName && Boolean(formik.errors.lastName)}
          helperText={formik.touched.lastName && formik.errors.lastName}
          fullWidth
          margin="normal"
        />
        <TextField
          id="email"
          name="email"
          label="Email"
          variant="outlined"
          value={formik.values.email}
          onChange={formik.handleChange}
          onBlur={formik.handleBlur}
          error={formik.touched.email && Boolean(formik.errors.email)}
          helperText={formik.touched.email && formik.errors.email}
          fullWidth
          margin="normal"
        />
        <TextField
          id="dob"
          name="dob"
          label="Date of Birth"
          variant="outlined"
          type="date"
          value={formik.values.dob}
          onChange={formik.handleChange}
          onBlur={formik.handleBlur}
          error={formik.touched.dob && Boolean(formik.errors.dob)}
          helperText={formik.touched.dob && formik.errors.dob}
          fullWidth
          margin="normal"
        />
        <TextField
          id="phone"
          name="phone"
          label="Phone Number"
          variant="outlined"
          value={formik.values.phone}
          onChange={formik.handleChange}
          onBlur={formik.handleBlur}
          error={formik.touched.phone && Boolean(formik.errors.phone)}
          helperText={formik.touched.phone && formik.errors.phone}
          fullWidth
          margin="normal"
        />
        <TextField
          id="userName"
          name="userName"
          label="User Name"
          variant="outlined"
          value={formik.values.userName}
          onChange={formik.handleChange}
          onBlur={formik.handleBlur}
          error={formik.touched.userName && Boolean(formik.errors.userName)}
          helperText={formik.touched.userName && formik.errors.userName}
          fullWidth
          margin="normal"
        />
        <TextField
          id="password"
          name="password"
          label="Password"
          variant="outlined"
          type="password"
          value={formik.values.password}
          onChange={formik.handleChange}
          onBlur={formik.handleBlur}
          error={formik.touched.password && Boolean(formik.errors.password)}
          helperText={formik.touched.password && formik.errors.password}
          fullWidth
          margin="normal"
        />

        <Button type="submit" variant="contained" color="primary">
          Register
        </Button>

      </fieldset>
    </form>
  );
};


export default Registration;
