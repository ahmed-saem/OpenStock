package com.example.openstock.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.openstock.features.inventory.presentation.InventoryScreen
import com.example.openstock.features.sales.presentation.SalesScreen

fun NavGraphBuilder.appNavGraph(navController: NavHostController) {
    navigation(
        startDestination = Screen.Inventory.route,
        route = "main_route"
    ) {
        composable(route = Screen.Inventory.route) {
            InventoryScreen()
        }
        composable(route = Screen.Sales.route) {
            SalesScreen()
        }
    }
}
