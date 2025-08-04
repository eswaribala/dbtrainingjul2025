import React from 'react';
import useProduct from '../hooks/useProducts';
import { List, ListItem } from '@mui/material';

function ProductList() {
    //custom hook to fetch products
    const { products, loading, error } = useProduct();

    if (loading) {
        return <div>Loading...</div>;
    }

    if (error) {
        return <div>Error: {error.message}</div>;
    }

    return (
       <List width={1000} sx={{ width: '100%', maxWidth: 360, bgcolor: 'background.paper' }}>
        {products.map(product => (
            <ListItem key={product.id}>
                {product.name} - Quantity: {product.quantity} - Price: ${product.price}
            </ListItem>
        ))}
        </List>
    );
}

export default ProductList;