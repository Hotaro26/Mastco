package com.hotaro.strictclock.utils

import com.hotaro.strictclock.data.AlarmEntity
import java.util.Calendar

object AlarmUtils {
    fun getNextTriggerTime(alarm: AlarmEntity): Long {
        val calendar = Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, alarm.timeHour)
            set(Calendar.MINUTE, alarm.timeMinute)
            set(Calendar.SECOND, 0)
            set(Calendar.MILLISECOND, 0)
            
            if (timeInMillis <= System.currentTimeMillis()) {
                add(Calendar.DAY_OF_YEAR, 1)
            }
        }
        return calendar.timeInMillis
    }
}
