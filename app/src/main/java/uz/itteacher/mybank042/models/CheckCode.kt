package uz.itteacher.mybank042.models

data class CheckCode(
    var phone_number: String,
    var code: String,
    var card_number: String? = null
)
