package com.mechalikh.pureedgesim.TasksGenerator;

import com.mechalikh.pureedgesim.ScenarioManager.SimulationParameters;

import java.util.Random;
import java.util.function.DoubleToIntFunction;

public class MyTest {
    public static void main(String[] args) {
        Random random = new Random(50);
        for (int dev = 0; dev < 10; dev++) { // for each device
            int app = random.nextInt(4); // pickup a random application type for every device
            System.out.println(app);
        }
    }
}