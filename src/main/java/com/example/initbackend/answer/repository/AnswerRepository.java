package com.example.initbackend.answer.repository;

import com.example.initbackend.answer.domain.Answer;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnswerRepository  extends JpaRepository<Answer,String> {

    Optional<Answer> findByUserIdAndQuestionId(Long userId, Long QuestionId);
    Optional<Answer> findById(Long answerId);

    Page<Answer> findAllByQuestionIdOrderByCreateDateDesc(Long questionId, Pageable pageable);


}