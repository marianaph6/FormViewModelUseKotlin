package com.example.formviewmodelusekotlin

import androidx.lifecycle.ViewModel
import com.example.formviewmodelusekotlin.commons.FormUser

class MainActivityViewModel : ViewModel() {

    private var resume = "No hay datos disponibles"

    fun getCurrentResume(): String{
        return resume
    }

    fun getUpdatedResume(infoFormUser: FormUser){
        resume= "Nombre:" +infoFormUser.name +"\n"+
                "Apellidos:" +infoFormUser.lastname+"\n"+
                "Telefono:" + infoFormUser.phone +"\n"+
                "Cedula:" +infoFormUser.DNI +"\n"+
                "Edad:" + infoFormUser.age
    }
}
