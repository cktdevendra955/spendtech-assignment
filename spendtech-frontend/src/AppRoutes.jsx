// src/AppRoutes.js
import React from 'react';
import { Routes, Route } from 'react-router-dom';
import ProductsList from './__component/category/ProductsList';
import HomePageUI from './__component/home/HomePageUI';
 
const AppRoutes = () => {
  return (
    <Routes>
      <Route path="/" element={<HomePageUI />} />
      <Route path="/category/:slug" element={<ProductsList />} />
    </Routes>
  );
};

export default AppRoutes;
