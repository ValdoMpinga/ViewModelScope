package com.example.viewmodelscope

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.viewmodelscope.model.User
import com.example.viewmodelscope.model.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivityViewModel : ViewModel()
{
    private var userRepository = UserRepository()
    var users : MutableLiveData<List<User>> = MutableLiveData()

    fun getUserData()
    {
        viewModelScope.launch {
            //Code
            var result: List<User>?
            withContext(Dispatchers.IO) {
                result = userRepository.getUSers()
            }

            users.value = result

        }
    }


}