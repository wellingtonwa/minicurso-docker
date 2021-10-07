import logo from './logo.svg';
import './App.css';
import {useEffect} from "react";

const App = () => {

  const getDadosBackEnd = () => {
    fetch('http://my-app.localhost/api').then(response => {
      return response.json();
    }).then(json => {
      console.log(JSON.stringify(json));
    })
  };

  useEffect(() => {
    getDadosBackEnd();
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
};

export default App;
