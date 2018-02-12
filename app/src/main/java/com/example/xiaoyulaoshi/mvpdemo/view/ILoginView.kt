package com.example.xiaoyulaoshi.mvpdemo.view

/**
 * 定义登录视图需要的接口方法
 * Created by xiaoyulaoshi on 2018/2/12.
 */
interface ILoginView {
    /**
     * 获取用户输入的名称
     * @return username
     */
    fun getUsername(): String

    /**
     * 获取用户输入的密码
     * @return password
     */
    fun getPassword(): String

    /**
     * 展示加载视图
     * @param msg 描述信息
     */
    fun showLoading(msg: String)

    /**
     * 隐藏加载视图
     */
    fun hidLoading()

    /**
     * 展示结果数据
     * @param 结果数据
     */
    fun showResult(result: String)
}