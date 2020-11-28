package com.kelvinwachiye.kotlin.moviedb.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.kelvinwachiye.kotlin.moviedb.R
import com.kelvinwachiye.kotlin.moviedb.databinding.GridItemMovieBinding
import com.kelvinwachiye.kotlin.moviedb.domains.TvShow

private const val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w185/"

class ShowsAdapter(private val listener: OnItemClickListener) :
    PagingDataAdapter<TvShow, ShowsAdapter.ShowsViewHolder>(
        MOVIE_COMPARATOR
    ) {

    override fun onBindViewHolder(holder: ShowsViewHolder, position: Int) {
        val currentItem = getItem(position)
        if (currentItem != null) {
            holder.bind(currentItem)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowsViewHolder {
        val binding =
            GridItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ShowsViewHolder(binding)
    }

    inner class ShowsViewHolder(private val binding: GridItemMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
                val position = bindingAdapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val item = getItem(position)
                    if (item != null) {
                        listener.onItemClick(item)
                    }
                }
            }
        }

        fun bind(show: TvShow) {
            binding.apply {
                Glide.with(itemView)
                    .load(IMAGE_BASE_URL + show.poster)
                    .centerCrop()
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .error(R.drawable.ic_broken_image)
                    .into(imposter)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(show: TvShow)
    }


    companion object {
        private val MOVIE_COMPARATOR = object : DiffUtil.ItemCallback<TvShow>() {
            override fun areItemsTheSame(
                oldItem: TvShow,
                newItem: TvShow
            ) = oldItem.id == newItem.id

            override fun areContentsTheSame(
                oldItem: TvShow,
                newItem: TvShow
            ) = oldItem == newItem
        }
    }
}