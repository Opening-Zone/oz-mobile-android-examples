package com.oz.android.ads.screens.banner_ads

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.viewmodel.compose.viewModel
import com.oz.android.ads.oz_ads.ads_component.ads_inline.admob.OzAdmobBannerAd

@Composable
fun BannerAdsExampleScreen(
    viewModel: BannerAdsViewModel = viewModel()
) {
    val context = LocalContext.current
    val bannerAds = remember {
        listOf(
            OzAdmobBannerAd(context).apply {
                setAdUnitId("banner_1", "ca-app-pub-3940256099942544/6300978111")
                setPreloadKey("banner_1")
            },
            OzAdmobBannerAd(context).apply {
                setAdUnitId("banner_2", "ca-app-pub-3940256099942544/6300978111")
                setPreloadKey("banner_2")
                setRefreshTime(30000)
            }
        )
    }

    DisposableEffect(Unit) {
        viewModel.setBannerAds(bannerAds)
        onDispose {
            bannerAds.forEach { it.destroy() }
        }
    }

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(bannerAds) { ad ->
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = if (ad.getRefreshTime() > 0) "Refreshing Banner Ad" else "Normal Banner Ad")
                AndroidView(
                    factory = { ad },
                )
                Button(onClick = { viewModel.refreshAd(ad) }) {
                    Text(text = "Refresh Ad")
                }
            }
        }
    }
}
