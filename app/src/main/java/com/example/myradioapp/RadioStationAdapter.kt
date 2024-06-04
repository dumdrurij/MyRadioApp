package com.example.myradioapp


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RadioStationAdapter() : RecyclerView.Adapter<RadioStationAdapter.ViewHolder>() {

    private val stations = listOf("st1","st2","st3","st4","st5") //здесь будет список радиостанций


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.radio_station_item,parent,false)
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RadioStationAdapter.ViewHolder,position: Int) {
        holder.bind(stations[position])
    }

    override fun getItemCount(): Int {
        return stations.size
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textViewRadioStation: TextView = itemView.findViewById(R.id.textViewRadioStation)

        fun bind(station: String) {
            textViewRadioStation.text = station

        }
    }
}




