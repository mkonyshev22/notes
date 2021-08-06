package com.kmm.notes.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "notes")
public class Note  implements Comparable<Note>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "text")
    @NotBlank(message="Заметка не может быть пустой")
    @Size(max=80, message="Превышен лимит в 80 символов")
    private String text;

    @Column(name = "last_modified")
    private LocalDateTime latModified;

    @Column(name = "important")
    private Boolean important;

    @Override
    public int compareTo(Note otherNote) {
        if (getLatModified() == null || otherNote.getLatModified() == null){
            return -1;
        }
        return otherNote.getLatModified().compareTo(getLatModified());
    }
}

