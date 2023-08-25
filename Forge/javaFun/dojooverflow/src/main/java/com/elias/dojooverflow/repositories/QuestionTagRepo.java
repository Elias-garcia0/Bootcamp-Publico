package com.elias.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elias.dojooverflow.models.QuestionTagModel;

@Repository
public interface QuestionTagRepo extends CrudRepository<QuestionTagModel, Long> {

}