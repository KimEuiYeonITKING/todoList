package com.solideos.todolist.repository;

import com.solideos.todolist.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 1. 할 일 추가/수정/삭제
 *     - 추가된 할 일의 제목, 내용을 입력할 수 있어야 합니다.
 *     - 사용자는 이미 추가한 할 일의 내용 등을 수정할 수 있어야 합니다.
 *     - 사용자는 완료된 할 일을 목록에서 삭제할 수 있어야 합니다.
 *
 * 2. 할 일 목록 조회
 *     - 사용자는 등록한 모든 할 일 목록을 한 눈에 볼 수 있어야 합니다.
 *     - 목록은 제목, 내용,  완료 여부 등을 표시해야 합니다.
 *     - 토글 형태로 완료 - 미완료를 설정할 수 있어야 합니다.
 *     - 필터링 기능을 통해 완료되지 않은 할 일을 조회할 수 있어야 합니다.
 *     - 사용자는 할 일 목록에서 특정 키워드를 검색하여 관련된 할 일을 찾을 수 있어야 합니다.
 *
 * 3. 우선순위 관리
 *     - 사용자는 각 할 일에 우선순위를 부여할 수 있어야 합니다.
 *     - 할 일 목록에서 우선순위에 따라 정렬하여 표시할 수 있어야 합니다.
 *
 * 4. 댓글(추가 메모) 기능
 *     - 각 할 일마다 추가로 메모기능을 넣을 수 있어야 합니다.
 *     - 추가/수정/삭제 기능
 */

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> { // <엔티티 클래스, pk타입>

}