package com.elias.dojooverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elias.dojooverflow.models.AnswerModel;

@Repository
public interface AnswerRepo extends CrudRepository<AnswerModel, Long>{
	
	List<AnswerModel> findAllByQuestionId(Long questionId);
	
	

}