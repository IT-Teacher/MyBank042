package uz.itteacher.mybank042.models

import java.time.temporal.TemporalAmount

data class TransactionPost(
    var sender: String,
    var receiver: String,
    var amount: Int
)
