package com.ninjahitech.food_recipe.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.ninjahitech.food_recipe.Constants
import com.ninjahitech.food_recipe.Constants.Companion.API_KEY

class RecipesViewModel (application: Application): AndroidViewModel(application){

    fun applyQueries(): HashMap<String, String> {
        val queries: HashMap<String, String> = HashMap()
        queries[Constants.QUERY_NUMBER] = "50"
        queries[Constants.QUERY_API_KEY] = API_KEY
        queries[Constants.QUERY_TYPE] = "snack"
        queries[Constants.QUERY_DIET] = "vegan"
        queries[Constants.QUERY_ADD_RECIPE_INFORMATION] = "true"
        queries[Constants.QUERY_FILL_INGREDIENTS] = "true"
        return queries
    }

}