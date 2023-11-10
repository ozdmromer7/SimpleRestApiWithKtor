package com.example.routes

import com.example.data.model.FootballTeam
import com.example.data.model.TechnicalInfo
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*



private const val BASE_URL = "http://192.168.1.89:8080"
private val footballTeamList = listOf(
    FootballTeam("Fenerbahce","$BASE_URL/teams/fb.png","Fenerbahçe is the best team in Turkey",
        TechnicalInfo("İsmail Kartal","Edin Dzeko")),
    FootballTeam("Galatasaray","$BASE_URL/teams/gs.png","Galatasaray Aş.",
        TechnicalInfo("Okan Buruk","Mauro İcardi")),
    FootballTeam("Beşiktas","$BASE_URL/teams/bjk.png","BJK",
        TechnicalInfo("Burak Yılmaz","Vincent Aboubakar")),
    FootballTeam("Trabzonspor","$BASE_URL/teams/ts.png","TS",
        TechnicalInfo("Abdullah Avcı","Bakasetas")),
    FootballTeam("Barcelona","$BASE_URL/teams/barca.png","Barça",
        TechnicalInfo("Xavi","Lionel Messi")),
    FootballTeam("Real Madrid","$BASE_URL/teams/rma.png","Hala Madrid!",
        TechnicalInfo("Carlo Ancelotti","Cristiano Ronaldo"))
)

fun Route.randomTeam(){

   get("/randomFootballTeam"){

       call.respond(
           HttpStatusCode.OK,
           footballTeamList
       )
   }
}