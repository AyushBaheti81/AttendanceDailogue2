package com.example.ayush.attendancedailogue

import android.content.Context
import android.support.v7.app.AlertDialog
import android.support.v7.widget.AlertDialogLayout
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_att.view.*
import android.widget.FrameLayout
import android.widget.EditText
import android.content.DialogInterface




class Adapter(val list: ArrayList<AttData>, val context: Context) : RecyclerView.Adapter<Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent!!.context)

        val feedView = inflater.inflate(R.layout.layout_att, parent, false)

        return ViewHolder(feedView, context)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bindData(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View, context: Context) : RecyclerView.ViewHolder(itemView) {
        fun bindData(attData: AttData) {
            itemView.subname.text = attData.userName
            itemView.percentage.text = attData.attendance
            itemView.att.text = attData.present
            itemView.listviewitem.setOnClickListener(View.OnClickListener {
                val inflater = LayoutInflater.from(AttendanceActivity.Statified.getContext())
                val dialoglayout = inflater.inflate(R.layout.dailfr, null)
                val builder = AlertDialog.Builder(AttendanceActivity.Statified.getContext() as Context)
                builder.setView(dialoglayout)
                builder.show()
            })
        }
    }

    class AttData(val userName: String, val attendance: String, val present: String)
}