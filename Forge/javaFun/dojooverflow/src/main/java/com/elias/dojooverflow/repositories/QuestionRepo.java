package com.elias.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;

import com.elias.dojooverflow.models.QuestionsModel;

public interface QuestionRepo extends CrudRepository<QuestionsModel, Long> {

}