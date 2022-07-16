package com.payroll;

import com.payroll.model.Department;
import com.payroll.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PayrollInclude {

    public static void main(String[] string) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PayrollPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //instance department
        Department department1 = new Department();
        department1.getNome("Vendas");

        //instance two employee
        Employee employee1 = new Employee();
        employee1.setNome("Enrique Amorim");
        employee1.setDepartment(department1);

        Employee employee2 = new Employee();
        employee2.setNome("Ana Amorim");
        employee2.setDepartment(department1);

        //start transactions and persistence objects
        entityManager.getTransaction().begin();

        entityManager.persist(department1);
        entityManager.persist(employee1);
        entityManager.persist(employee2);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
