package com.alisamir.footballquiz.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.alisamir.footballquiz.R
import com.alisamir.footballquiz.databinding.FragmentLevelsBinding

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
        arguments?.let {
            val args = LevelsFragmentArgs.fromBundle(it)
            binding.textView.text = "Welcome ${args.name}"
        }
    }

}