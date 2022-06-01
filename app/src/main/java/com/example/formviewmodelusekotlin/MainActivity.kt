package com.example.formviewmodelusekotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.formviewmodelusekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    //@SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            txtResume.text= "No hay datos disponibles"
            btnSubmit.setOnClickListener{
                val actualValue= txtResume.text
                txtResume.text= "Nombre: " +edtName.text  +"\n"+
                        "Apellidos: "+edtLastName.text +"\n"+
                        "Telefono: "+ edtPhone.text +"\n"+
                        "Cedula: "+ edtDNI.text +"\n"+
                         "Edad: "+edtAge.text
            }

        }
    }
}