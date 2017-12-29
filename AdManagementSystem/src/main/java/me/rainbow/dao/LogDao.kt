package me.rainbow.dao

import me.rainbow.entity.Log

/**
 *
 * @author guojinpeng
 * @date 17.12.29 09:40
 */
interface LogDao {
    fun selectById(id: Int): Log

    fun selectAll(): List<Log>
}