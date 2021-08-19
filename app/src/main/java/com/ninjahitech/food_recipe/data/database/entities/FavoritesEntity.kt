package com.ninjahitech.food_recipe.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ninjahitech.food_recipe.Constants.Companion.FAVORITE_RECIPES_TABLE
import com.ninjahitech.food_recipe.models.Result

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)
