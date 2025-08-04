
import React from 'react';
import { TabContext, TabList, TabPanel } from '@mui/lab';
import { Box, Tab } from '@mui/material';
const Menu = () => {
  const [value, setValue] = React.useState('1');

  const handleChange = (event, newValue) => {
    setValue(newValue);
  };

  return (
<TabContext value={value}>
  <Box width={400} mt={4} mx="auto" sx={{ borderBottom: 1, borderColor: 'divider', }}>
    <TabList onChange={handleChange} aria-label="lab API tabs example">
      <Tab label="Users" value="1" />
      <Tab label="Products" value="2" />
      <Tab label="Orders" value="3" />
    </TabList>
  
  <TabPanel value="1">Users</TabPanel>
  <TabPanel value="2">Products</TabPanel>
  <TabPanel value="3">Orders</TabPanel>
  </Box>
</TabContext>
  );
};
export default Menu;