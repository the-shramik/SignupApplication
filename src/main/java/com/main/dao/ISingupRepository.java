package com.main.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.bo.SignUp;

@Repository
public interface ISingupRepository extends CrudRepository<SignUp, Serializable>{
     
}
