package com.loc.newsapp.presentation.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.loc.newsapp.domain.usecases.AppEntryUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OnBoardingViewModel @Inject constructor(
    private val useCases: AppEntryUseCases
) : ViewModel() {

    fun onEvent(event: OnBoardingEvent) {
        when (event) {
            OnBoardingEvent.OnSaveAppEntryEvent -> {
                onSaveAppEntry()
            }
        }
    }

    private fun onSaveAppEntry() {
        viewModelScope.launch {
            useCases.saveAppEntry()
        }
    }
}