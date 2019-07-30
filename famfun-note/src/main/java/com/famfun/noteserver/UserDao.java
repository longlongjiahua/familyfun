package com.famfun.noteserver;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends JpaRepository<User, Long> {

}


//@Transactional
//public interface UserDao extends CrudRepository<User, Long> {

  