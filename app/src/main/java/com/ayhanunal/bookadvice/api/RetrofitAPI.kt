package com.ayhanunal.bookadvice.api

import com.ayhanunal.bookadvice.model.MainModel
import io.reactivex.Single
import retrofit2.http.GET

interface RetrofitAPI {

    @GET("/book_api/all_book.php")
    fun allBook(): Single<MainModel>

}