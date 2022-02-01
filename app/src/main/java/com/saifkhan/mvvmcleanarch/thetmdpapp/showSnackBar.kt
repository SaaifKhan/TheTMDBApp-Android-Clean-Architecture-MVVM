package com.saifkhan.mvvmcleanarch.thetmdpapp

import android.view.View
import com.google.android.material.snackbar.Snackbar

fun View.showSnackBar(
    message: String,
    duration: Int = Snackbar.LENGTH_INDEFINITE,
    action: String = "",
): Snackbar {
    val snackbar = Snackbar.make(this, message, duration)
    if (action != "") {
        snackbar.duration = Snackbar.LENGTH_INDEFINITE
        snackbar.setAction(action) {
            snackbar.dismiss()
        }
    }
    snackbar.show()
    return snackbar
}