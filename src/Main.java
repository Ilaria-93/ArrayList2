/*Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        //ArrayList con 12 elementi e stampato
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Mario", 21));
        students.add(new Student("Lisa", 22));
        students.add(new Student("Riccardo", 25));
        students.add(new Student("Anna", 24));
        students.add(new Student("Marta", 23));
        students.add(new Student("Carlo", 20));
        students.add(new Student("Carlotta", 21));
        students.add(new Student("Ilaria", 28));
        students.add(new Student("Gianni", 29));
        students.add(new Student("Giuseppe", 27));
        students.add(new Student("Carla", 20));
        students.add(new Student("Roberto", 30));

        System.out.println("The list of students is: ");
        for (Student student : students) {
            System.out.println(student.getName() + ", " + student.getAge());
        }

        //aggiungo una riga vuota come separatore
        System.out.println();

        //riordino la lista per nome
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //stampo la lista riordinata per nome
        System.out.println("The sorted by name list of students is: ");
        for (Student student : students) {
            System.out.println(student.getName() + ", " + student.getAge());
        }

        //aggiungo una riga vuota come separatore
        System.out.println();

        //riordino la lista per età
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        //stampo la lista riordinata per età
        System.out.println("The sorted by age list of students is: ");
        for (Student student : students) {
            System.out.println(student.getName() + ", " + student.getAge());
        }
    }
}