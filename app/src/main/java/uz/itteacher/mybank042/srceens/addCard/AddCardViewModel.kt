package uz.itteacher.mybank042.srceens.addCard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import uz.itteacher.mybank042.models.Card
import javax.inject.Inject

@HiltViewModel
class AddCardViewModel @Inject constructor(var model: AddCardModel): ViewModel() {
    private var cards: StateFlow<List<Card>>? = null
    fun getAllCard(): StateFlow<List<Card>>? {
        viewModelScope.launch {
            cards = model.getAllCards()
        }
        return cards
    }
}