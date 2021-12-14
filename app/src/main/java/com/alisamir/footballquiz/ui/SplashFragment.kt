package com.alisamir.footballquiz.ui

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.findNavController
import com.alisamir.footballquiz.R
import com.alisamir.footballquiz.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {
    lateinit var binding: FragmentSplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity?)!!.findViewById<DrawerLayout>(R.id.drawerLayout).setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
        (activity as AppCompatActivity?)!!.supportActionBar?.hide()
        (activity as AppCompatActivity?)!!.window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
    }

    override fun onStop() {
        super.onStop()
        (activity as AppCompatActivity?)!!.findViewById<DrawerLayout>(R.id.drawerLayout).setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
        (activity as AppCompatActivity?)!!.supportActionBar?.show()
        (activity as AppCompatActivity?)!!.window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSplashBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val title1Animation = AnimationUtils.loadAnimation(context,R.anim.title1_anim)
        val title2Animation = AnimationUtils.loadAnimation(context,R.anim.title2_anim)
        val backAnimation = AnimationUtils.loadAnimation(context,R.anim.back_anim)
        binding.footballTv.startAnimation(title1Animation)
        binding.quizTv.startAnimation(title2Animation)
        title2Animation.setAnimationListener(object:Animation.AnimationListener{
            override fun onAnimationStart(p0: Animation?) {
            }

            override fun onAnimationEnd(p0: Animation?) {
                binding.frameLayout.startAnimation(backAnimation)
            }

            override fun onAnimationRepeat(p0: Animation?) {
            }

        })
        backAnimation.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(p0: Animation?) {
            }

            override fun onAnimationEnd(p0: Animation?) {
                val action = SplashFragmentDirections.actionSplashFragmentToPersonDetailsFragment2()
                findNavController().navigate(action)
            }

            override fun onAnimationRepeat(p0: Animation?) {
            }

        })
    }
}