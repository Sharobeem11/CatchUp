package com.hawkhacks.catchup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    Home()
}

@Composable
fun Home(){
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
    ) {
        Text(text = "Testing")
    }
}