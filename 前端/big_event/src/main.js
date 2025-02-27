import './assets/main.scss'
import { createApp } from 'vue'
// import './style.css'
import App from './App.vue'
import Element from 'element-plus'
import locale from 'element-plus/dist/locale/zh-cn.js'
import 'element-plus/dist/index.css'
// 再vue实例中使用路由
import router from '@/router'
import { createPinia } from 'pinia'
import { createPersistedState } from 'pinia-persistedstate-plugin'
const persist = createPersistedState()
const pinia = createPinia()
pinia.use(persist)

const app = createApp(App);
app.use(pinia);
app.use(router);
app.use(Element, { locale: locale });
app.mount('#app')
