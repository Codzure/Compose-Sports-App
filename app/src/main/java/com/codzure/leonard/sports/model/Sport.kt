package com.codzure.leonard.sports.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Sport(
    val id: Int,
    val playerCount: Int,
    val olympic: Boolean,
    @StringRes val titleResourceId: Int,
    @StringRes val subtitleResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @DrawableRes val sportsImageBanner: Int,
    @StringRes val sportDetails: Int
)