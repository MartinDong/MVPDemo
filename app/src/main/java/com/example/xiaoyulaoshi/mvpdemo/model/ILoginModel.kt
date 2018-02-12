package com.example.xiaoyulaoshi.mvpdemo.model

/**
 * 登录模块的数据接口
 * Created by xiaoyulaoshi on 2018/2/12.
 */
interface ILoginModel {
    /**
     * 调用登录接口
     * @param userName 用户名
     * @param password 密码
     */
    fun requestLogin(userName: String, password: String, callback: Callback)
}