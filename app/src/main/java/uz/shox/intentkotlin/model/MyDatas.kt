package uz.shox.intentkotlin.model

import java.io.Serializable

class MyDatas(var age:Int, var name: String?) : Serializable{

    override fun toString(): String {
        return "$age : $name"
    }
}