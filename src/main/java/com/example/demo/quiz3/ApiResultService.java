package com.example.demo.quiz3;

import org.springframework.stereotype.Service;

import com.example.demo.quiz2.ApiResult;
import com.example.demo.quiz2.ApiResultDTO;

@Service
public interface ApiResultService {
	
	// 등록
	abstract int register(ApiResultDTO apiResult);
	
	// 상세조회
	ApiResult read(int no);

	// 수정
	void modify(ApiResult apiResult);

	// 삭제
	void remove(int no);
	
	
	
	default ApiResult dtoToEntity(ApiResultDTO dto) {
		
		ApiResult entity = ApiResult.builder()
									.no(dto.getNo())
									.apiCallTime(dto.getApiCallTime())
									.resultCode(dto.getResultCode())
									.resultMsg(dto.getResultMsg())
									.totalCount(dto.getTotalCount())
									.build();
		
		return entity;
		
	}

	
	default ApiResultDTO entityToDto(ApiResult entity) {

		ApiResultDTO dto = ApiResultDTO.builder()
										.no(entity.getNo())
										.apiCallTime(entity.getApiCallTime())
										.resultCode(entity.getResultCode())
										.resultMsg(entity.getResultMsg())
										.totalCount(entity.getTotalCount())
										.build();

		return dto;
	}

}







