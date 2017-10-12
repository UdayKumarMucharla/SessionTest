package com.spring.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.spring.jwt.model.SpringSampleModel;
import com.spring.jwt.service.SpringService;





@RestController
@RequestMapping(value = "/spring")
public class SpringController {

/*	private SpringService springService;
	
	@Autowired
	public void setService(SpringService springService) {
		this.springService = springService;
	}
	
	
	@RequestMapping(value = "/fetchAll", method = RequestMethod.GET)
	public List<SpringSampleModel> getAllUsers() {

		List<SpringSampleModel> list = springService.fetchAll();

		return list;

	}
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String save(@RequestBody SpringSampleModel smodel) {
	SpringSampleModel model = springService.fetchByuserEmail(smodel.getEmail());
		if(model == null){
		springService.save(smodel);
		return "Success";
		}
		else{
			return "Failed";
		}

	}
	@RequestMapping(value = "/updateUser", method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody SpringSampleModel model) {
	
		if(model.getId() > 0)	 
		springService.updateUser(model);
	}
	
	@RequestMapping(value = "/delete/{Id}",method = RequestMethod.DELETE)
	public void deleteById(@PathVariable(value = "Id") int Id) {

	 springService.deleteById(Id);

	
	}*/
	
}
