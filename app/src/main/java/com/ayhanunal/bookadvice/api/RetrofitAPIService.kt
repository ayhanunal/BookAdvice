package com.ayhanunal.bookadvice.api

import com.ayhanunal.bookadvice.model.MainModel
import com.ayhanunal.bookadvice.util.Util.BASE_URL
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitAPIService {

    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(RetrofitAPI::class.java)

    fun getData() : Single<List<MainModel>> {
        return api.allBook()
    }

}