package com.ninjahitech.food_recipe.viewmodels

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.ninjahitech.food_recipe.Constants
import com.ninjahitech.food_recipe.Constants.Companion.API_KEY
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecipesViewModel @Inject constructor (
    application: Application): AndroidViewModel(application){


    var networkStatus = false

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

//    private fun saveBackOnline(backOnline: Boolean) =
//        viewModelScope.launch(Dispatchers.IO) {
//            dataStoreRepository.saveBackOnline(backOnline)
//        }
//
//    fun showNetworkStatus() {
//        if (!networkStatus) {
//            Toast.makeText(getApplication(), "No Internet Connection.", Toast.LENGTH_SHORT).show()
//            saveBackOnline(true)
//        } else if (networkStatus) {
//            if (backOnline) {
//                Toast.makeText(getApplication(), "We're back online.", Toast.LENGTH_SHORT).show()
//                saveBackOnline(false)
//            }
//        }
//    }

}