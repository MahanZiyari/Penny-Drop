package com.mahan.pennydrop.game

data class Ai(val name: String) {

    override fun toString(): String = name

    companion object {
        @JvmStatic
        val basicAi = listOf<Ai>(
            Ai("TwoFace"),
            Ai("No Go Noah"),
            Ai("Bail Out Beulah"),
            Ai("Fearful Fred"),
            Ai("Even Steven"),
            Ai("Riverboat Ron"),
            Ai("Sammy Sixes"),
            Ai("Random Rachael")
        )
    }
}