package com.example.firstappkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MediaAdapter(val items: List<MediaItem>): RecyclerView.Adapter<MediaAdapter.viewHolder>() {


    class viewHolder(view: View): RecyclerView.ViewHolder(view){

        val titlle: TextView = view.findViewById(R.id.mediaTitle)
        val thumb: ImageView = view.findViewById(R.id.mediaThumb)

        fun bind(mediaItem: MediaItem){
            titlle.text = mediaItem.name
            //no se que es un glide
            Glide.with(thumb).load(mediaItem.img).into(thumb)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_media_item,parent,false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        val item = items[position]
        holder.bind(item)
    }
}

class MediaItem(val name: String, val img: String)