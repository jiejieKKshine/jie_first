import { createRouter, createWebHistory } from 'vue-router'
// 导入组件
import LoginVue from '@/views/Login.vue'
import LayoutVue from '@/views/Layout.vue';

// import ArticleCategoryVue from '@/views/article/ArticleCategory.vue'
// import ArticleManageVue from '@/views/article/ArticleManage.vue'
// import UserAvatarVue from '@/views/user/UserAvatar.vue'
// import UserInfoVue from '@/views/user/UserInfo.vue'
// import UserResetPasswordVue from '@/views/user/UserResetPassword.vue'


// 定义路由关系
const routes = [
    { path: '/login', component: LoginVue },
    {
        path: '/', component: LayoutVue, redirect: '/article/manage',
        children: [
            { path: '/article/category', component: () => import('@/views/article/ArticleCategory.vue') },
            { path: '/article/manage', component: () => import('@/views/article/ArticleManage.vue') },
            { path: '/user/info', component: () => import('@/views/user/UserInfo.vue') },
            { path: '/user/avatar', component: () => import('@/views/user/UserAvatar.vue') },
            { path: '/user/resetPassword', component: () => import('@/views/user/UserResetPassword.vue') },
            // 配置子路由后，在需要显示的地方声明router-view标签,在为菜单elmenu-item设置index属性，即可显示对应的子路由
        ]
    }
]

// 创建路由器
const router = createRouter({
    history: createWebHistory(),
    routes: routes
})
//导出路由
export default router