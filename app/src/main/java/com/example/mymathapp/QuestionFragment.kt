package com.example.mymathapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.mymathapp.databinding.FragmentQuestionBinding

class QuestionFragment : Fragment() {

    lateinit var binding: FragmentQuestionBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_question, container, false)
        binding.tvQuestion.text = generateQuestion()

        binding.btnEnd.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.action_questionFragment_to_resultFragment)
        }

        binding.btnSkip.setOnClickListener(){
           binding.tvQuestion.text = generateQuestion()
        }

        return  binding.root
    }


    fun generateQuestion():String{
        var no1 = (Math.random()*100).toInt()
        var no2 = (Math.random()*100).toInt()

        return "${no1} + ${no2} = ?"
    }

}