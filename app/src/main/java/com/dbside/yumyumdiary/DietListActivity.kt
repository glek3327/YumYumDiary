package com.dbside.yumyumdiary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class DietListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diet_list)

        val date = intent.getStringExtra("date")
        Toast.makeText(this, date, Toast.LENGTH_SHORT).show()
    }
}
