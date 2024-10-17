package com.example.demo.quiz2;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "api_test")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResult {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int no;
	LocalDateTime apiCallTime;
	@Column(length = 10)
	String resultCode;
	@Column(length = 20)
	String resultMsg;
	int totalCount;
    
}



