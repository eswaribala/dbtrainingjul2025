import React from 'react';
import { List,ListItem } from '@mui/material';

const OrdersList=({ orders, loading, error }) => {
    if (loading) {
        return <div>Loading...</div>;
    }

    if (error) {
        return <div>Error: {error.message}</div>;
    }

    return (
        <List width={1000} sx={{ width: '100%', maxWidth: 360, bgcolor: 'background.paper' }}>
        {orders.map(order => (
            <ListItem key={order.id}>
                {order.item} - Quantity: {order.quantity} - Price: ${order.price}
            </ListItem>
        ))}
        </List>
    );
};

export default OrdersList;
