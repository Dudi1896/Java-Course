package org.dbtester;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.selectDB(8);
        s1.updateDB(17,
                    "Shannon",
                    "Peters",
                    "1200 Edmund Grove Street",
                    "Johns Creek",
                    "shayPeters@gmail.com",
                    3.9,
                    "GA",
                    30056);
        s1.display();

        Student s2 = new Student();
        s2.insertDB(18,
                    "Mike",
                    "James",
                    "432 Elmor Street",
                    "Sacremento",
                    "markJames@gmail.com",
                    3.5,
                    "CA",
                    94123);
        s2.deleteDB(19);
    }
}