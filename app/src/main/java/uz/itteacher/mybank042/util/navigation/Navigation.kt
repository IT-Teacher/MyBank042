package uz.itteacher.mybank042.util.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import uz.itteacher.mybank042.srceens.addCard.AddCardView


@Composable
fun Navigation(navHostController: NavHostController) {


    NavHost(navController = navHostController, startDestination = Screens.AddCardScreen.route) {
        composable(route = Screens.AddCardScreen.route) {
            AddCardView(vm = hiltViewModel(), navHostController = navHostController)
        }
    }

}