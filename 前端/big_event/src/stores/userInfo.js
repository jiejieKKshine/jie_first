import { defineStore } from 'pinia'
import { ref } from 'vue'

// 两个参数，一个是名字，有唯一性，另一个是函数，可定义状态的所有内容
const useUserInfoStore = defineStore('userInfo', () => {
    const info = ref('')
    const setInfo = (newInfo) => {
        info.value = newInfo
    }
    const removeInfo = () => {
        info.value = ''
    }
    return {
        info,
        setInfo,
        removeInfo
    }
}, {
    persist: true,
});

export default useUserInfoStore;