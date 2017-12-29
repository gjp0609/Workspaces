package me.rainbow.controller

import me.rainbow.entity.Log
import me.rainbow.service.LogService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.util.*

/**
 *
 * @author guojinpeng
 * @date 17.12.28 15:35
 */
@RequestMapping("/qrCode")
@Controller("qrCodeController")
open class QRCodeController {
    private val log = LoggerFactory.getLogger(QRCodeController::class.java)
    @Autowired
    lateinit open var logService: LogService

    @RequestMapping(params = ["list"])
    @ResponseBody
    fun queryAll(): HashMap<String, Any?> {
        log.debug("")
        val list = logService.getAllLogs()
        val map = HashMap<String, Any?>()
        for (log in list) {
            map["ip"] = log.ip
            map["addr"] = log.addr
        }
        return map
    }

    @RequestMapping(params = ["get"])
    @ResponseBody
    fun queryOne(id: Int): Log {
        log.debug("id为: {}", id)
        return logService.getLog(id)
    }
}