package org.example;

import java.util.ArrayList;

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания
 */
public class Freelancer extends Employee {
    private ArrayList<WorkProject> projects;
    public Freelancer(String name, String surname, int age, WorkProject project) {
        super(name, surname);
        this.age = age;
        this.projects = new ArrayList<WorkProject>();
        this.projects.add(project);
    }

    /* Получить общий список проектов, назначенных на этого фрилансера*/
    public ArrayList<WorkProject> getAllProjects() {
        return projects;
    }

    public WorkProject getLastProject() {
        return projects.get(projects.size() - 1);
    }
    public void setProject(WorkProject project) {
        if (getLastProject().getFinished()) {
            this.projects.add(project);
        } else {
            System.out.println("Предыдущий проект ещё не закончен");
        }
    }
    @Override
    public double calculateSalary() {
        if (getLastProject().getFinished()) {
            return getLastProject().getPrice();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Freelancer %s %s, %d лет, ", surname, name, age) + projects;

    }
}
