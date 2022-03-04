package com.example.githubuserapp.util

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

fun ImageView.loadImage(imageResource: Int?) {
    Glide.with(this.context)
        .load(imageResource)
        .apply(RequestOptions().override(55, 55))
        .into(this)
}