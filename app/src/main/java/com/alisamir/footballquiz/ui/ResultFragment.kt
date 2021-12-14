package com.alisamir.footballquiz.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.alisamir.footballquiz.R
import com.alisamir.footballquiz.databinding.FragmentResultBinding
import kotlin.properties.Delegates

class ResultFragment : Fragment() {
    lateinit var binding: FragmentResultBinding
    var result:Int = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            val args = ResultFragmentArgs.fromBundle(it)
            result = args.result
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentResultBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.returnBtn.setOnClickListener {
            findNavController().navigateUp()
        }
        if (result==1){
            binding.lotteView.setAnimation(R.raw.congratulations)
            binding.stateTv.text = "Congratulations!, You got it"
        }else if(result==0){
            binding.lotteView.setAnimation(R.raw.sorry)
            binding.stateTv.text = "Sorry, You Failed"
        }
    }

}