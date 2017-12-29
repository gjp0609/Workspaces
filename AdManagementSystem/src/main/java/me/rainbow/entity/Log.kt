package me.rainbow.entity

import java.io.Serializable
import java.util.*

/**
 *
 * @author guojinpeng
 * @date 17.12.28 15:51
 */
class Log : Serializable {
    var id: Int = 0
    var ip: String? = null
    var addr: String? = null
    var operation: String? = null
    var createTime: Date? = null

    constructor() {}
    constructor(id: Int, ip: String, addr: String, operation: String, createTime: Date) {
        this.id = id
        this.ip = ip
        this.addr = addr
        this.operation = operation
        this.createTime = createTime
    }
}