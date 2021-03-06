package com.example.harrypottercaracters.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.harrypottercaracters.data.repository.CharactersRepository
import com.example.harrypottercaracters.ui.mainactivity.CharactersViewModel

class CharactersViewModelFactory(
    private val repository: CharactersRepository
) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CharactersViewModel(repository) as T
    }

}