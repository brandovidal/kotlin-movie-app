package com.brandovidal.movieapp.ui.movie.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.brandovidal.movieapp.core.BaseViewHolder
import com.brandovidal.movieapp.databinding.MovieItemBinding

class MovieAdapter : RecyclerView.Adapter<BaseViewHolder<*>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        val itemBinding = MovieItemBinding
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}