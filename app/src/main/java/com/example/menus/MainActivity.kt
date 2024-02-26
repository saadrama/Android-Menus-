package com.example.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mymenu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.rate ->
                Toast.makeText(this, "Rate selected",Toast.LENGTH_LONG).show()

            R.id.share ->
                Toast.makeText(this, "Share selected",Toast.LENGTH_LONG).show()
            R.id.lesson ->
                Toast.makeText(this, "Lesson selected",Toast.LENGTH_LONG).show()
            R.id.about ->
                Toast.makeText(this, "About selected",Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }
}