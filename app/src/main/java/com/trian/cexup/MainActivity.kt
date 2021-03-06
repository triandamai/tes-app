package com.trian.cexup


import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.insets.ExperimentalAnimatedInsets
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.pager.ExperimentalPagerApi
import com.trian.component.*
import com.trian.component.ui.theme.TesMultiModuleTheme
import dagger.hilt.android.AndroidEntryPoint


/**
 * Main Activity
 * Author Trian Damai Project
 * Created by Trian Damai
 * 28/08/2021
 **/


@ExperimentalMaterialNavigationApi
@ExperimentalAnimationApi
@ExperimentalPagerApi
@ExperimentalFoundationApi
@ExperimentalComposeUiApi
@ExperimentalAnimatedInsets
@RequiresApi(Build.VERSION_CODES.O)
@ExperimentalMaterialApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TesMultiModuleTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "login" ){
                    composable("login"){
                        Login(navController= navController)
                    }
                    composable("Explore"){
                        Explore()
                    }
                    composable("Signup"){
                        Signup(navController = navController)
                    }
                    composable("Homescreen"){
                        HomeScreenUI(navController = navController)
                    }
                    composable(NavigationItem.Explore.route){
                        Explore()
                    }
                    composable(NavigationItem.Home.route) {

                    }
                    composable(NavigationItem.Shop.route){

                    }
                    composable(NavigationItem.Cart.route){

                    }
                    composable(NavigationItem.Account.route){

                    }


                }
            }
        }
    }
}


