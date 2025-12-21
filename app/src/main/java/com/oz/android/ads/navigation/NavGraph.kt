package com.oz.android.ads.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.oz.android.ads.screens.banner_ads.BannerAdsExampleScreen
import com.oz.android.ads.screens.home.HomeScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(Screen.BannerAdsExample.route) {
            BannerAdsExampleScreen()
        }
    }
}
