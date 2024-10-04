package com.example.notetakingapp

import com.example.notetakingapp.db.Dao
import com.example.notetakingapp.db.Note

class Repo(private val dao: Dao) {

    fun insert(note: Note) {
        dao.insert(note)
    }

    fun delete(note: Note) {
        dao.delete(note)
    }

    fun update(note: Note) {
        dao.update(note)
    }

    fun getAllNotes() = dao.getAllNotes()

}