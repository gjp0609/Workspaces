package me.rainbow.service.impl

import me.rainbow.dao.LogDao
import me.rainbow.entity.Log
import me.rainbow.service.LogService
import org.springframework.beans.factory.annotation.Autowired
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

    @Autowired
    lateinit open var dao: LogDao

    override fun getAllLogs(): List<Log> {
        return dao.selectAll()
    }

    override fun saveLog(log: Log) {
        println(log)
    }

    override fun getLog(id: Int): Log {
        return dao.selectById(id)
    }
}