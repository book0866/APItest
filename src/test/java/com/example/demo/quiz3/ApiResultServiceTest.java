package com.example.demo.quiz3;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.quiz2.ApiResultDTO;

@SpringBootTest
public class ApiResultServiceTest {
	
	@Autowired
	ApiResultService apiResultService;
	
	
	@Test
	public void 등록() {
		
		ApiResultDTO dto = ApiResultDTO.builder()
										.apiCallTime(LocalDateTime.now())
										.resultCode("01")
										.resultMsg("OK")
										.totalCount(10)
										.build();
		
		apiResultService.register(dto);
		
	}

}







