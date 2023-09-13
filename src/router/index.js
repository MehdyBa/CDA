import { createRouter, createWebHistory } from 'vue-router'
import Home from '../components/Home.vue'
import Backpack from '../components/BackPack.vue'
import Outerwear from '../components/Outerwear.vue'
import Accessory from '../components/Accessory.vue'
import Blog from '../components/Blog.vue'
import SignIn from '../components/SignIn.vue'
import SignUp from '../components/SignUp.vue'
import CreateProducts from '../components/CreateProducts.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [

    {
        path: '/',
        name: 'Home',
        component: Home
    },
    {
      path: '/backPack',
      name: 'BackPack',
      component: Backpack
    },
    {
      path: '/outerwear',
      name: 'Outerwear',
      component: Outerwear
    },
    {
      path: '/accessory',
      name: 'Accessory',
      component: Accessory
    },
    {
      path: '/blog',
      name: 'Blog',
      component: Blog
    },
    {
      path: '/sign-in',
      name: 'SignIn',
      component: SignIn
    },
    {
      path: '/sign-up',
      name: 'SignUp',
      component: SignUp
    },
    {
      path: '/create-products',
      name: 'CreateProducts',
      component: CreateProducts
    },
    
  ]
})

export default router