package uz.shox.intentkotlin.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MyDat(val age:Int,val name:String) : Parcelable{

    override fun toString(): String {
        return "$age : $name"
    }
}
