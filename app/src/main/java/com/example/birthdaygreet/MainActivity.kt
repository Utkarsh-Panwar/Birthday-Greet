package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {

        val name = nameInput72.editableText.toString()
        /*val name = nameInput72.editableText.toString()
        Toast.makeText(this,"Name is $name", Toast.LENGTH_LONG).show()*/

        val intent= Intent(this,BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name) //Key Value Pair
        startActivity(intent)
    }

    /*override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }                                     //ADVANCED PROPERTIES

    override fun onStart() {
        super.onStart()
    }

    override fun onDestroy() {
          super.onDestroy()
    }*/

}