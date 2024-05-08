package uz.itteacher.mybank042.srceens.addCard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import uz.itteacher.mybank042.models.CheckCode
import uz.itteacher.mybank042.models.Response
import uz.itteacher.mybank042.models.SendCode
import javax.inject.Inject

@HiltViewModel
class AddCardViewModel @Inject constructor(var model: AddCardModel): ViewModel() {

    fun check(checkCode: CheckCode):Response{
        var response = Response("")
        viewModelScope.launch {
            response = model.checkCode(checkCode)
        }
        return response
    }

    fun send(sendCode: SendCode): Response {
        var response = Response("")
        viewModelScope.launch {
            response = model.sendCode(sendCode)
        }
        return response

    }

}