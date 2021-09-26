package com.sw_dev.inheritance.exercises.exercise2_2;

public class Shape {
    private String color;
    private Boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, Boolean filled) {
        this.color  = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return this.filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return String.format("A Shape with color of %s and %s", this.getColor(), filled? "filled" : "Not filled");
    }
}
