package com.example.notes.Database

import androidx.lifecycle.LiveData
import com.example.notes.Models.Note

class NoteRepository(private val noteDoa: NoteDao) {

    val allNotes : LiveData<List<Note>> = noteDoa.getAllNotes()

    suspend fun insert(note : Note){
        noteDoa.insert(note)

    }

    suspend fun delete(note: Note){
        noteDoa.delete(note)
    }
suspend fun update(note: Note){
    noteDoa.update(note.id, note.title,note.note,)
}
}