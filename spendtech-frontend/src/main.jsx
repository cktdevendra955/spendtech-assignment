import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import NavbarUI from './__component/layout/NavbarUI.jsx'
import FooterUI from './__component/layout/FooterUI.jsx'
import { BrowserRouter } from 'react-router-dom'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <NavbarUI />
    <BrowserRouter > 
      <App />
    </BrowserRouter>    
    <FooterUI />
  </StrictMode>,
)
