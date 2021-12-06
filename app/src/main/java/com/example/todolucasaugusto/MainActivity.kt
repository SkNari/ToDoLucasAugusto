package com.example.todolucasaugusto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todolucasaugusto.tasklist.TaskListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}