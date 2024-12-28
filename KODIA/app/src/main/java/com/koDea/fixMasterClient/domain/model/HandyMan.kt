package com.koDea.fixMasterClient.domain.model

import com.google.firebase.firestore.PropertyName

data class HandyMan(
    var Email : String = "",
    var FirstName: String = "",
    var LastName: String = "",
    var Category: String = "",
    var City: String = "",
    var Wilaya: String = "",
    var Rating: Double = 0.0,
    var AverageSalary: Double = 0.0,
    var ProfileImage: String = "",
    var id : String = "",
    var DeviceToken : String = "",
    var Status : String = "",
    var Latitude : String = "36.50321008456727",
    var Longitude : String = "2.8770072419209303",
    var PhoneNumber:String ="",
    var saved : Boolean = true,
)
data class HandyManplusID(
    var handyMan: HandyMan =HandyMan(),
    var HandymanId :String =""
)
