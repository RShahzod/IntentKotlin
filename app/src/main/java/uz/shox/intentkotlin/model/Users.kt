package uz.shox.intentkotlin.model

import java.io.Serializable

class Users(val id:Int,val name:String?) : Serializable {
    override fun toString(): String {
        return "$id : $name"
    }
}