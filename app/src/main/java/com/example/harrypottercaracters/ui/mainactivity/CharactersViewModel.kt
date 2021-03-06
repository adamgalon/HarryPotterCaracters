package com.example.harrypottercaracters.ui.mainactivity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.harrypottercaracters.data.models.CharactersItem
import com.example.harrypottercaracters.data.repository.CharactersRepository
import com.example.harrypottercaracters.utils.Resource
import kotlinx.coroutines.launch

class CharactersViewModel(
    private val repository: CharactersRepository
) : ViewModel() {
    

    val getAllCharacters = repository.getAllCharacters()


    val getAll = repository.getAll

    val getByStudent = repository.byStudents

    val getStaff = repository.getStaff

    fun getByHouse(name: String): LiveData<List<CharactersItem>> {
        return repository.getByHouse(name)
    }


}