package com.example.alertdialogbox

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        val showButton:Button=findViewById(R.id.showButton)
        showButton.setOnClickListener {
            showAlertDialog()
        }

    }
    private fun showAlertDialog(){
        val builder=AlertDialog.Builder(this)
        builder.setTitle("SnapChat").setMessage("Do you want to install the app")
            .setPositiveButton("Yes"){
                dialog, whisch ->
                Toast.makeText(this,"The app is successfully uninstalled",Toast.LENGTH_SHORT).show()

            }
            .setNegativeButton("No"){
                dialog, which ->
                dialog.dismiss()
            }
        val alertDialog:AlertDialog=builder.create()
        alertDialog.show()
    }
}