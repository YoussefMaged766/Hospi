package com.example.myapplication.fragment.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentChoicePageBinding

class ChoicePageFragment : Fragment() {

    private lateinit var binding: FragmentChoicePageBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChoicePageBinding.inflate(inflater, container, false)

        binding.doctor.setOnClickListener {
            findNavController().navigate(R.id.action_choicePage_to_loginD)
        }
        binding.patient.setOnClickListener {
            findNavController().navigate(R.id.action_choicePage_to_main)
        }

        return binding.root
    }

}