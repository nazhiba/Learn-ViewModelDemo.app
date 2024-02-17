package com.nazhiba.viewmodaldemo

import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
    var count = 0
    fun updateCount(){
        ++count
    }
}