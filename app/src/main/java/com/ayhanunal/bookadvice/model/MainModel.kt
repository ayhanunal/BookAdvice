package com.ayhanunal.bookadvice.model

import com.google.gson.annotations.SerializedName

data class MainModel(
    @SerializedName("book") val book : List<Book>,
    @SerializedName("crawl_date") val crawl_date : String
)
