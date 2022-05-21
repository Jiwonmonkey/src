package Sort;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sort_10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Person[] p = new Person[n];

        for(int i = 0; i < n; i++) {
            p[i] = new Person(sc.nextInt(), sc.next());
        }

        Arrays.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.age - p2.age;
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            // 객체 배열의 객체를 출력시 toString()(주소값)이 출력됨
            sb.append(p[i]);
        }

        System.out.println(sb);

    }
    public static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        // Override
        public String toString() {
            return age + " " + name + "\n";
        }
    }
}
