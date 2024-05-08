package uz.itteacher.mybank042.srceens.addCard

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import uz.itteacher.mybank042.models.Card
import uz.itteacher.mybank042.models.CheckCode
import uz.itteacher.mybank042.models.Response
import uz.itteacher.mybank042.models.SendCode
import uz.itteacher.mybank042.util.networking.APIService
import javax.inject.Inject

class AddCardModel @Inject constructor(var api: APIService) {
    private var _cards = listOf<Card>()
    private val cards: List<Card> = _cards

    suspend fun getAllCards(): List<Card> {
        _cards = api.getAllCards()
        return cards
    }

    suspend fun sendCode(sendCode: SendCode):Response{
        return api.sendCode(sendCode)
    }

    suspend fun checkCode(checkCode: CheckCode):Response{
        return api.checkCode(checkCode)
    }

    suspend fun addCard(checkCode: CheckCode):Response{
        return api.addCard(checkCode)
    }

}