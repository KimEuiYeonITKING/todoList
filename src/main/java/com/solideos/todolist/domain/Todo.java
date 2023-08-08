package com.solideos.todolist.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "TODO")
@Getter
@Setter
@ToString
public class Todo {

    @Id
    @Column(name = "TODO_NUM", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long todoNum;

    @Column(name = "TODO_TITLE", nullable = false)
    private String todoTitle;

    @Column(name = "TODO_CONTENT")
    private String todoContent;

    @Column(name = "TODO_PRIORITIES")
    private Integer todoPriorities;

    @Enumerated(EnumType.STRING)
    private TodoCompletion todoCompletion;

    @OneToMany(mappedBy = "todo")
    @ToString.Exclude
    private List<Memo> memos = new ArrayList<>();

    public void mappingMemo(Memo memo){
        this.memos.add(memo);
        memo.setTodo(this);
    }

}