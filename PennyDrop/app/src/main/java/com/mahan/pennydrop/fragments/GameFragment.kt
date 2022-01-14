package com.mahan.pennydrop.fragments

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.mahan.pennydrop.databinding.FragmentGameBinding
import com.mahan.pennydrop.viewmodels.GameViewModel


class GameFragment : Fragment() {


    private lateinit var binding: FragmentGameBinding
    private val gameViewModel by activityViewModels<GameViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGameBinding.inflate(layoutInflater, container, false).apply {
            vm = gameViewModel

            textCurrentTurnInfo.movementMethod = ScrollingMovementMethod()
            lifecycleOwner = viewLifecycleOwner
        }
        return binding.root
    }

}