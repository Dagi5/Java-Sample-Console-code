    package multiThreading.testing1;

    import java.util.Random;

    public class tasks implements Runnable {

        private String taskName;
        private int sleepTime;
        private final static Random generator = new Random();

        public tasks(String sT) {
            taskName = sT;
            sleepTime = generator.nextInt(5000);
        }

        @Override
        public void run() {
            
            try {
                System.out.println(taskName + " started executing");
                System.out.println(taskName + "sleeping for " + sleepTime);
                Thread.sleep(sleepTime);

            } catch (InterruptedException e) {
        System.out.println(taskName + "stopped for some reason");
            }
            
            System.out.println(taskName + "done sleeping");
        }

    }