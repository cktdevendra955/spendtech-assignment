import React from "react";

const CartIcon = () => {
  return (
    <>
      <svg
        xmlns="http://www.w3.org/2000/svg"
        fill="none"
        viewBox="0 0 24 24"
        strokeWidth={1.5}
        stroke="currentColor"
        className="w-7 h-7 text-gray-700 hover:text-blue-600 transition duration-300 cursor-pointer"
      >
        <path
          strokeLinecap="round"
          strokeLinejoin="round"
          d="M2.25 3h1.636c.511 0 .961.293 1.178.75l3.086 6.512a1.125 1.125 0 00.987.638h7.183a1.125 1.125 0 001.073-.743l2.083-5.209A.75.75 0 0019.25 3H5.25m1.5 15.75a.75.75 0 100 1.5.75.75 0 000-1.5zm10.5 0a.75.75 0 100 1.5.75.75 0 000-1.5z"
        />
      </svg>
    </>
  );
};

export default CartIcon;
