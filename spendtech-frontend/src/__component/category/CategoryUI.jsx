import React from "react";
import { Link } from "react-router-dom";

const CategoryUI = () => {
  return (
    <>
      
      <Link to={"/category/men"}>
        <div class="bg-white font-semibold text-center rounded-3xl border shadow-lg py-4 ">
          <img
            class="mb-3 w-32 h-32 rounded-full shadow-lg mx-auto"
            src="https://images.unsplash.com/photo-1633332755192-727a05c4013d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=880&q=80"
            alt="product designer"
          />
          <h1 class="text-lg text-gray-700"> John Doe </h1>
          <h3 class="text-sm text-gray-400 "> Creative Director </h3>
           
        </div>
        </Link>
      
    </>
  );
};

export default CategoryUI;
