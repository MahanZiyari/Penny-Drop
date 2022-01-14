package com.mahan.pennydrop.binding

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter ("isHidden")
fun bindIsHidden(view: View, isVisible: Boolean) {
    view.visibility = if (isVisible) View.INVISIBLE else View.VISIBLE
}