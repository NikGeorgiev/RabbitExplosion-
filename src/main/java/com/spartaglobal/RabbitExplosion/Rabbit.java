package com.spartaglobal.RabbitExplosion;

public class Rabbit implements IRabbit{

    private boolean pregnant;
    private int age;
    private boolean mature;
    private boolean alive;
    private int gender;


    @Override
    public boolean getPregnant() {

        return pregnant;
    }
    @Override
    public void setPregnant(boolean pregnant) {

        this.pregnant = pregnant;
    }
    @Override
    public int getAge() {

        return age;
    }
    @Override
    public void setAge(int age) {

        this.age = age;
    }
    @Override
    public boolean getMature() {

        return mature;
    }
    @Override
    public void setMature(boolean mature) {

        this.mature = mature;
    }
    @Override
    public boolean getAlive() {

        return alive;
    }
    @Override
    public void setAlive(boolean alive) {

        this.alive = alive;
    }
    @Override
    public int getGender() {
        return gender;
    }
    @Override
    public void setGender(int gender) {

        this.gender = gender;
    }
}
