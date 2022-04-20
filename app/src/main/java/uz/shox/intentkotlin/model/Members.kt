package uz.shox.intentkotlin.model

import java.io.Serializable

class Members(val name:String?,val lastname:String?) : Serializable{

    override fun toString(): String {
        return "$lastname : $name"
    }
}