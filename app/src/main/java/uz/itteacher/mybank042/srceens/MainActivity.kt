package uz.itteacher.mybank042.srceens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import uz.itteacher.mybank042.ui.theme.MyBank042Theme
import uz.itteacher.mybank042.util.navigation.Navigation

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyBank042Theme {
                val navController = rememberNavController()
                Navigation(navHostController = navController)
            }
        }
    }
}