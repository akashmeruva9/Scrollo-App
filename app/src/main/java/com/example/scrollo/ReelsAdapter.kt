package com.example.scrollo

import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.VideoView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView

class reelsadapter( var listener: ReelsFragment, val items: ArrayList<Reels> = ArrayList())
    :RecyclerView.Adapter<reelviewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): reelviewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.reelitem, parent, false)
        val viewholder = reelviewholder(view)
        return viewholder
    }

    override fun onBindViewHolder(holder: reelviewholder, position: Int) {

        var issaved = false
        holder.videoview.setVideoURI(items[position].url.toUri())
        holder.title.text = items[position].title
        holder.description.text = items[position].Description

        holder.videoview.setOnPreparedListener(object : MediaPlayer.OnPreparedListener {
            override fun onPrepared(p0: MediaPlayer?) {
                holder.pgbar.visibility = View.GONE
                holder.videoview.start()
            }
        })

        holder.videoview.setOnClickListener {
            if(holder.videoview.isPlaying == true )
            holder.videoview.pause()
            else if (holder.videoview.isPlaying == false)
                holder.videoview.resume()
        }
        holder.videoview.setOnCompletionListener(object : MediaPlayer.OnCompletionListener {
            override fun onCompletion(p0: MediaPlayer?) {

                holder.videoview.start()
            }

        })

        holder.sharebtn.setOnClickListener {
            listener.shareReel(items[position].url)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

}
    class reelviewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var videoview = itemView.findViewById<VideoView>(R.id.reelsvideo)
        var pgbar = itemView.findViewById<ProgressBar>(R.id.reelsloadpgbar)
        var title = itemView.findViewById<TextView>(R.id.reelstitle)
        var description = itemView.findViewById<TextView>(R.id.reelsdescription)
        var sharebtn = itemView.findViewById<Button>(R.id.reelssharebutton)
    }