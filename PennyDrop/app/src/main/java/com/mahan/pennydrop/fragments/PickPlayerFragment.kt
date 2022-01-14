package com.mahan.pennydrop.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.mahan.pennydrop.R
import com.mahan.pennydrop.databinding.FragmentPickPlayerBinding
import com.mahan.pennydrop.viewmodels.GameViewModel
import com.mahan.pennydrop.viewmodels.PickPlayersViewModel


class PickPlayerFragment : Fragment() {

    private lateinit var binding: FragmentPickPlayerBinding
    private val pickPlayersViewModel by activityViewModels<PickPlayersViewModel>()
    private val gameViewModel by activityViewModels<GameViewModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPickPlayerBinding.inflate(
            layoutInflater,
            container,
            false
        ).apply {
            this.vm = pickPlayersViewModel

            this.buttonPlayGame.setOnClickListener {
                gameViewModel.startGame(
                    playersForNewGame = pickPlayersViewModel.players.value?.filter { it.isIncluded.get() }
                        ?.map { it.toPlayer() } ?: emptyList()
                )

                findNavController().navigate(R.id.pickPlayersFragment)
            }
        }
        return binding.root
    }

}