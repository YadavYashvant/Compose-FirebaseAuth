package com.example.compose_firebaseauth.presentation.daos

import com.example.compose_firebaseauth.presentation.models.User
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class UserDao {

    val db = Firebase.firestore

    //val db = FirebaseFirestore.getInstance()
    val userCollection = db.collection("users")

    fun addUser(user: User?) {
        user?.let {
            GlobalScope.launch(Dispatchers.IO) {
                userCollection.document(user.uid.toString()).set(it)
            }
        }
    }

}