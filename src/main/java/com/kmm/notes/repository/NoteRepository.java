package com.kmm.notes.repository;

import com.kmm.notes.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {

    public List<Note> getNoteByImportantTrue();
}
