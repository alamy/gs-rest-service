import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Inicial from './pages/Inicial'

function App() {
  return (
    <BrowserRouter>
    <Routes>
      <Route path="/" element={<Inicial />} />
    </Routes>
  </BrowserRouter>
  );
}

export default App;
