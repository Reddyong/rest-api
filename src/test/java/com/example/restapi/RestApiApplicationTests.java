package com.example.restapi;

import com.example.restapi.model.MemberDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiApplicationTests {

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void contextLoads() throws JsonProcessingException {
		var user = new MemberDTO();
		user.setName("Hong");
		user.setPhoneNumber("010-1111-1111");
		user.setEmail("aaaa@naver.com");
		user.setIsKorean(true);

		var json = objectMapper.writeValueAsString(user);
		System.out.println("json = " + json);

		var dto = objectMapper.readValue(json, MemberDTO.class);
		System.out.println("dto = " + dto);
	}

}
