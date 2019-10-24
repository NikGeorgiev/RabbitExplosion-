package com.spartaglobal.RabbitExplosion;

public class App
{
    public static void main( String[] args ) {

//        RabbitLifeManagement rabbitLifeManagement = new RabbitLifeManagement();
//        rabbitLifeManagement.getNumOfRabbits();

        RabbitManager rabbitManager = new RabbitManager();
//        rabbitManager.BreedNewRabbit(true, 3, true, true,1);
        rabbitManager.Birth();

    }
//        GlobalTimer globalTimer = new GlobalTimer(1);
//        System.out.println(globalTimer);
//    }
}
