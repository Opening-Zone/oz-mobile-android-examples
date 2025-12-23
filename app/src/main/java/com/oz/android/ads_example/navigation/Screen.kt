package com.oz.android.ads_example.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object BannerAdsExample : Screen("banner_ads_example")
    object NativeAdsExample : Screen("native_ads_example")
}
