package com.example.mymathapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.mymathapp.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    lateinit var binding : FragmentResultBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_result, container, false)


        binding.btnOK.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.action_registerFragment_to_questionFragment)
        }


        return binding.root
    }


}