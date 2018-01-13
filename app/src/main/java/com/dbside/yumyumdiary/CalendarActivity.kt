package com.dbside.yumyumdiary

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CalendarView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calendar.*
import java.util.*

class CalendarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        val calView = findViewById<CalendarView>(R.id.calendarview)
        calView.setOnDateChangeListener { view, year, month, dayOfMonth ->
//            Toast.makeText(this, "clicked :" + year + ", " + (month+1) + ", " + dayOfMonth, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DietListActivity::class.java)
            intent.putExtra("date", year.toString() + "-" + month + "-" + dayOfMonth)
            startActivity(intent)

        }
//        calView.setOnDateChangeListener()



    }

}
