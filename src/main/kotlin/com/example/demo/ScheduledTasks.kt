package com.example.demo
import org.apache.commons.logging.LogFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.text.SimpleDateFormat
import java.util.*


/**
 * 定时任务
 */
//@Component
class ScheduledTasks {

    val log = LogFactory.getLog(ScheduledTasks::class.java)!!

    private val dateFormat = SimpleDateFormat("HH:mm:ss")

    @Scheduled(fixedRate = 1000)
    fun reportCurrentTime() {
        log.info("现在时间 , ${dateFormat.format(Date())}")
    }
}
