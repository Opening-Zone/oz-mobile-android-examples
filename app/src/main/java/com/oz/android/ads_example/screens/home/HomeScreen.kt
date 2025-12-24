package com.oz.android.ads_example.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.oz.android.ads_example.navigation.Screen

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { navController.navigate(Screen.BannerAdsExample.route) }) {
            Text(text = "Banner Ads Example")
        }
        Button(onClick = { navController.navigate(Screen.NativeAdsExample.route) }) {
            Text(text = "Native Ads Example")
        }
        Button(onClick = { navController.navigate(Screen.InterstitialAdsExample.route) }) {
            Text(text = "Interstitial Ads Example")
        }
        Button(onClick = { navController.navigate(Screen.AppOpenAdsExample.route) }) {
            Text(text = "App Open Ads Example")
        }
    }
}
