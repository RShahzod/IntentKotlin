package uz.shox.intentkotlin.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class User(val id:Int,val name:String?) :Parcelable {
    override fun toString(): String {
        return "$id : $name"
    }
}