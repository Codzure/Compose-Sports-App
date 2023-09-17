package com.codzure.leonard.sports

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.codzure.leonard.sports.ui.theme.SportsTheme
import com.codzure.leonard.sports.ui.theme.logics.SportMobileScreen

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SportsTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    val windowSize = calculateWindowSizeClass(this@MainActivity)
                    SportMobileScreen(
                        windowSizeClass = windowSize.widthSizeClass,
                        onBackPressed = { finish() }
                    )
                }
            }
        }
    }
}