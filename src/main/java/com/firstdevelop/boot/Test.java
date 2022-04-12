package com.firstdevelop.boot;

import java.util.ArrayList;
import java.util.List;

import com.firstdevelop.boot.entity.Student;
import com.firstdevelop.boot.entity.Worker;
import com.firstdevelop.boot.service.MaxWorker;
import com.firstdevelop.boot.util.ListUtil;

public class Test {

	public static void main(String[] args) {
	
        //クラスが大文字からスタート　インスタンス（実例）が小文字からスタート
		Worker workerOne = new Worker();
		Worker workerTwo = new Worker();
		Worker workerThree = new Worker("zhang","99",40);
		
		workerOne.setName("liuxiaoming");
		workerOne.setAge(26);
		workerOne.setValue("100");
		
		workerTwo.setName("liuxiaoming1");
		workerTwo.setAge(24);
		workerTwo.setValue("99");
		
		
		
		Student studentOne = new Student();
		Student studentTwo = new Student();
		Student studentThree = new Student();
		
		
		List<Worker> workerList = new ArrayList<>();
		workerList.add(workerOne);
		workerList.add(workerTwo);
		workerList.add(workerThree);
		
		
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(studentOne);
		studentList.add(studentTwo);
		studentList.add(studentThree);
		
		
		System.out.println(workerList);
		
		
		
		for (Student student :studentList) {
			String name = student.getName();
			int age = student.getAge();
			int id = student.getID();
			int score = student.getScore();
			String address = student.getAddress();
			String stuclass = student.getStuClass();
			
			System.out.println("name=" + name);
			System.out.println("age=" + age);
			System.out.println("id=" + id);
			System.out.println("score=" + score);
			System.out.println("stuclass=" + stuclass);
			System.out.println("address=" + address);
			
			ListUtil listutil = new ListUtil();
			listutil.print(workerList);
			
			MaxWorker maxworker = new MaxWorker();
			maxworker.getMaxWorker(workerList);
		}
	}
	
	
	
	  
}
