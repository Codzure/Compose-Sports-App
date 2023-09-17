package com.codzure.leonard.sports.ui.theme.logics

import androidx.lifecycle.ViewModel
import com.codzure.leonard.sports.data.LocalSportsDataProvider
import com.codzure.leonard.sports.model.Sport
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class SportsMobileViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(
        SportMobileUiState(
            sportsList = LocalSportsDataProvider.getDefaultSportData(),
            currentSport = LocalSportsDataProvider.getDefaultSportData().getOrElse(0) {
                LocalSportsDataProvider.defaultSport
            }
        )
    )

    val uiState: StateFlow<SportMobileUiState> = _uiState

    fun updateCurrentSportList(selectedSport: Sport) {
        _uiState.update { it.copy(currentSport = selectedSport) }
    }

    fun navigateToListPage(){
        _uiState.update { it.copy(isShowingListPage = true) }
    }

    fun navigateToDetailPage(){
        _uiState.update { it.copy(isShowingListPage = false) }
    }

    data class SportMobileUiState(
        val sportsList: List<Sport> = emptyList(),
        val currentSport: Sport = LocalSportsDataProvider.defaultSport,
        val isShowingListPage: Boolean = true
    )
}