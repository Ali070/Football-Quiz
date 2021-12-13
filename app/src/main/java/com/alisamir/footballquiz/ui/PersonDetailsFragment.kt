package com.alisamir.footballquiz.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.alisamir.footballquiz.R
import com.alisamir.footballquiz.databinding.FragmentPersonDetailsBinding

class PersonDetailsFragment : Fragment() {
    lateinit var binding: FragmentPersonDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity?)!!.supportActionBar?.hide()
    }

    override fun onStop() {
        super.onStop()
        (activity as AppCompatActivity?)!!.supportActionBar?.show()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        activity?.actionBar?.hide()
        binding = FragmentPersonDetailsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.startBtn.setOnClickListener {
            if(binding.nameInput.text.isEmpty()){
                binding.nameInput.error = "Enter name"
                binding.nameInput.requestFocus()
            }else{
                val name = binding.nameInput.text.toString().trim()
                binding.nameInput.text.clear()
                val action = PersonDetailsFragmentDirections.actionPersonDetailsFragment2ToLevelsFragment(name)
                findNavController().navigate(action)
            }
        }
    }
}