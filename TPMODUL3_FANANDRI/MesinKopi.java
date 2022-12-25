public class MesinKopi implements Runnable {

    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int coffeeNumber = 1;

    @Override
    public void run() {
        while (true) {
            makeCoffee();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getCoffeeNumber() {
        return coffeeNumber;
    }

    public void makeCoffee() {
        synchronized (MesinKopi.lock) {

            if (this.waitingForPickup) {
                try {
                    System.out.println("Coffee Machine: Waiting for the Waiter to deliver the coffee");
                    MesinKopi.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            // to inform another thread that another coffee is ready to deliver
            waitingForPickup = true;
            System.out.println("Coffee Machine:  Making Coffee Number " + coffeeNumber++);
            MesinKopi.lock.notifyAll();
            System.out.println("Coffee Machine: Telling the waiter to get the coffee\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}