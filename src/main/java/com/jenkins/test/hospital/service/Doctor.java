package com.jenkins.test.hospital.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.jenkins.test.hospital.model.DoctorDetails;
import com.jenkins.test.hospital.model.Response;

@Path("/doctor")
public class Doctor {

	@POST
	@Path("/register")
	@Consumes("application/json")
	@Produces("application/json")
	public Response registerDoctor(DoctorDetails doctorDetails) {

		Response response = new Response();
		response.setCode(200);
		response.setMessage("Dr. - " + doctorDetails.getFname() + " " + doctorDetails.getLname() + " with SLMC - " + doctorDetails.getSlmcNo() + " - registered successfully");

		return response;

	}

}