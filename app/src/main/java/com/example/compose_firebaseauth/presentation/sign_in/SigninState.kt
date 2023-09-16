package com.example.compose_firebaseauth.presentation.sign_in

data class SigninState(
    val isSigninSuccessful: Boolean = false,
    val signInError: String? = null
)
