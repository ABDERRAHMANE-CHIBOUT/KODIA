package com.koDea.fixMasterClient.domain.useCases.authentifaction

data class AuthUseCases(
    val signInWithEmailandPassword: signInWithEmailandPassword,
    val signOut: signOut,
    val signUp: signUp,
    val isUserAuth: isUserAuth,
    val getUserAuthState: getUserAuthState
)