package com.example.restaurantapp.model

data class Restaurant(
    val username: String,
    val name: String,
    val logoUrl: String,
    val isOpen: Boolean,
    val phoneNumber: String,
    val city: String
)
