package com.example.ejemplo1.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun NavManager() {
    val navController = rememberNavController()
    NavHost(navCOntroller = navController, startDestination ="Home") {
        composable("Home")
    }
}