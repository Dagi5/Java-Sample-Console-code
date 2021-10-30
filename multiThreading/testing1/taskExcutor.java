package CONSOLE.multiThreading.testing1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class taskExcutor {

    public static void main(String[] args) {
        
        tasks task1 = new tasks("task1");
        tasks task2 = new tasks("task2");
        tasks task3 = new tasks("task3");
    
    
        ExecutorService taskEx = Executors.newCachedThreadPool();
    
        taskEx.execute(task1);
        taskEx.execute(task2);
        taskEx.execute(task3);

        taskEx.shutdown();
        
        System.out.println("all done");
    }
   




}