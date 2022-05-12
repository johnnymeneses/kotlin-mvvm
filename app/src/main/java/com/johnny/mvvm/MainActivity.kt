package com.johnny.mvvm


import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.johnny.mvvm.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

//    private lateinit var mContext: Context
    private lateinit var binding: ActivityMainBinding
    private lateinit var mMainViewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()

        //Instanciar ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        mMainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
//
//
//        // Variáveis
//        this.mContext = this
//        this.mMainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

//
//        // Eventos
//        binding.buttonLogin.setOnClickListener(this)
//
//        // Inicializa observers
//        this.createObservers()

          setObserver()
    }


    fun setObserver() {
        mMainViewModel.welcome().observe(this, Observer {
            binding.textWelcome.text = it
        })
    }



//    override fun onClick(view: View?) {
//        val name = binding.editName.text.toString()
//        this.mMainViewModel.doLogin(name)
//    }
//
//    fun createObservers() {
//        mMainViewModel.welcome().observe(this, Observer {
//            binding.textWelcome.text = it
//        })
//        mMainViewModel.login().observe(this, Observer {
//            Toast.makeText(mContext, it, Toast.LENGTH_SHORT).show()
//        })
//    }
//
}