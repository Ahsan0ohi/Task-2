
//Name: Ahshanul Haque Chowdhury
//Id: 2012020107
//Section: C
//E-mail:cse_2012020107@lus.ac.bd
//Date:06-10-2021

package Ahsan;

public class Student {
    String name;
    int id;
    static String universityName;

    Student()
    {
        // This is a default constructor
        universityName = "Leading University";
    }

    Student(int id)
    {
        this.id = id;
        System.out.println("Student's ID is: " + id);
    }

    Student(String name)
    {
        this.name = name;
        System.out.println("Student's name is: " + name);
    }

    void display()
    {
        System.out.println("Name of the university is: " + universityName);
    }
}

