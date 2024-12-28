package com.koDea.fixMasterClient.domain.useCases.searchUseCases

data class SearchUseCases(
    val getHandyMenByCategory: getHandyMenByCategory,
    val getHandyMenByName: getHandyMenByName,
    val getHandyMenByLocation : getHandyMenByLocation
)