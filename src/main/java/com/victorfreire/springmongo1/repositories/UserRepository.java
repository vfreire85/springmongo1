package com.victorfreire.springmongo1.repositories;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.victorfreire.springmongo1.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
