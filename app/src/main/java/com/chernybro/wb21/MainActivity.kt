package com.chernybro.wb21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chernybro.wb21.databinding.ActivityDialogBinding
import com.chernybro.wb21.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.fab.setOnClickListener {
            startActivity(Intent(this, DialogActivity::class.java))
        }
    }


    override fun onRestart() {
        super.onRestart()
        Timber.d("${this.localClassName} onRestart")
    }

    override fun onStart() {
        super.onStart()
        Timber.d("${this.localClassName} onStart")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("${this.localClassName} onResume")
    }


    override fun onPause() {
        super.onPause()
        Timber.d("${this.localClassName} onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("${this.localClassName} onDestroy")
    }
}