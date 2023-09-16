package com.example.compose_firebaseauth.presentation.sign_in

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext

@Composable
fun SignInScreen(
    state: SigninState,
    onSignInClick: () -> Unit
) {
    val context = LocalContext.current
    LaunchedEffect(key1 = state.signInError) {

    }
}