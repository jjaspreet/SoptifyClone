package com.example.spotifyclone.data.entities

data class Song(
    val meidaId: String,
    val title: String = "",
    val subtitle: String = "",
    val songUrls: String = "",
    val imageUrl: String = ""
)