package com.alisamir.footballquiz.ui

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.alisamir.footballquiz.R
import com.alisamir.footballquiz.data.LevelsAdapter
import com.alisamir.footballquiz.databinding.FragmentLevelsBinding
import com.alisamir.footballquiz.pojo.level
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.navigation.NavigationView

class LevelsFragment : Fragment() {
    lateinit var binding: FragmentLevelsBinding
    var numberOfQuestions:Int = 0
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

        val dialog = BottomSheetDialog(view.context)
        val levels = ArrayList<level>()
        levels.add(level("From photo, What is the name of this player ?",R.drawable.player_name,1))
        levels.add(level("Which team has this logo ?",R.drawable.team_logo,2))
        levels.add(level("Questions on football rules ?",R.drawable.easy,3))
        levels.add(level("Easy questions on football history",R.drawable.easy,4))
        levels.add(level("Medium questions on football history",R.drawable.medium,5))
        levels.add(level("Hard questions on football history",R.drawable.angry,6))
        val myAdapter = LevelsAdapter(levels)
        myAdapter.setOnItemClickLisner(object :LevelsAdapter.onItemClickListner{
            override fun onClick(position: Int) {
                val levelId = levels.get(position).id
                val dialogView = layoutInflater.inflate(R.layout.bottom_sheet_layout,null)
                val startBtn = dialogView.findViewById<Button>(R.id.startBtn)
                dialog.setContentView(dialogView)
                dialog.show()
                startBtn.setOnClickListener {
                    val id = dialogView.findViewById<RadioGroup>(R.id.numberOfQuesionsGroup).checkedRadioButtonId
                    when(id){
                        R.id.quesions_5->numberOfQuestions = 5
                        R.id.quesions_10->numberOfQuestions = 10
                        R.id.quesions_15->numberOfQuestions = 15
                    }
                    dialog.dismiss()
                    val action = LevelsFragmentDirections.actionLevelsFragmentToQuestionsFragment3(levelId,numberOfQuestions)
                    findNavController().navigate(action)
                }
            }

        })
        binding.recyclerView.adapter = myAdapter
        binding.recyclerView.layoutManager = GridLayoutManager(context,2)
        val drawer = activity?.findViewById<NavigationView>(R.id.drawer)
        val name = drawer?.getHeaderView(0)?.findViewById<TextView>(R.id.personName)
        arguments?.let {
            val args = LevelsFragmentArgs.fromBundle(it)
            name?.text = args.name
        }
    }

}