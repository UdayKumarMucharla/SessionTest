package com.spring.jwt.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.jwt.model.SpringSampleModel;
@Transactional
@Service
public class SpringService {

	public SpringSampleModel save(SpringSampleModel model) {
		return null;
	}

	public SpringSampleModel findByEmail(String email) {
		return null;
	}

}
