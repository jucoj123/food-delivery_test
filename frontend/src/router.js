
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import 주문Manager from "./components/listers/주문Cards"
import 주문Detail from "./components/listers/주문Detail"
import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import 메뉴판View from "./components/메뉴판View"
import 메뉴판ViewDetail from "./components/메뉴판ViewDetail"
import 통합주문상태View from "./components/통합주문상태View"
import 통합주문상태ViewDetail from "./components/통합주문상태ViewDetail"
import MenuView from "./components/MenuView"
import MenuViewDetail from "./components/MenuViewDetail"
import 통합주문상태View from "./components/통합주문상태View"
import 통합주문상태ViewDetail from "./components/통합주문상태ViewDetail"
import 결제이력Manager from "./components/listers/결제이력Cards"
import 결제이력Detail from "./components/listers/결제이력Detail"
import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"

import 주문관리Manager from "./components/listers/주문관리Cards"
import 주문관리Detail from "./components/listers/주문관리Detail"
import OrdermanagementManager from "./components/listers/OrdermanagementCards"
import OrdermanagementDetail from "./components/listers/OrdermanagementDetail"

import 주문상세보기View from "./components/주문상세보기View"
import 주문상세보기ViewDetail from "./components/주문상세보기ViewDetail"
import VieworderdetailsView from "./components/VieworderdetailsView"
import VieworderdetailsViewDetail from "./components/VieworderdetailsViewDetail"

import OrderstatuscheckView from "./components/OrderstatuscheckView"
import OrderstatuscheckViewDetail from "./components/OrderstatuscheckViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/주문',
                name: '주문Manager',
                component: 주문Manager
            },
            {
                path: '/주문/:id',
                name: '주문Detail',
                component: 주문Detail
            },
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/메뉴판',
                name: '메뉴판View',
                component: 메뉴판View
            },
            {
                path: '/메뉴판/:id',
                name: '메뉴판ViewDetail',
                component: 메뉴판ViewDetail
            },
            {
                path: '/통합주문상태',
                name: '통합주문상태View',
                component: 통합주문상태View
            },
            {
                path: '/통합주문상태/:id',
                name: '통합주문상태ViewDetail',
                component: 통합주문상태ViewDetail
            },
            {
                path: '/menus',
                name: 'MenuView',
                component: MenuView
            },
            {
                path: '/menus/:id',
                name: 'MenuViewDetail',
                component: MenuViewDetail
            },
            {
                path: '/통합주문상태',
                name: '통합주문상태View',
                component: 통합주문상태View
            },
            {
                path: '/통합주문상태/:id',
                name: '통합주문상태ViewDetail',
                component: 통합주문상태ViewDetail
            },
            {
                path: '/결제이력',
                name: '결제이력Manager',
                component: 결제이력Manager
            },
            {
                path: '/결제이력/:id',
                name: '결제이력Detail',
                component: 결제이력Detail
            },
            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },

            {
                path: '/주문관리',
                name: '주문관리Manager',
                component: 주문관리Manager
            },
            {
                path: '/주문관리/:id',
                name: '주문관리Detail',
                component: 주문관리Detail
            },
            {
                path: '/ordermanagements',
                name: 'OrdermanagementManager',
                component: OrdermanagementManager
            },
            {
                path: '/ordermanagements/:id',
                name: 'OrdermanagementDetail',
                component: OrdermanagementDetail
            },

            {
                path: '/주문상세보기',
                name: '주문상세보기View',
                component: 주문상세보기View
            },
            {
                path: '/주문상세보기/:id',
                name: '주문상세보기ViewDetail',
                component: 주문상세보기ViewDetail
            },
            {
                path: '/vieworderdetails',
                name: 'VieworderdetailsView',
                component: VieworderdetailsView
            },
            {
                path: '/vieworderdetails/:id',
                name: 'VieworderdetailsViewDetail',
                component: VieworderdetailsViewDetail
            },

            {
                path: '/orderstatuschecks',
                name: 'OrderstatuscheckView',
                component: OrderstatuscheckView
            },
            {
                path: '/orderstatuschecks/:id',
                name: 'OrderstatuscheckViewDetail',
                component: OrderstatuscheckViewDetail
            },


    ]
})
