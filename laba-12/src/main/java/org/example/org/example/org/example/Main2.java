package org.example.org.example.org.example;

import org.example2.org.example.Z_1;

public class Main2 {
    public static void main(String[] args) {
        Z_1 tester1= new Z_1("ksu","shishatskaya");
        Z_1 tester2=new Z_1("sofi","mendeleva", 5);
        Z_1 tester3=new Z_1("nurik","abdusalomov",5,"Pre-Intermediate",5000.2);

        tester1.printDetails();
        tester2.printDetails(true);
        tester3.printDetails(true, true);
        Z_1.printGoodbye();
    }
}
