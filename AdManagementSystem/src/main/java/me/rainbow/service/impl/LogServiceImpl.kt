package me.rainbow.service.impl

import me.rainbow.entity.Log
import me.rainbow.service.LogService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 *
 * @author guojinpeng
 * @date 17.12.28 15:41
 */
@Transactional
@Service("logService")
open class LogServiceImpl : LogService {

    override fun getAll(): List<Log> {
        println("getAll")
        return emptyList()
    }

    override fun saveLog(log: Log) {
        println(log)
    }

}