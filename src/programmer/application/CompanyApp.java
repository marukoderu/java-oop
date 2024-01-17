package programmer.application;

import programmer.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Marunayo Net");

        Company.Employee employee = company.new Employee();
        employee.setName("Raihan");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Not Exist");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Budi");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
