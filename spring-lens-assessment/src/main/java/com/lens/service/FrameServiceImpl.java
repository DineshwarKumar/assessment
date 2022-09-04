package com.lens.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lens.model.Frame;
import com.lens.repository.IFrameRepository;

@Service
public class FrameServiceImpl implements IFrameService {
	
	@Autowired
	IFrameRepository frameRepository;

	@Override
	public void addFrame(Frame frame) {
		frameRepository.save(frame);
	}

	@Override
	public void updateFrame(Frame frame) {
		frameRepository.save(frame);
	}

	@Override
	public void deleteFrame(int frameId) {
		frameRepository.deleteById(frameId);
	}

	@Override
	public List<Frame> getAll() {
		// TODO Auto-generated method stub
		return frameRepository.findAll();
	}

	@Override
	public Frame getById(int frameId) {
		// TODO Auto-generated method stub
		return frameRepository.findById(frameId);
	}

	@Override
	public List<Frame> getByFrameName(String frameName) {
		// TODO Auto-generated method stub
		return frameRepository.findByFrameName(frameName);
	}

}
