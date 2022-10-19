package com.example.mvvm_navigator.navigator

import androidx.annotation.StringRes
import com.example.mvvm_navigator.screen.base.BaseScreen

interface Navigator {

    fun launch(screen: BaseScreen)

    fun goBack(result: Any? = null)

    fun toast(@StringRes messageRes: Int)

    fun getString(@StringRes messageRes: Int): String

}