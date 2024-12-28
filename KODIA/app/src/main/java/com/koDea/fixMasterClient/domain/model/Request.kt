package com.koDea.fixMasterClient.domain.model

data class Request (
    var ClientId:String="",
    var HandymanID:String="",
    var Title:String="",
    var Description:String="",
    var Wilaya:String="",
    var City:String="",
    var Street:String="",
    var Day:String="",
    var Hour:String="",
    var Budget:Int=0,
    var Latitude : Double = 0.0,
    var Longitude : Double = 0.0
){
     var requestID :String=""
}