import React from 'react';
import { useState, useEffect } from 'react';
const withOrders=(WrappedComponent) => {
    return function EnhanecdComponent(props) {
        const[orders, setOrders] = useState([]);
        const[loading, setLoading] = useState(true);
        const[error, setError] = useState(null);

         useEffect(() => {
            setTimeout(() => {
                try{

                    const dummyOrders=[
                        { id: 1, item: 'Pizza', quantity: 2, price: 20 },
                        { id: 2, item: 'Burger', quantity: 1, price: 10 },
                        { id: 3, item: 'Pasta', quantity: 3, price: 15 }
                    ];
                    setOrders(dummyOrders);
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

            

        // Pass the orders prop to the wrapped component
        return <WrappedComponent {...props} orders={orders} loading={loading} error={error} />;
    }
  
}

export default withOrders;