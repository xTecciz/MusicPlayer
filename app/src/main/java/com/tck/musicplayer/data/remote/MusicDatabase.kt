package com.tck.musicplayer.data.remote

import com.google.firebase.firestore.FirebaseFirestore
import com.tck.musicplayer.data.remote.dto.SongDto
import com.tck.musicplayer.util.Constants.SONG_COLLECTION
import kotlinx.coroutines.tasks.await

class MusicDatabase {
    private val firestore = FirebaseFirestore.getInstance()
    private val songCollection = firestore.collection(SONG_COLLECTION)

    suspend fun getAllSongs(): List<SongDto> {
        return try {
            songCollection.get().await().toObjects(SongDto::class.java)
        } catch (e: Exception) {
            emptyList()
        }
    }
}