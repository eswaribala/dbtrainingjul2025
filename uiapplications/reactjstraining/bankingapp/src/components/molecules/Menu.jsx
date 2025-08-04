
import React, { useEffect} from 'react';
import { TabContext, TabList, TabPanel } from '@mui/lab';
import { Box, Tab } from '@mui/material';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';
const Menu = () => {
  const [value, setValue] = React.useState('1');
  const [users, setUsers] = React.useState([]);
  const [loading, setLoading] = React.useState(true);

  const handleChange = (event, newValue) => {
    setValue(newValue);
  };

  useEffect(() => {
    // Fetch users from the API 
    const fetchUsers = async () => {
      try {
        const response = await fetch('https://jsonplaceholder.typicode.com/users');
        const data = await response.json();
        setUsers(data);
        setLoading(false);
      } catch (error) {
        console.error('Error fetching users:', error);
      }
    };

    fetchUsers();
  }, []);

  return (
<TabContext value={value}>
  <Box width={1000} mt={4} mx="auto" sx={{ borderBottom: 1, borderColor: 'divider', }}>
    <TabList onChange={handleChange} aria-label="lab API tabs example">
      <Tab label="Users" value="1" />
      <Tab label="Products" value="2" />
      <Tab label="Orders" value="3" />
    </TabList>
  
  <TabPanel value="1">
    {loading ? (
      <div>Loading...</div>
    ) : (
    //   <ul>
    //     {users.map(user => (
    //       <li key={user.id}>
    //         {user.name} - {user.email}
    //       </li>
    //     ))}
    //   </ul>
    <TableContainer component={Paper}>
      <Table width={1000} sx={{ minWidth: 1000}} aria-label="simple table">
        <TableHead>
          <TableRow>
           
            <TableCell align="right">User Id</TableCell>
            <TableCell align="right">Name</TableCell>
            <TableCell align="right">Email</TableCell>
            <TableCell align="right">Phone No</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {users.map((user) => (
            <TableRow
              key={user.id}
              sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
            >
            
              <TableCell align="right">{user.id}</TableCell>
              <TableCell align="right">{user.name}</TableCell>
              <TableCell align="right">{user.email}</TableCell>
              <TableCell align="right">{user.phone}</TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>
    )}


  </TabPanel>
  <TabPanel value="2">Products</TabPanel>
  <TabPanel value="3">Orders</TabPanel>
  </Box>
</TabContext>
  );
};
export default Menu;