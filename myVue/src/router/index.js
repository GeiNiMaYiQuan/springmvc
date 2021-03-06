import Vue from 'vue'
import Router from 'vue-router'
// 导入刚才编写的组件
import success from '@/components/success'
import login from '@/components/login'

Vue.use(Router)

export default new Router({
  routes: [
  // 下面都是固定的写法
    {
      path: '/login',
      name: 'login',
      component: login
    },
    {
      path: '/success',
      name: 'success',
      component: success
    }
  ]
})
