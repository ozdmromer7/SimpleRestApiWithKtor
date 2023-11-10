package com.example.data.model

import kotlinx.serialization.Serializable


@Serializable
data class TechnicalInfo(
    private val coach : String,
    private val bestPlayer:String
)
