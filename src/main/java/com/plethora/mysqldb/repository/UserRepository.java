package com.plethora.mysqldb.repository;

import com.plethora.mysqldb.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
