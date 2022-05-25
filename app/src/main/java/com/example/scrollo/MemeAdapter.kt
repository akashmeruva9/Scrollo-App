package com.example.scrollo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class Memeadapter( private val listener:memefragment): RecyclerView.Adapter<Memeviewholder>()
{
    val items: ArrayList<Memes> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int ): Memeviewholder
    {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.memeitem , parent , false )
        val viewholder = Memeviewholder(view)
        return viewholder
    }

    override fun getItemCount(): Int {

        return  items.size
    }

    override fun onBindViewHolder(holder: Memeviewholder, position: Int)
    {
        var issaved = false
        val currentitem = items[position].url.toString()
        holder.userid.text = items[position].title.toString()
        holder.description.text = items[position].description.toString()

        Glide.with(holder.itemView.context).load(currentitem).into(holder.image)


        holder.sharebutton.setOnClickListener {
            listener.shareMeme(currentitem)
        }

        holder.download.setOnClickListener {
            listener.downloadmeme( holder.image ,currentitem)
        }

    }

    fun clearitems()
    {
        items.clear()
    }
    fun update1(str: Memes){

        if(items.contains(str) == false)
        items.add(str)

        notifyDataSetChanged()
    }
}


class Memeviewholder(itemView : View): RecyclerView.ViewHolder(itemView)
{
    val image: ImageView = itemView.findViewById(R.id.memeimage)
    val userid : TextView = itemView.findViewById(R.id.memetitle)
    val sharebutton : Button = itemView.findViewById(R.id.memesharebutton)
    val download : Button = itemView.findViewById(R.id.memedownloadbutton)
    val description : TextView = itemView.findViewById(R.id.memeDescription)
}

interface shareclick{

    fun shareMeme( view : String)
}
interface downloadclick{

    fun downloadmeme( view : String)
}