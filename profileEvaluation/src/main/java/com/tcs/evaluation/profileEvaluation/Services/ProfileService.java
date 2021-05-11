package com.tcs.evaluation.profileEvaluation.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.evaluation.profileEvaluation.Entity.Profile;
import com.tcs.evaluation.profileEvaluation.Repository.ProfileRepo;

@Service
public class ProfileService {
	@Autowired
	ProfileRepo repo;
	
	
	Long value = 10000L;
	public String addProfile(Profile profile){
		if (profile.getId() == null) {
			profile.setId(++this.value);
		}
//		System.out.println(profile);
		if(repo.existsById(profile.getId())) {
			return "Sorry";
		}
		else {
			repo.save(profile);
			return "success";
		}
	}

	
}
