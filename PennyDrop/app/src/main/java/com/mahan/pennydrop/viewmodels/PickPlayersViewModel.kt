package com.mahan.pennydrop.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mahan.pennydrop.types.NewPlayer

class PickPlayersViewModel : ViewModel() {
    val players = MutableLiveData<List<NewPlayer>>().apply {
        this.value = (1..6).map { index ->
            NewPlayer(
                canBeRemoved = index > 2,
                canBeToggled = index > 1
            )
        }
    }
}