package com.example.showcaseforbaseactivity

import android.os.Bundle

class MainActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResId)
    }
}