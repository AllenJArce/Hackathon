package com.revature.oca.web;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.oca.bean.OcaUser;
import com.revature.oca.dao.OcaUserRepository;

@RestController
public class GetCurrentScore {
	@Autowired
	DataSource dataSource;

	@Autowired
	OcaUserRepository ocaUserRepository;

	@Transactional(readOnly = true)
	@PostMapping("/getScore")
	public OcaUser getScore(@RequestBody OcaUser ocaUser) {
		return ocaUserRepository.findOne(ocaUser.getId());
	}
}
