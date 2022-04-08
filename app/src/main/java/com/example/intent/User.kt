package com.example.intentresultName

import java.io.Serializable

data class User(var name: String, var surname: String, var age: Int, var email: String) :
    Serializable
