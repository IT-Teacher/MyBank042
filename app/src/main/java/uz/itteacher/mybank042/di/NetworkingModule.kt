package uz.itteacher.mybank042.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uz.itteacher.mybank042.util.networking.APIService
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkingModule {

    @Provides
    @Singleton
    fun baseUrl():String = "https://ictschool.pythonanywhere.com"


    @Provides
    @Singleton
    fun getRetrofit(baseUrl:String):Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun getApi(retrofit: Retrofit): APIService {
        return retrofit.create(APIService::class.java)
    }

}