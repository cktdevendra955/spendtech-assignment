import React from "react";
import CartIcon from "../icons/CartIcon";

const ProductUI = () => {
  return (
    <>
      <div class="max-w-2xl mx-auto">
        <div class="bg-white shadow-md rounded-lg max-w-sm dark:bg-gray-800 dark:border-gray-700">
          <a href="#">
            <img
              class="rounded-t-lg  mb-2"
              src="https://i.ibb.co/KqdgGY4/cosmetic-packaging-mockup-1150-40280.webp"
              alt="product image"
            />
          </a>
          
          <div class="px-2 pb-2">
            <a href="#">
              <h6 class="text-gray-900 font-semibold tracking-tight dark:text-white">
                Apple Watch Series 7 GPS, Aluminium Case, Starlight Sport
              </h6>
            </a>
            
            <div class="flex items-center justify-between mt-3 p-2">
              <span class=" font-bold text-gray-900 dark:text-white">
                $599
              </span>
              <a
                href="#"
                class="text-black font-medium rounded-lg text-sm  "
              >
               <CartIcon />
              </a>
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default ProductUI;
