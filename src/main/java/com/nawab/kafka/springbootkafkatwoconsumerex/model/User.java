package com.nawab.kafka.springbootkafkatwoconsumerex.model;

public class User {

    private String name;
    private String desig;

    public User() {
    }

    public User(String name, String desig) {
        this.name = name;
        this.desig = desig;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", desig='" + desig + '\'' +
                '}';
    }
}
