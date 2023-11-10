package com.example.data.model

import kotlinx.serialization.Serializable

@Serializable
data class FootballTeam(
    private val teamName:String,
    private val imageUrl:String,
    private val description:String,
    private val technicalInfo:TechnicalInfo
)