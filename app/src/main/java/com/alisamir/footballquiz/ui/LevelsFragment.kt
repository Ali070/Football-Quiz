package com.alisamir.footballquiz.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.alisamir.footballquiz.R
import com.alisamir.footballquiz.data.LevelsAdapter
import com.alisamir.footballquiz.databinding.FragmentLevelsBinding
import com.alisamir.footballquiz.pojo.level

class LevelsFragment : Fragment() {
    lateinit var binding: FragmentLevelsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLevelsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val controller = Navigation.findNavController(view)


        val levels = ArrayList<level>()
        levels.add(level("From photo, What is the name of this player ?",R.drawable.player_name))
        levels.add(level("Which team has this logo ?",R.drawable.team_logo))
        levels.add(level("What is the name of this skill",R.drawable.skill))
        levels.add(level("Easy questions on football history",R.drawable.easy))
        levels.add(level("Medium questions on football history",R.drawable.medium))
        levels.add(level("Hard questions on football history",R.drawable.angry))
        val myAdapter = LevelsAdapter(levels)
        myAdapter.setOnItemClickLisner(object :LevelsAdapter.onItemClickListner{
            override fun onClick(position: Int) {
                Toast.makeText(context, levels.get(position).levelTitle, Toast.LENGTH_SHORT).show()
            }

        })
        binding.recyclerView.adapter = myAdapter
        binding.recyclerView.layoutManager = GridLayoutManager(context,2)
        /*arguments?.let {
            val args = LevelsFragmentArgs.fromBundle(it)
            binding.textView.text = "Welcome ${args.name}"
        }*/
    }

}