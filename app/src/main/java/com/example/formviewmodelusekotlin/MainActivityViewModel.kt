package com.example.formviewmodelusekotlin

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var resume = "No hay datos disponibles"

    fun getCurrentResume(): String{
        return resume
    }

    fun getUpdatedResume(name: String, lastname: String, phone:String, dni:String,age:String){
        resume="Nombre: $name" +"\n"+
        "Apellidos: $lastname" +"\n"+
                "Telefono: $phone "+"\n"+
                "Cedula: $dni "+"\n"+
                "Edad: $age"


    }
}
