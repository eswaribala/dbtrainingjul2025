import Logo from './components/molecules/Logo'
import FormLayout from './components/organisms/FormLayout';

import './App.css';

function App() {
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
