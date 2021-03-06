package com.enzhongwen.hanyu2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.enzhongwen.hanyu2.databinding.FragmentExerciseBinding

class ExerciseFragment: Fragment() {

    lateinit var binding: FragmentExerciseBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentExerciseBinding.inflate(inflater,container,false)
        return binding.root
    }
}