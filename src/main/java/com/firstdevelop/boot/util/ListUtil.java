package com.firstdevelop.boot.util;

import java.util.List;

import com.firstdevelop.boot.entity.Worker;

public class ListUtil {
	public void print(List<Worker> workerList ) {
		for (Worker worker : workerList) {
			
			System.out.println("name =" + worker.getName());
			System.out.println("value =" + worker.getValue());
			System.out.println("age =" + worker.getAge());
		}
	}
}
