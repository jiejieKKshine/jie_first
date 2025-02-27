import { defineStore } from 'pinia'
import { ref } from 'vue'
// 两个参数，一个是名字，有唯一性，另一个是函数，可定义状态的所有内容
export const useTokenStore = defineStore('token', () => {
    const token = ref('')
    const setToken = (newToken) => {
        token.value = newToken
    }
    const removeToken = () => {
        token.value = ''
    }
    return {
        token,
        setToken,
        removeToken
    }
}, {
    persist: true,
});

// 使用pinia的步骤
// 1. 安装pinia：npm install pinia
// 2.在vue实例中引入pinia，即man.js中引入：import { createPinia } from 'pinia'
// 3.在src/store/token.js中定义store
// 4.在组件中使用：
