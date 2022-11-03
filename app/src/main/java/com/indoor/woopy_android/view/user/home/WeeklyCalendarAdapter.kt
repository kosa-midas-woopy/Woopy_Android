package com.indoor.woopy_android.view.user.home

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.indoor.woopy_android.R

class WeeklyCalendarAdapter(private val dataSet: ArrayList<Date>): RecyclerView.Adapter<WeeklyCalendarAdapter.ViewHolder>()  {
    private lateinit var itemClickListener : OnItemClickListener

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val dateText: TextView = view.findViewById(R.id.calendar_item_date)
        val dayText: TextView = view.findViewById(R.id.calendar_item_day)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.weekly_calendar_item, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dateText.text = dataSet[position].date
        holder.dayText.text = dataSet[position].day
    }

    override fun getItemCount() = dataSet.size

}