package com.example.countrylist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CountryAdaptor (countrylist:  MutableList<Country> ):RecyclerView.Adapter<CountryAdaptor.ViewHolder>() {
    val countries=countrylist


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countries.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
             holder.chekbox.isChecked=countries[position].status
             holder.textViewCountry.text=countries[position].name
        holder.chekbox.setOnClickListener {
            countries[position].status = !countries[position].status


        }

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewCountry: TextView = itemView.findViewById(R.id.textViewcountry)
        val chekbox: CheckBox = itemView.findViewById(R.id.chkbox)
    }

}