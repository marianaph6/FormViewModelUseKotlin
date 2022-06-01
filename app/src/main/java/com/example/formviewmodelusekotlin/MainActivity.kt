package com.example.formviewmodelusekotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.formviewmodelusekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    //@SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel= ViewModelProvider(this).get(MainActivityViewModel::class.java)

        with(binding){

            //Inicializar
            txtResume.text= viewModel.getCurrentResume()
            btnSubmit.setOnClickListener{
                val actualValue= txtResume.text

                viewModel.getUpdatedResume(edtName.text.toString(),edtLastName.text.toString(),
                    edtPhone.text.toString(),edtDNI.text.toString(),edtAge.text.toString())
                txtResume.text= viewModel.getCurrentResume()
            }

        }
    }
}