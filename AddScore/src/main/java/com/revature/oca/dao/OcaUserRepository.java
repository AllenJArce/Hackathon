package com.revature.oca.dao;

import org.springframework.data.repository.CrudRepository;

import com.revature.oca.bean.OcaUser;

public interface OcaUserRepository extends CrudRepository<OcaUser, Integer> {

}
