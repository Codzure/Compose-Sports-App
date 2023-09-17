package com.codzure.leonard.sports.ui.theme.logics

import androidx.compose.material3.Scaffold
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.codzure.leonard.sports.util.SportsContentType


@Composable
fun SportMobileScreen(
    windowSizeClass: WindowWidthSizeClass,
    onBackPressed: () -> Unit
) {
    val viewModel: SportsMobileViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    val contentType = when (windowSizeClass) {
        WindowWidthSizeClass.Compact,
        WindowWidthSizeClass.Medium -> SportsContentType.ListOnly
        WindowWidthSizeClass.Expanded -> SportsContentType.ListAndDetail

        else -> SportsContentType.ListOnly
    }

    Scaffold(
        topBar = {
            SportMobileBar(
                isShowingListPage = uiState.isShowingListPage
            )
        }
    )
}

@Composable
fun SportMobileBar(
    onBackButtonClick: () -> Unit,
    isShowingListPage: Boolean,
    windowSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier
) {

}
