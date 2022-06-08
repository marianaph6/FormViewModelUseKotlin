package com.example.formviewmodelusekotlin


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer

import com.example.formviewmodelusekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.resume.observe(this, Observer {resume ->
            with(binding){
                txtResume.text= resume
                btnSubmit.setOnClickListener{
                    viewModel.getUpdatedResume(edtName.text.toString(),edtLastName.text.toString(),
                        edtPhone.text.toString(),edtDNI.text.toString(),edtAge.text.toString())
                }

            }
        })


    }
}