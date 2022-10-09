package com.example.lovecalculate.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.lovecalculate.lovecalculate.Repository
import com.example.lovecalculate.lovecalculate.data.models.LoveModel

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoveViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    fun getLiveLoveModel(firstName: String, secondName: String): LiveData<LoveModel> {
        return repository.getLoveModelMutableLiveData(firstName, secondName)
    }
}