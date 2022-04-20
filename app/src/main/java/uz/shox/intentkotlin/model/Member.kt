package uz.shox.intentkotlin.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Member(val name:String?,val lastname:String?) : Parcelable {

    override fun toString(): String {
        return "$name : $lastname"
    }
}