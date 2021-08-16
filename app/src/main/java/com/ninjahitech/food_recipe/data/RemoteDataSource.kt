package com.ninjahitech.food_recipe.data

import com.ninjahitech.food_recipe.FoodRecipesApi
import com.ninjahitech.food_recipe.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {
     suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }
}
