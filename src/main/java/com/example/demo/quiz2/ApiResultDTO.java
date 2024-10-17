package com.example.demo.quiz2;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResultDTO {
	
	int no;
	LocalDateTime apiCallTime;
	String resultCode;
	String resultMsg;
	int totalCount;

}
