package com.example.routes

import com.example.data.model.FootballTeam
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*



private const val BASE_URL = "http://192.168.1.57:8080"
private val footballTeamList = listOf(
    FootballTeam("Fenerbahce","$BASE_URL/teams/fb.png","Fenerbahçe is the best team in Turkey"),
    FootballTeam("Galatasaray","$BASE_URL/teams/gs.png","Galatasaray Aş."),
    FootballTeam("Beşiktas","$BASE_URL/teams/bjk.png","BJK"),
    FootballTeam("Trabzonspor","$BASE_URL/teams/ts.png","TS"),
)

fun Route.randomTeam(){

   get("/randomFootballTeam"){

       call.respond(
           HttpStatusCode.OK,
           footballTeamList.random()
       )
   }
}