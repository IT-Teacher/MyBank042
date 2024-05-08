package uz.itteacher.mybank042.util.networking

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
import uz.itteacher.mybank042.models.Card
import uz.itteacher.mybank042.models.CheckCode
import uz.itteacher.mybank042.models.Response
import uz.itteacher.mybank042.models.SendCode
import uz.itteacher.mybank042.models.Transaction
import uz.itteacher.mybank042.models.TransactionPost

interface APIService {
    @GET("/cards")
    suspend fun getAllCards(): List<Card>

    @GET("/cards")
    suspend fun getCardByPhoneNumber(@Query("phone_number") phoneNumber: String)

    @GET("/transactions/")
    suspend fun getAllTransactions(): List<Transaction>

    @GET("/transactions/")
    suspend fun getTransactionByPhoneNumber(@Query("phone_number") phoneNumber: String)

    @POST("/send_code/")
    suspend fun sendCode(@Body sendCode: SendCode):Response

    @POST("/check_code/")
    suspend fun checkCode(@Body checkCode: CheckCode):Response

    @POST("/add_card/")
    suspend fun addCard(@Body checkCode: CheckCode):Response

    @POST("/transaction/")
    suspend fun makeTransaction(@Body transactionPost: TransactionPost)
}