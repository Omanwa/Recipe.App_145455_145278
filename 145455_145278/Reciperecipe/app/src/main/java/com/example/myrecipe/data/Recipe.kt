package com.example.myrecipe.data


import java.io.Serializable

data class Recipe (
    val id: Int,
    val title: String,
    val meal: String,
    val serves: String,
    val difficulty: String,
    val ingredients: String,
    val steps : String,
    val recipeImageId : Int = 0
) : Serializable {

}
