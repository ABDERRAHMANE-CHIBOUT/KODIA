package com.koDea.fixMasterClient.domain.useCases

import com.koDea.fixMasterClient.domain.repository.FireStoreRepository
import javax.inject.Inject


class getCategoriesUseCase @Inject constructor (private val repository: FireStoreRepository){
    operator fun invoke() = repository.getCategories()

}