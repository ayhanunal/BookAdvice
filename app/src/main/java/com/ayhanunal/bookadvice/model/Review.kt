package com.ayhanunal.bookadvice.model

import com.google.gson.annotations.SerializedName

data class Review(
    @SerializedName("user_name") val user_name : String,
    @SerializedName("review_date") val review_date : String,
    @SerializedName("content") val content : String,
    @SerializedName("review_type") val review_type : String
)
