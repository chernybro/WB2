package com.chernybro.wb21

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.chernybro.wb21.databinding.ActivityDialogBinding
import timber.log.Timber


class DialogActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("${this.localClassName} onCreate")
        binding = ActivityDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val builder = configureAndShowDialog()

        binding.fab.setOnClickListener {
            builder.show()
        }

    }

    private fun configureAndShowDialog(): AlertDialog.Builder {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(R.string.dialog_title)
            .setMessage(R.string.dialog_about_message)
            .setCancelable(true)
            .setPositiveButton(R.string.ok) { dialog, _ ->
                dialog.dismiss()
            }
        return builder
    }

    override fun onRestart() {
        super.onRestart()
        Timber.d("${this.localClassName}  onRestart")
    }

    override fun onStart()           {
        super.onStart()
        Timber.d("${this.localClassName}  onStart")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("${this.localClassName}  onResume")
    }


    override fun onPause() {
        super.onPause()
        Timber.d("${this.localClassName}  onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("${this.localClassName}  onDestroy")
    }
}