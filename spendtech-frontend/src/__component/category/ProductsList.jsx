import React from 'react'
import ProductUI from '../product/ProductUI';

const ProductsList = () => {
  
  return (
    <>
    <section className="bg-white dark:bg-gray-900">
    <div className="container px-6 py-8 mx-auto">
      <div className="lg:flex lg:-mx-2">
        <div className="space-y-3 lg:w-1/5 lg:px-2 lg:space-y-4">
          <span
            href="#"
            className="block font-medium text-gray-500 dark:text-gray-300 hover:underline"
          >
            Jackets & Coats
          </span>
          <span
            href="#"
            className="block font-medium text-gray-500 dark:text-gray-300 hover:underline"
          >
            Hoodies
          </span>
          <span
            href="#"
            className="block font-medium text-blue-600 dark:text-blue-500 hover:underline"
          >
            T-shirts & Vests
          </span>
          <span
            href="#"
            className="block font-medium text-gray-500 dark:text-gray-300 hover:underline"
          >
            Shirts
          </span>
          <span
            href="#"
            className="block font-medium text-gray-500 dark:text-gray-300 hover:underline"
          >
            Blazers & Suits
          </span>
          <span
            href="#"
            className="block font-medium text-gray-500 dark:text-gray-300 hover:underline"
          >
            Jeans
          </span>
          <span
            href="#"
            className="block font-medium text-gray-500 dark:text-gray-300 hover:underline"
          >
            Trousers
          </span>
          <span
            href="#"
            className="block font-medium text-gray-500 dark:text-gray-300 hover:underline"
          >
            Shorts
          </span>
          <span
            href="#"
            className="block font-medium text-gray-500 dark:text-gray-300 hover:underline"
          >
            Underwear
          </span>
        </div>

        <div className="mt-6 lg:mt-0 lg:px-2 lg:w-4/5 ">
          <div className="flex items-center justify-between text-sm tracking-widest uppercase ">
            <div>
              <p className="text-gray-500 dark:text-gray-300">6 Items</p>
            </div>

            <div class="">
              <div
                class="flex items-center max-w-md mx-auto rounded-lg "
                x-data="{ search: '' }"
              >
                <div class="w-full">
                  <input
                    type="search"
                    class=" border w-full px-4 py-1 text-gray-800 focus:outline-none h-10"
                    placeholder="search"
                    x-model="search"
                  />
                </div>
                <div>
                  <button
                    type="submit"
                    class="flex items-center bg-blue-500 justify-center w-12 h-10 text-white rounded-r-lg"
                  >
                    <svg
                      class="w-5 h-5"
                      fill="none"
                      stroke="currentColor"
                      viewBox="0 0 24 24"
                      xmlns="http://www.w3.org/2000/svg"
                    >
                      <path
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="2"
                        d="M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z"
                      ></path>
                    </svg>
                  </button>
                </div>
              </div>
            </div>
            <div className="flex items-center">
              <p className="text-gray-500 dark:text-gray-300">Sort</p>
              <select className="font-medium text-gray-700 bg-transparent dark:text-gray-500 focus:outline-none">
                <option value="#">Recommended</option>
                <option value="#">Size</option>
                <option value="#">Price</option>
              </select>
            </div>
          </div>

          <div className="grid grid-cols-1 gap-8 mt-8 md:grid-cols-2 lg:grid-cols-3 xl:grid-cols-4">
           <ProductUI />
           <ProductUI />
           <ProductUI />
           <ProductUI />
           <ProductUI />
           <ProductUI />
           <ProductUI />
           <ProductUI />
           
          </div>
        </div>
      </div>
    </div>
  </section>
</>
  )
}

export default ProductsList