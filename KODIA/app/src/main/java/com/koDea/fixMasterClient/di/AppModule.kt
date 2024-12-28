package com.koDea.fixMasterClient.di

import android.app.Application
import androidx.annotation.Keep
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import com.koDea.fixMasterClient.data.local.localUserManagerImp
import com.koDea.fixMasterClient.data.remote.GeocodeReverseApi
import com.koDea.fixMasterClient.data.remote.WilayaCityAPI
import com.koDea.fixMasterClient.data.repository.AuthRepositoryImpl
import com.koDea.fixMasterClient.data.repository.FireStoreRepositoryImpl
import com.koDea.fixMasterClient.data.repository.LocationRepositoryImpl
import com.koDea.fixMasterClient.domain.local.LocalUserManager
import com.koDea.fixMasterClient.domain.repository.AuthRepository
import com.koDea.fixMasterClient.domain.repository.FireStoreRepository
import com.koDea.fixMasterClient.domain.repository.LocationRepository
import com.koDea.fixMasterClient.domain.useCases.appEntryUseCases.AppEntryUseCases
import com.koDea.fixMasterClient.domain.useCases.appEntryUseCases.readAppEntry
import com.koDea.fixMasterClient.domain.useCases.appEntryUseCases.saveAppEntry
import com.koDea.fixMasterClient.domain.useCases.authentifaction.AuthUseCases
import com.koDea.fixMasterClient.domain.useCases.authentifaction.getUserAuthState
import com.koDea.fixMasterClient.domain.useCases.authentifaction.isUserAuth
import com.koDea.fixMasterClient.domain.useCases.authentifaction.signInWithEmailandPassword
import com.koDea.fixMasterClient.domain.useCases.authentifaction.signOut
import com.koDea.fixMasterClient.domain.useCases.authentifaction.signUp
import com.koDea.fixMasterClient.domain.useCases.searchUseCases.SearchUseCases
import com.koDea.fixMasterClient.domain.useCases.searchUseCases.getHandyMenByCategory
import com.koDea.fixMasterClient.domain.useCases.searchUseCases.getHandyMenByLocation
import com.koDea.fixMasterClient.domain.useCases.searchUseCases.getHandyMenByName
import com.koDea.fixMasterClient.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
@Keep
object AppModule {

    @Provides
    @Singleton
    fun provideFirebaseAuth(): FirebaseAuth {
        return FirebaseAuth.getInstance()
    }

    @Provides
    @Singleton
    fun provideFirebaseFirestore(): FirebaseFirestore {
        return FirebaseFirestore.getInstance()
    }

    @Provides
    @Singleton
    fun provideFirebaseStorage(): FirebaseStorage {
        return FirebaseStorage.getInstance()
    }

    @Provides
    @Singleton
    fun provideAuthRepository(auth: FirebaseAuth, firestore: FirebaseFirestore): AuthRepository {
        return AuthRepositoryImpl(auth, firestore)
    }

    @Provides
    @Singleton
    fun provideAuthUseCases(repositoryImpl: AuthRepository) = AuthUseCases(
        signInWithEmailandPassword = signInWithEmailandPassword(repository = repositoryImpl),
        signOut = signOut(repositoryImpl),
        signUp = signUp(repositoryImpl),
        isUserAuth = isUserAuth(repositoryImpl),
        getUserAuthState = getUserAuthState(repositoryImpl)

    )

    @Provides
    @Singleton
    fun provideLocalUserManager(context: Application): LocalUserManager =
        localUserManagerImp(context)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(localUserManager: LocalUserManager) = AppEntryUseCases(
        saveAppEntry = saveAppEntry(localUserManager),
        readAppEntry = readAppEntry(localUserManager)
    )

    @Provides
    @Singleton
    fun provideApi(): GeocodeReverseApi {
        return (Retrofit.Builder().baseUrl(Constants.baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GeocodeReverseApi::class.java))
    }

    @Provides
    @Singleton
    fun provideGetLocationUseCases(api: GeocodeReverseApi): LocationRepository {
        return LocationRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideCategoriesRepository(
        firestore: FirebaseFirestore,
        storage: FirebaseStorage,
        auth: FirebaseAuth
    ): FireStoreRepository = FireStoreRepositoryImpl(fireStore = firestore, storage = storage ,auth )

    @Provides
    @Singleton fun provideSearchUseCases(fireStore: FireStoreRepository)  = SearchUseCases(
        getHandyMenByName = getHandyMenByName(fireStore),
        getHandyMenByCategory = getHandyMenByCategory(fireStore),
        getHandyMenByLocation = getHandyMenByLocation(fireStore)
    )

    @Provides
    @Singleton
    fun provideWilayaCity(): WilayaCityAPI {
        return (Retrofit.Builder().baseUrl(Constants.baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(WilayaCityAPI::class.java))
    }

}