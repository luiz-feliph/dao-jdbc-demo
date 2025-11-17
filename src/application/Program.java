package application;

import entities.Department;
import entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.of(2025, 11, 21), 3000.0, obj);

        System.out.println(obj);
        System.out.println(seller);
    }
}
