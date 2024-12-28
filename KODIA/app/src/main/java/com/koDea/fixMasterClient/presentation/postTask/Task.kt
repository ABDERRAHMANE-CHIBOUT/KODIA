package com.koDea.fixMasterClient.presentation.postTask

import java.util.Date

data class Job(
    var userId: String="",
    var category: String="",
    var Title: String="",
    var description: String="",
    var status: String="",
    var wilya:String="",
    var city:String="",
    var street:String="",
    var day:String="",
    var hour:String="",
    var min:Int,
    var max:Int,
    var AddingDate: Date = Date(),  // Added dateAdded field,
    var latitude : Double = 0.0,
    var longitude : Double = 0.0,

)