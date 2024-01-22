package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf<Page>(
    Page(
        title = "Lorem ipsum dolor sit amet",
        description = "consectetur adipiscing elit. Nullam in sem in nisl vehicula tincidunt. Mauris quis lorem ut erat",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Lorem ipsum dolor sit amet",
        description = "consectetur adipiscing elit. Nullam in sem in nisl vehicula tincidunt. Mauris quis lorem ut erat",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Lorem ipsum dolor sit amet",
        description = "consectetur adipiscing elit. Nullam in sem in nisl vehicula tincidunt. Mauris quis lorem ut erat",
        image = R.drawable.onboarding3
    )
)