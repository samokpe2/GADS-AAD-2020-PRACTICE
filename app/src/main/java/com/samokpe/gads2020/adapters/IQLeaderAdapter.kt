package com.samokpe.gads2020.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.iq_learner_item.view.*
import com.samokpe.gads2020.R
import com.samokpe.gads2020.models.SkillIQLeader

class IQLeaderAdapter: RecyclerView.Adapter<MainViewHolder>() {
    private var leaders: List<SkillIQLeader> = emptyList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.iq_learner_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val skillIQLeader = leaders[position]
        holder.itemView.apply {
            Glide.with(this).load(skillIQLeader.badgeUrl).into(topIQLearnerBadge)
            topIQLearnerName.text = skillIQLeader.name
            val iqAndCountry = "${skillIQLeader.score} skill IQ Score, ${skillIQLeader.country}"
            skillAndCountry.text = iqAndCountry
        }
    }

    override fun getItemCount(): Int = leaders.size

    internal fun setData(skillIQLeaders: List<SkillIQLeader>){
        leaders = skillIQLeaders
        notifyDataSetChanged()
    }
}