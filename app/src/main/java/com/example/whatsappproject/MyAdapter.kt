package com.example.whatsappproject

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val context: Activity, var arraylist: ArrayList<User>):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    class MyViewHolder(itemView: View):
        RecyclerView.ViewHolder(itemView) {

        var Username=itemView.findViewById<TextView>(R.id.name)
        var Lstmess=itemView.findViewById<TextView>(R.id.lastmessage)
        var Lsttime=itemView.findViewById<TextView>(R.id.time)
        var Pfp = itemView.findViewById<ImageView>(R.id.img1)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view=LayoutInflater.from(context).inflate(R.layout.activity_chats_screen,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arraylist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.Username.text=arraylist[position].Username
        holder.Lstmess.text=arraylist[position].Lstmess
        holder.Lsttime.text=arraylist[position].Lsttime
        holder.Pfp.setImageResource(arraylist[position].Pfp)

    }
}