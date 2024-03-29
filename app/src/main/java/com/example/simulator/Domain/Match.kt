package com.example.simulator.Domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class Match (
    @SerializedName("descricao")
    val description: String,
    @SerializedName("mandante")
    val homeTeam: Team,
    @SerializedName("visitante")
    val awayTeam: Team,
    @SerializedName("local")
    val place: Place
) : Parcelable