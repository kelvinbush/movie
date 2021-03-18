package com.kelvinwachiye.kotlin.moviedb.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kelvinwachiye.kotlin.moviedb.R
import com.kelvinwachiye.kotlin.moviedb.domains.Episode

class EpisodesAdapter : ListAdapter<Episode, EpisodesAdapter.ViewHolder>(EpisodesDiffCallBack()) {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }


    class ViewHolder private constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val overview: TextView = itemView.findViewById(R.id.overview)
        val stillPath: ImageView = itemView.findViewById(R.id.stillPath)
        val name: TextView = itemView.findViewById(R.id.name)

        fun bind(item: Episode) {
            name.text = item.name
            overview.text = item.overview
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater.inflate(R.layout.episodes_list_item, parent, false)
                return ViewHolder(view)
            }
        }
    }
}

class EpisodesDiffCallBack : DiffUtil.ItemCallback<Episode>() {
    override fun areItemsTheSame(oldItem: Episode, newItem: Episode): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Episode, newItem: Episode): Boolean {
        return oldItem == newItem
    }
}