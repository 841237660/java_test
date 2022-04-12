package com.firstdevelop.boot.service;

import java.util.List;

import com.firstdevelop.boot.entity.Worker;

public class MaxWorker {
	
	public Worker getMaxWorker(List<Worker> workerlist) {
		
		Worker resultWorker =workerlist.get(0);
		
		for(Worker worker : workerlist) {
			if(worker.getAge()>resultWorker.getAge()) {
				resultWorker = worker;
			}
		}
		
		return resultWorker;
	}
	
}
