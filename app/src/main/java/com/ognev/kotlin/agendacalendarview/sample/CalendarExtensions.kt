package com.ognev.kotlin.agendacalendarview.sample

import java.util.*
import java.text.SimpleDateFormat


fun Calendar.isSameDay(newDate: Calendar): Boolean =
        this.get(Calendar.DAY_OF_MONTH) == newDate.get(Calendar.DAY_OF_MONTH)

fun Calendar.dateToString(date: Calendar): String {
    val date = date.getTime()
    val ft =   SimpleDateFormat("MM-dd-YYYY")
    return  ft.format(date)
}
