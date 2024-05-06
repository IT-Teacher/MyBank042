package uz.itteacher.mybank042.srceens.addCard

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import uz.itteacher.mybank042.models.Card
import uz.itteacher.mybank042.util.networking.APIService
import javax.inject.Inject

class AddCardModel @Inject constructor(var api: APIService) {
    private var _cards = MutableStateFlow(listOf<Card>())
    private val cards: StateFlow<List<Card>> = _cards

    suspend fun getAllCards(): StateFlow<List<Card>> {
        _cards.value = api.getAllCards()
        return cards
    }

//    suspend fun getCardByPhoneNumber():
}