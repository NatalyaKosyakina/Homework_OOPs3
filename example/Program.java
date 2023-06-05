package org.example;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */

    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salary = random.nextInt(20000, 80000);
        if (random.nextInt(1, 10) < 7){
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary, random.nextInt(18, 65));
        }
        else {
            WorkProject someproject = new WorkProject(("Task"+random.nextInt(1, 15)), salary);
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], random.nextInt(18, 65), someproject);
        }
    }



    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *   Придумать несколько Comparator'ов для сортировки сотрудников
     *   по фамилии + имени или по возрасту + уровню зп.
     * @param args
     */
    public static void main(String[] args) {



        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
        {
            employees[i] = generateEmployee();
        }

        for (Employee employee: employees) {
            System.out.println(employee + "\n");
        }
        Arrays.sort(employees, new AgeComparator());
        for (Employee employee: employees){
            System.out.println(employee + "\n");
        }
    }
}
