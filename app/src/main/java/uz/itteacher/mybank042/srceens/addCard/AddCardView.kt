package uz.itteacher.mybank042.srceens.addCard

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import uz.itteacher.mybank042.R
import uz.itteacher.mybank042.models.Card
import kotlin.math.log

@Composable
fun AddCardView(vm: AddCardViewModel, navHostController: NavHostController) {
    var number by remember {
        mutableStateOf("")
    }
    var cards = remember {
        listOf<Card>()
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(32.dp)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.creditcardbg),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
        ) {
            TextField(
                value = number,
                onValueChange = {
                    number = it
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.credit_card),
                        contentDescription = null
                    )
                },
                placeholder = {
                    Text(text = "+998 90 123 45 67")
                }
            )
        }
        if (vm.getAllCard() != null) {
            cards = vm.getAllCard()!!.collectAsState().value
            for (i in cards.indices) {
                Log.d("Card", cards[i].name)
            }
        }
        Button(
            onClick = {
//                navHostController.navigate("cards_screen")
            },
            modifier = Modifier
                .padding(horizontal = 32.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.add_card),
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier.padding(horizontal = 8.dp)
                )
                Text(
                    text = "Karta qo'shish",
                    modifier = Modifier.padding(horizontal = 8.dp),
                    color = Color.Black
                )
            }
        }
    }
}