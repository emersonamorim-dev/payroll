package com.payroll;

import com.payroll.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PayrollMain {

    public static void main(String[] string) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PayrollPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //search Employee of cod1
        Employee employee1 = entityManager.find(Employee.class, 1);

        //search Employee of cod2
        Employee employee2 = entityManager.find(Employee.class, 2);

        //name of department
        System.out.printf("Employee %s in department %s%n",
                employee1.getNome(), employee1.getDepartment().getNome("Vendas"));

        System.out.printf("Employee %s in department %s%n",
                employee2.getNome(), employee2.getDepartment().getNome("Vendas"));

        entityManager.close();
        entityManagerFactory.close();
    }
}
