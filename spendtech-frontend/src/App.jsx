import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";
import HeroSectionUI from "./__component/hero/HeroSectionUI";
import CategoryUI from "./__component/category/CategoryUI";
import AppRoutes from "./AppRoutes";

function App() {
  return (
    <>
    <AppRoutes />      
    </>
  );
}

export default App;
