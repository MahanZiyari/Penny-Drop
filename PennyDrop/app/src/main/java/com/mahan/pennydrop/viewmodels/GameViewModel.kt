package com.mahan.pennydrop.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mahan.pennydrop.types.Player
import com.mahan.pennydrop.types.Slot

class GameViewModel : ViewModel() {

    private var players: List<Player> = emptyList()


    // States Of the Game

    val slots = MutableLiveData(
        (1..6).map { Slot(number = it, canBeFilled = it != 6) }
    )

    val currentPlayer = MutableLiveData<Player?>()

    val canRoll = MutableLiveData(false)
    val canPass = MutableLiveData(false)

    val currentTurnText = MutableLiveData("")
    val currentStandingText = MutableLiveData("")

    fun startGame(playersForNewGame: List<Player>) {
        this.players = playersForNewGame
        // More Logic Will be Added Here
        this.currentPlayer.value = players.firstOrNull().apply {
            this?.isRolling = true
        }
        canRoll.value = true
    }

    fun roll() {
        // Implementing later
    }

    fun pass() {
        // Implementing later
    }
}