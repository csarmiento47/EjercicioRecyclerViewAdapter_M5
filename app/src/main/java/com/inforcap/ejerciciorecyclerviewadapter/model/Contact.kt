package com.inforcap.ejerciciorecyclerviewadapter.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Contact(
    val id: Int,
    val name: String,
    val phoneNumber: String
) : Parcelable
