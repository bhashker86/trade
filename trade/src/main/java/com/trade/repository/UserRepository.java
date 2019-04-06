package com.trade.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trade.model.*;


@Repository
public interface UserRepository extends CrudRepository<User,Long>{

}
