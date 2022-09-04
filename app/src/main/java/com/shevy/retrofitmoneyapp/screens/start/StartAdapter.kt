package com.shevy.retrofitmoneyapp.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shevy.retrofitmoneyapp.R
import com.shevy.retrofitmoneyapp.model.nal.NalichkaItem
import kotlinx.android.synthetic.main.item_money_layout.view.*

class StartAdapter : RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    var listStart = emptyList<NalichkaItem>()

    class StartViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StartViewHolder {
        return StartViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_money_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.item_name.text = listStart[position].base_ccy
        holder.itemView.item_buy.text = listStart[position].buy
        holder.itemView.item_sell.text = listStart[position].sale
    }

    override fun getItemCount(): Int = listStart.size

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<NalichkaItem>){
        listStart = list
        notifyDataSetChanged()
    }
}