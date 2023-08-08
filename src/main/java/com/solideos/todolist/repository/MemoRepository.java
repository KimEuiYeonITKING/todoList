package com.solideos.todolist.repository;

import com.solideos.todolist.domain.Memo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoRepository extends JpaRepository<Memo, Long> {
    // 추가적인 메서드 선언이 필요한 경우 여기에 추가
}