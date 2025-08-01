import Logo from './components/molecules/Logo'
import Timer from './components/atoms/Timer'
import './App.css';

function App() {
  return (
    <div className='App'>
      <header className='App-header'>
        <Logo/>
        <Timer/>
      </header>
    </div>
  );
}

export default App;
