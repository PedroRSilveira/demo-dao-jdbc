package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		SellerDao sellerDao = DaoFactory.createSellerDao();
		*/
		
		/*
		System.out.println("TEST 1: Seller findById\n");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		*/
		
		/*
		System.out.println("\nTEST 2: Seller findByDepartment\n");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		*/
		
		/*
		System.out.println("\nTEST 3: Seller findAll\n");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		*/
		
		/*
		System.out.println("\nTEST 4: Seller insert\n");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id: " + newSeller.getId());
		*/
		
		/*
		System.out.println("\nTEST 5: Seller update\n");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed");
		*/
		
		/*
		System.out.println("\nTEST 6: Seller delete\n");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		*/
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("TEST 1: Department findById\n");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\nTEST 2: Department findByDepartment\n");
		List<Department> list = departmentDao.findAll();
		for(Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("\nTEST 4: Department insert\n");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New department: " + newDepartment.getName() + ", id: " + newDepartment.getId());
		
		sc.close();
	}
}