package com.mahan.pennydrop.types

import androidx.databinding.ObservableBoolean
import com.mahan.pennydrop.game.Ai

data class NewPlayer(
    var playerName: String = "",
    val isHuman: ObservableBoolean = ObservableBoolean(true),
    val canBeRemoved: Boolean = true,
    val canBeToggled: Boolean = true,
    var isIncluded: ObservableBoolean = ObservableBoolean(!canBeRemoved),
    var selectedAiPosition: Int = -1
) {
    private fun selectedAi() = if (isHuman.get()) {
        Ai.basicAi.getOrNull(selectedAiPosition)
    } else {
        null
    }

    fun toPlayer(): Player {
        return Player(
            playerName = if (this.isHuman.get()) this.playerName else this.selectedAi()?.name ?: "AI",
            isHuman = this.isHuman.get(),
            selectedAi = this.selectedAi()
        )
    }
}
