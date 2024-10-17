package com.example.demo.quiz3;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.quiz2.ApiResult;
import com.example.demo.quiz2.ApiResultDTO;

@Component
public class ApiResultServiceImpl implements ApiResultService {
	
	@Autowired
	ApiResultRepository apiResultRepository;
	
	
	@Override
	public int register(ApiResultDTO dto) {
		
		ApiResult entity = dtoToEntity(dto);
		apiResultRepository.save(entity);
		int newApi = entity.getNo();

		System.out.println(entity);

		return newApi;
		
	}


	@Override
	public ApiResult read(int no) {

		Optional<ApiResult> result = apiResultRepository.findById(no);

		if (result.isPresent()) {
			ApiResult apiResult = result.get();
			ApiResultDTO apiResultDTO = entityToDto(apiResult);
			return apiResult;
		} else {
			return null;
		}
		
	}


	@Override
	public void modify(ApiResult apiResult) {
		
		Optional<ApiResult> result = apiResultRepository.findById(apiResult.getNo());
		
		if (result.isPresent()) {
			
			ApiResult entity = result.get();

			entity.setApiCallTime(apiResult.getApiCallTime());
			entity.setResultCode(apiResult.getResultCode());
			entity.setResultMsg(apiResult.getResultMsg());
			entity.setTotalCount(apiResult.getTotalCount());

			apiResultRepository.save(entity);
			
		}
		
	}


	@Override
	public void remove(int no) {
		
		Optional<ApiResult> result = apiResultRepository.findById(no);

		if (result.isPresent()) {
			
			apiResultRepository.deleteById(no);
			
		}
		
	}
	    
}






