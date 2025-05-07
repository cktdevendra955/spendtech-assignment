import React from 'react'
import CategoryUI from '../category/CategoryUI'
import HeroSectionUI from '../hero/HeroSectionUI'

const HomePageUI = () => {
  return (
    <>
    <HeroSectionUI />
      <div className="container px-10 mx-auto">
        <div className="grid grid-cols-1 gap-2 mt-1 md:grid-cols-2 lg:grid-cols-3 xl:grid-cols-6">
          <CategoryUI />
          <CategoryUI />
          <CategoryUI />
          <CategoryUI />
          <CategoryUI />
          <CategoryUI />
         
        </div>
      </div>
    </>
  )
}

export default HomePageUI