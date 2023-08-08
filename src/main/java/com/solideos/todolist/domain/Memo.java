package com.solideos.todolist.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "MEMO")
@Getter
@Setter
@ToString
public class Memo {

    @Id
    @Column(name = "MEMO_NUM", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memoNum;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "TODO_NUM", nullable = false)
    @ToString.Exclude
    private Todo todo;

    @Column(name = "MEMO_CONTENT")
    private String memoContent;

    // No need for explicit getters and setters with Lombok
}