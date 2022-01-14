package com.mahan.pennydrop.types

import com.mahan.pennydrop.game.Ai

data class Player(
    val playerName: String = "",
    val isHuman: Boolean = true,
    val selectedAi: Ai? = null
) {
    var pennies: Int = defaultPennyCount
    var isRolling: Boolean = false

    fun addPennies(count: Int = 1) {
        pennies += count
    }

    companion object {
        const val defaultPennyCount = 10
    }
}
