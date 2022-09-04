package com.shevy.retrofitmoneyapp.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shevy.retrofitmoneyapp.R
import com.shevy.retrofitmoneyapp.model.beznal.BeznalItem
import kotlinx.android.synthetic.main.item_money_layout.view.*

class SecondAdapter : RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    var listStart = emptyList<BeznalItem>()

    class SecondViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SecondViewHolder {
        return SecondViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_money_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.itemView.item_name.text = listStart[position].base_ccy
        holder.itemView.item_buy.text = listStart[position].buy
        holder.itemView.item_sell.text = listStart[position].sale
    }

    override fun getItemCount(): Int = listStart.size

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<BeznalItem>){
        listStart = list
        notifyDataSetChanged()
    }
}