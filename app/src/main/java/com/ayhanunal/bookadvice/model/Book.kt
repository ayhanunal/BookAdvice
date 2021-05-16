package com.ayhanunal.bookadvice.model

import com.google.gson.annotations.SerializedName

data class Book(
    @SerializedName("number") val number : Int,
    @SerializedName("book_url") val book_url : String,
    @SerializedName("book_name") val book_name : String,
    @SerializedName("book_auth") val book_auth : String,
    @SerializedName("book_publisher") val book_publisher : String,
    @SerializedName("price") val price : String,
    @SerializedName("description") val description : String,
    @SerializedName("image_url") val book_image_url : String,
    @SerializedName("publish_date") val publish_date : String,
    @SerializedName("isbn") val book_isbn : Int,
    @SerializedName("book_language") val book_language : String,
    @SerializedName("page_count") val page_count : Int,
    @SerializedName("cat1") val cat1 : String,
    @SerializedName("cat2") val cat2 : String,
    @SerializedName("review") val review : List<Review>
)
