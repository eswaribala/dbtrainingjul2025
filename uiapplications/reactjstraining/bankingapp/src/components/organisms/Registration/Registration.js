import React, { use } from 'react';
import {useFormik} from 'formik';
import { Button, TextField } from '@mui/material';
import styles from './Registration.css';
  import { useNavigate } from 'react-router-dom';

import * as Yup from 'yup';
const validationSchema = Yup.object({
  firstName: Yup.string()
    .required('First Name is required')
    .min(2, 'First Name must be at least 2 characters')
    .max(50, 'First Name must not exceed 50 characters')
    .matches(/^[a-zA-Z]+$/, 'First Name must contain only letters'),
  lastName: Yup.string()
    .required('Last Name is required')
    .min(2, 'Last Name must be at least 2 characters')
    .max(50, 'Last Name must not exceed 50 characters')
    .matches(/^[a-zA-Z]+$/, 'Last Name must contain only letters'),
  email: Yup.string()
    .email('Invalid email format')
    .required('Email is required')
    .max(100, 'Email must not exceed 100 characters')
    .matches(/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/, 'Email must be a valid email address'),
  dob: Yup.date()
    .required('Date of Birth is required')
    .nullable()
    .max(new Date(), 'Date of Birth cannot be in the future') 
    .test('age', 'You must be at least 18 years old', value => {
      if (!value) return true; // Skip validation if no value
      const today = new Date();
      const age = today.getFullYear() - value.getFullYear();
      const monthDiff = today.getMonth() - value.getMonth();
      if (monthDiff < 0 || (monthDiff === 0 && today.getDate() < value.getDate())) {
        return age >= 18;
      }
      return age >= 18;
    }),
  phone: Yup.string()
    .required('Phone Number is required')
    .matches(/^\d{10}$/, 'Phone Number must be 10 digits'),
  userName: Yup.string()
    .required('User Name is required'),
  password: Yup.string()
    .required('Password is required')
    .min(6, 'Password must be at least 6 characters')
    .max(10, 'Password must not exceed 10 characters')
    .matches(/^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{6,}$/, 'Password must contain at least one uppercase letter, one lowercase letter, one number, and one special character')
});

const Registration = ({registerStatus}) => {
   // Note that we have to initialize ALL of fields with values. These
   // could come from props, but since we don’t want to prefill this form,
   // we just use an empty string. If we don’t do this, React will yell
   // at us.
   const navigate = useNavigate();
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
      validationSchema: validationSchema,
     onSubmit: values => {
       alert(JSON.stringify(values, null, 2));
       registerStatus(false); // Switch to login after registration
       navigate('/login'); // Redirect to login after registration
       
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
