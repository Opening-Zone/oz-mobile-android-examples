package com.oz.android.ads

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.oz.android.ads.navigation.NavGraph
import com.oz.android.ads.ui.theme.OzAdmobTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OzAdmobTheme {
                NavGraph()
            }
        }
    }
}