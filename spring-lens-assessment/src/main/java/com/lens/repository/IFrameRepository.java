package com.lens.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lens.model.Frame;

@Repository
public interface IFrameRepository extends JpaRepository<Frame, Integer> {
	
//	void addFrame(Frame frame);
//	void updateFrame(Frame frame);
//	void deleteFrame(int frameId);
	
	List<Frame> findAll();
	Frame findById(int frameId);
	List<Frame> findByFrameName(String frameName);
	
	
}
