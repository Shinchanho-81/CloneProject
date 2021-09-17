import Vue from 'vue'
import VueRouter from 'vue-router'
import Main from '../components/Main.vue'
import Detail from '../views/Detail.vue'
import Cart from '../views/CartPage.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Main',
    component: Main
  },
  {
    path: '/Detail',
    name: 'Detail',
    component: Detail
  },
  {
    path: '/Cart',
    name: 'Cart',
    component: Cart
  }
]

const router = new VueRouter({
  mode: 'history',
  routes
})

export default router
