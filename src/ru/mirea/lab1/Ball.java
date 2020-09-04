package ru.mirea.lab1;

public class Ball {
    private String mark;
    private int cost;

    public Ball(String mark, int cost){
        this.mark = mark;
        this.cost = cost;
    }

    public Ball(String mark){
        this.mark = mark;
        cost = 0;
    }

    public Ball(){
        mark = "";
        cost = 0;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "mark='" + mark + '\'' +
                ", cost=" + cost +
                '}';
    }
}
