package com.example.assignmentn6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavArgument
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.fragment)
        bottomNavigationView.setupWithNavController(navController)

//        val onDestinationChangedListener = NavController.OnDestinationChangedListener { controller, destination, arguments ->
//            when (destination.id) {
//                R.id.allInfoFragment -> {
//                    destination.arguments["firstNameArgument", NavArgument.Builder().)
//                }
//            }
//        }
//        navController.addOnDestinationChangedListener(onDestinationChangedListener)
    }
}