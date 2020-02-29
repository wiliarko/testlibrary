package com.wili.toast

import android.content.Context
import android.widget.Toast

class Pop{
    fun toast(c: Context, s: String){
        Toast.makeText(c,s,Toast.LENGTH_LONG).show()
    }
}