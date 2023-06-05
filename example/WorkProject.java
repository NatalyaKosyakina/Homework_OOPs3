package org.example;

public class WorkProject{
    private String name;
    private boolean finished = false;
    private double price;


    public WorkProject(String name, double price){
        this.name = name;
        if (price >= 0) {
            this.price = price;
        }
        else {
            this.price = price * (-1);
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void changePrice(double price) {
        this.price = price;
    }


    public void setFinished() {
        if (this.finished) {
            this.finished = false;
        } else {
            this.finished = true;
        }
    }
    public boolean getFinished(){
        return finished;
    }



    @Override
    public String toString() {
        String ending = finished ? "завершен" : "не завершен";
        return '\n' + "Проект '" + name + "' " +
                ending +
                ", цена проекта: " + price;
    }
}
