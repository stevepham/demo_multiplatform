package com.ht117.demomp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity(), CoroutineScope {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvHello.text = getMessage()

        btnLoad.setOnClickListener {
            launch {
                val text = callApi()
                withContext(Dispatchers.Main) {
                    tvHello.text = text
                }
            }
        }
    }

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.IO
}