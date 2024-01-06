package com.example.myrecipe

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "recipe_table")
data class RecipeData(
    @PrimaryKey(autoGenerate = true)
    var recipeId: Int,

    @ColumnInfo(name = "recipeName")
    var recipeName: String,

    @ColumnInfo(name = "meal")
    var meal: String,

    @ColumnInfo(name = "serves")
    var serves: String,

    @ColumnInfo(name = "difficulty ")
    var difficulty: String,

    @ColumnInfo(name = "ingredients ")
    var ingredients: String,

    @ColumnInfo(name = "steps ")
    var Steps: String,
)