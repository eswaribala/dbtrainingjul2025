import React from 'react';
import { useState, useEffect } from 'react';    
function useProduct(){
    const[products, setProducts] = useState([]);
    const[loading, setLoading] = useState(true);
    const[error, setError] = useState(null);

     useEffect(() => {
        setTimeout(() => {
            try{
                const dummyProducts=[
                    { id: 1, name: 'Laptop', price: 1000 },
                    { id: 2, name: 'Smartphone', price: 500 },
                    { id: 3, name: 'Tablet', price: 300 }
                ];
                setProducts(dummyProducts);
                setLoading(false);
            }
            catch(err){
                setError(err);
            }
            finally{
                setLoading(false);
            }
        }, 1000);
        
        },[]);

    return { products, loading, error };    
}

export default useProduct;