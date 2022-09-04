package com.lens.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lens.model.Frame;

@Service
public interface IFrameService {

	void addFrame(Frame frame);
	void updateFrame(Frame frame);
	void deleteFrame(int frameId);
	
	List<Frame> getAll();
	Frame getById(int frameId);
	List<Frame> getByFrameName(String frameName);
	
	
}
