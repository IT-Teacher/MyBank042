package uz.itteacher.mybank042.util.navigation

sealed class Screens(val route: String) {
    data object AddCardScreen : Screens("addCard_screen")


}