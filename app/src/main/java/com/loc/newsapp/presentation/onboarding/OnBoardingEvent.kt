package com.loc.newsapp.presentation.onboarding

sealed class OnBoardingEvent {
    object OnSaveAppEntryEvent: OnBoardingEvent()
}