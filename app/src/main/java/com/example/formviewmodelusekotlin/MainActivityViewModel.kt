package com.example.formviewmodelusekotlin


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    internal var resume = MutableLiveData<String>()

    init{
        resume.value= "No hay datos disponibles"
    }


    fun getUpdatedResume(name: String, lastname: String, phone:String, dni:String,age:String){
        resume.value="Nombre: $name" +"\n"+
                "Apellidos: $lastname" +"\n"+
                "Telefono: $phone "+"\n"+
                "Cedula: $dni "+"\n"+
                "Edad: $age"
    }
}
