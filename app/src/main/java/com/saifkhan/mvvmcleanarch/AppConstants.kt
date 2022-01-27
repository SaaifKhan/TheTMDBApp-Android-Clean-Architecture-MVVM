package com.saifkhan.mvvmcleanarch

import androidx.annotation.StringDef

object AppConstants {
    @StringDef(ApiConfiguration.BASE_URL)
    annotation class ApiConfiguration {
        companion object {
            const val BASE_URL = "https://fakestoreapi.com"
        }
    }
}