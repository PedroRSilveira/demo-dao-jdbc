package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("TEST 1: Department findById\n");
		Department department2 = departmentDao.findById(1);
		System.out.println(department2);

		System.out.println("\nTEST 2: Department findAll\n");
		List<Department> list2 = departmentDao.findAll();
		for (Department d : list2) {
			System.out.println(d);
		}

		System.out.println("\nTEST 3: Department insert\n");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New department: " + newDepartment.getName() + ", id: " + newDepartment.getId());

		System.out.println("\nTEST 4: Department update\n");
		Department dep2 = departmentDao.findById(7);
		dep2.setName("Food");
		departmentDao.update(dep2);
		System.out.println("Update completed");

		System.out.println("\nTEST 5: Department delete\n");
		System.out.print("Enter id for delete test: ");
		int id2 = sc.nextInt();
		departmentDao.deleteById(id2);
		System.out.println("Delete completed");

		sc.close();
	}
}