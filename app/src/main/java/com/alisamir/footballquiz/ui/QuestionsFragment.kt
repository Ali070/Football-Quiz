package com.alisamir.footballquiz.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.alisamir.footballquiz.R
import com.alisamir.footballquiz.databinding.FragmentQuestionsBinding

class QuestionsFragment : Fragment() {
    lateinit var binding: FragmentQuestionsBinding
    var level:Int = 0
    var questionsNumber = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            val args = QuestionsFragmentArgs.fromBundle(it)
            level = args.level
            questionsNumber = args.questions
        }
    }

    override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity?)!!.supportActionBar?.hide()
        (activity as AppCompatActivity?)!!.findViewById<DrawerLayout>(R.id.drawerLayout).setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
    }

    override fun onStop() {
        super.onStop()
        (activity as AppCompatActivity?)!!.supportActionBar?.show()
        (activity as AppCompatActivity?)!!.findViewById<DrawerLayout>(R.id.drawerLayout).setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentQuestionsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(level==1 || level==2 || level==3){
            binding.cardQuestion.visibility = View.VISIBLE
            if (level==1){

            }
        }else if(level==4 || level==5 || level==6){
            binding.textQuestion.visibility = View.VISIBLE
        }
    }

}