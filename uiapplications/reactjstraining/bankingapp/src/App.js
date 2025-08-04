import Logo from './components/molecules/Logo'
import FormLayout from './components/organisms/FormLayout';
import { Routes,Route } from 'react-router-dom';
import './App.css';
import Login from './components/organisms/Login/Login';
import Registration from './components/organisms/Registration/Registration';

function App() {

   <Routes>
   
    <Route path="/login" element={<Login />} />
    <Route path="/register" element={<Registration />} />
    
   </Routes>


  return (
    <div className='App'>
      <header className='App-header'>
        <Logo/>        
      </header>
      <FormLayout />
      
    </div>
  );
}

export default App;
