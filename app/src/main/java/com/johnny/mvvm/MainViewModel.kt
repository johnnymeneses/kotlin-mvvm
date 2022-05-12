package com.johnny.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel : ViewModel() {

    private var mTextWelcome = MutableLiveData<String>()
    private var login = MutableLiveData<Boolean>()
    private val personRepository = PersonRepository()

    init {
        mTextWelcome.value = "Bom dia!"
    }


    //Expondo a variavel privada mTextWelcome
    fun welcome(): LiveData<String> {
        return mTextWelcome
    }

    fun login() :LiveData<Boolean>{
        return login
    }

    fun doLogin(email:String, password:String){
            login.value = personRepository.login(email,password)
    }


}