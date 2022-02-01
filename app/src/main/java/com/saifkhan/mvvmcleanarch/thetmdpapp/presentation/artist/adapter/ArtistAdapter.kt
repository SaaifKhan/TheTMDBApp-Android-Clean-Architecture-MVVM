package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.artist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.saifkhan.mvvmcleanarch.thetmdpapp.R
import com.saifkhan.mvvmcleanarch.thetmdpapp.data.model.artist.Artist
import com.saifkhan.mvvmcleanarch.thetmdpapp.databinding.ListItemBinding


class ArtistAdapter():RecyclerView.Adapter<MyViewHolder>() {
    private val artistList = ArrayList<Artist>()

    fun setList(artists:List<Artist>){
         artistList.clear()
         artistList.addAll(artists)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : ListItemBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.list_item,
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return artistList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.bind(artistList[position])
    }
}



class MyViewHolder(val binding: ListItemBinding):
RecyclerView.ViewHolder(binding.root){

   fun bind(artist:Artist){
        binding.tvTitle.text = artist.name
        binding.tvDesc.text = artist.popularity.toString()
        val posterURL = "https://image.tmdb.org/t/p/w500"+artist.profilePath
        Glide.with(binding.thumbNail.context)
            .load(posterURL)
            .into(binding.thumbNail)

   }

}