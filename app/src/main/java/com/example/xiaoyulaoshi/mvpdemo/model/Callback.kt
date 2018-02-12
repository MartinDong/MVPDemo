package com.example.xiaoyulaoshi.mvpdemo.model

/**
 *  处理Model层完成操作后的回调
 *  Created by xiaoyulaoshi on 2018/2/12.
 */
interface Callback {
    /**
     * 成功
     */
    fun onSuccess()

    /**
     * 失败
     * @param errorMsg 失败信息
     */
    fun onFailure(errorMsg: String)
}
