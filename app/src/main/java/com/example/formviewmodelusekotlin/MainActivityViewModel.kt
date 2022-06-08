package com.example.formviewmodelusekotlin


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var _resume = MutableLiveData<String>()

    /*
    * Por fuera es accedido (solo lectura), y solo puede ser cambiado
    * por el viewModel
    */

    /*
    * Crear viewModel con LiveData (mini encapsulación, las clases que lo
    * suscriben no pueden modificar)
    */
    internal  val resume: LiveData<String>
        get()=_resume

    /*
    * Por buenas practicas hay que encapsular la info
    * internal var resume = MutableLiveData<String>()
    */

    init{
        _resume.value= "No hay datos disponibles"
    }


    fun getUpdatedResume(name: String, lastname: String, phone:String, dni:String,age:String){
        _resume.value="Nombre: $name" +"\n"+
                "Apellidos: $lastname" +"\n"+
                "Telefono: $phone "+"\n"+
                "Cedula: $dni "+"\n"+
                "Edad: $age"
    }
}
