package com.example.navigasi.view

import android.service.controls.Control
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

enum class Navigasi {

    Formulirku,

    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
){
}