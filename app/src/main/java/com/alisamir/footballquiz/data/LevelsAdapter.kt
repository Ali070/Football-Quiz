package com.alisamir.footballquiz.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alisamir.footballquiz.R
import com.alisamir.footballquiz.databinding.LevelsItemBinding
import com.alisamir.footballquiz.pojo.level
import com.squareup.picasso.Picasso
import java.util.logging.Level

class LevelsAdapter(val levels:ArrayList<level>): RecyclerView.Adapter<LevelsAdapter.viewHolder>() {
    lateinit var listner: onItemClickListner
    interface onItemClickListner{
        fun onClick(position:Int)
    }
    fun setOnItemClickLisner(l:onItemClickListner){
        listner = l
    }
    class viewHolder(val binding: LevelsItemBinding, val listener:onItemClickListner) : RecyclerView.ViewHolder(binding.root) {
            fun bind(myLevel: level){
                binding.levelTitleTv.text = myLevel.levelTitle
                Picasso.get().load(myLevel.levelIcon).resize(100,100)
                    .into(binding.levelIconIv)
                binding.root.setOnClickListener{
                    val position = adapterPosition
                    listener.onClick(position)
                }
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LevelsAdapter.viewHolder {
        return viewHolder(LevelsItemBinding.inflate(LayoutInflater.from(parent.context),parent,false),listner)
    }

    override fun onBindViewHolder(holder: LevelsAdapter.viewHolder, position: Int) {
        holder.bind(levels.get(position))
    }

    override fun getItemCount(): Int {
        return levels.size
    }
}