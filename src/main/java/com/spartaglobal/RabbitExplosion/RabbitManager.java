package com.spartaglobal.RabbitExplosion;



import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class RabbitManager {

    int r =0;
    private Random random = new Random();

    public int getNumOfRabbits() {
        r = (int) (Math.random() * ((14 - 1) )) + 1;
        return r;
    }

    public Rabbit breedNewRabbit(boolean pregnant, int age, boolean mature, boolean alive, int gender) {
        Rabbit rabbit = new Rabbit();

        rabbit.setPregnant(pregnant);
        rabbit.setAge(age);
        rabbit.setMature(mature);
        rabbit.setAlive(alive);
        rabbit.setGender(gender);

        return rabbit;
    }

    List<IRabbit> RabbitList = new ArrayList<>();
    List<IRabbit> FemaleRabbitList = new ArrayList<>();
    List<IRabbit> MaleRabbitList = new ArrayList<>();

    public void Birth() {
        int b = 60;
        for (int i = 0; i < b; i++) {
            getNumOfRabbits();
            addToRabbitArray(true,1,true,true,1);
        }
    }

    public void addToRabbitArray(boolean pregnant, int age, boolean mature, boolean alive, int gender) {

        for (int i = 0; i < r;i++) {
            gender = (int)(Math.random() * (10 - 0));
            if (gender <= 5) {
                FemaleRabbitList.add(breedNewRabbit(pregnant, age, mature, alive, gender));
            } else {
                MaleRabbitList.add(breedNewRabbit(pregnant, age, mature, alive, gender));
            }

            RabbitList.add(breedNewRabbit(pregnant, age, mature, alive, gender));
            System.out.println("Total Rabbits : " + RabbitList.size());
            System.out.println("Female Rabbits : " + FemaleRabbitList.size());
            System.out.println("Male Rabbits : " + MaleRabbitList.size());
        }
    }
}

