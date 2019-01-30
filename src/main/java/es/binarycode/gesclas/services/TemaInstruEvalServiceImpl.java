package es.binarycode.gesclas.services;

import org.springframework.stereotype.Service;

import es.binarycode.gesclas.dto.TemaInstruEvalDTO;
import es.binarycode.gesclas.entity.TemaInstruEval;
import es.binarycode.gesclas.mappers.GenericMapper;
import es.binarycode.gesclas.mappers.TemaInstruEvalMapper;

@Service
public class TemaInstruEvalServiceImpl extends GeneralServiceImpl<TemaInstruEvalDTO, TemaInstruEval> 
	implements TemaInstruEvalService{

	@Override
	public GenericMapper<TemaInstruEvalDTO, TemaInstruEval> getMapper() {
		
		return TemaInstruEvalMapper.INSTANCE;
	}
	
	
}
