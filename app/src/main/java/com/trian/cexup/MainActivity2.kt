package com.trian.cexup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.trian.component.Login
import com.trian.component.navigation.HomeScreen
import com.trian.component.ui.theme.TesMultiModuleTheme

class MainActivity2 : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TesMultiModuleTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "login" ){
                    composable("login"){
                        Login(navController= navController)
                    }

                }
            }
        }
    }
}