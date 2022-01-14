package com.mahan.pennydrop.types

data class Slot(
    val number: Int,
    val canBeFilled: Boolean = true ,
    var isFilled: Boolean = number % 2 == 0 ,
    var lastRolled: Boolean = number % 3 == 2
)
