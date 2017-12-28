package me.rainbow.entity

import java.util.*

/**
 *
 * @author guojinpeng
 * @date 17.12.28 15:51
 */
data class Log(
        var id: Int = 0,
        var ip: String = "",
        var addr: String = "",
        var option: String = "",
        var createTime: Date
)