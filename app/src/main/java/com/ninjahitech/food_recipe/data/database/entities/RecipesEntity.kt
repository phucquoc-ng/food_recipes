package com.ninjahitech.food_recipe.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ninjahitech.food_recipe.utils.Constants.Companion.RECIPES_TABLE
import com.ninjahitech.food_recipe.models.FoodRecipe

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}