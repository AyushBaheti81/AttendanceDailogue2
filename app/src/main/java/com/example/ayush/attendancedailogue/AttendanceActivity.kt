package com.example.ayush.attendancedailogue

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class AttendanceActivity : AppCompatActivity() {
    object Statified{
        var mContext : Context ?= null
        fun getContext() : Context?{
            return mContext
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Statified.mContext = baseContext

        val list = ArrayList<Adapter.AttData>()
        list.add(Adapter.AttData("Data Structure", "90%","26"))
        list.add(Adapter.AttData("C++", "88%","25"))
        recycler_view.adapter = Adapter(list,applicationContext)
        recycler_view.visibility == View.VISIBLE
        }
    }

