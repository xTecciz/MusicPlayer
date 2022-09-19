package com.tck.musicplayer.data.remote.dto

data class SongDto(
    val mediaId:String = "",
    val title:String = "",
    val subtitle:String = "",
    val songUrl:String = "",
    val imageUrl:String = ""
)