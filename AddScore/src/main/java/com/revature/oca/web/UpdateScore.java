package com.revature.oca.web;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.oca.bean.OcaUser;
import com.revature.oca.dao.OcaUserRepository;

@RestController
public class UpdateScore {
	@Autowired
	DataSource dataSource;

	@Autowired
	OcaUserRepository ocaUserRepository;

	@Transactional
	@PostMapping("/updateScore")
	public void updateScore(@RequestBody OcaUser ocaUser) {
		OcaUser oldOcaUser = ocaUserRepository.findOne(ocaUser.getId());
		oldOcaUser.setAttempted(ocaUser.getAttempted());
		oldOcaUser.setCorrect(ocaUser.getCorrect());
		ocaUserRepository.save(oldOcaUser);
	}
	
	@GetMapping("/updateScore")
	public OcaUser getStringScore() {
		return ocaUserRepository.findOne(1);
	}
}
