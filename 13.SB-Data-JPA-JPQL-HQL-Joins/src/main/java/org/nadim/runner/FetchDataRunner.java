package org.nadim.runner;

import java.util.List;

import org.nadim.repository.EmployeeRepoI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FetchDataRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepoI eRepo;
	@Override
	public void run(String... args) throws Exception {
		List<Object[]> lists = eRepo.fetchEmpDeptData();
		System.out.println("EMP_ID"+" "+"EmpName"+" "+"DEPT"+" "+"DEPT HEAD");
		for(Object[] list : lists) {
			for(int i=0;i<list.length;i++) {
				System.out.print(list[i]+"   ");
			}
			System.out.println();
		}
	}

}
