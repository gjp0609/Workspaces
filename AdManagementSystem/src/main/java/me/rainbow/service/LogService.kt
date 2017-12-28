package me.rainbow.service

import me.rainbow.entity.Log

/**
 *
 * @author guojinpeng
 * @date 17.12.28 15:40
 */
interface LogService {

    fun getAll(): List<Log>

    fun saveLog(log: Log)
}