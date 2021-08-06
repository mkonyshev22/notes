package com.kmm.notes.service;

import com.kmm.notes.entity.Note;

import java.util.List;

public interface NoteService {

    public Note findById(Long id);

    public List<Note> findAll();

    public List<Note> findImportantNotes();

    public void saveNote(Note note);

    public void deleteById(Long id);

}
