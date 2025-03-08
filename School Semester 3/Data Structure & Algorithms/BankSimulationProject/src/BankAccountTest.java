// BankAccountTest.java
// Student: Tran Truong Quoc Bao
// Student ID: 4164529859

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // This is deposit threads
        Thread[] depositThreads = new Thread[10];
        for (int i = 0; i < depositThreads.length; i++) {
            depositThreads[i] = new Thread(() -> {
                try {
                    for (int j = 0; j < 100; j++) {
                        account.deposit(1000);  // Deposit 1000 repeatedly
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // This is withdrawal threads
        Thread[] withdrawThreads = new Thread[10];
        for (int i = 0; i < withdrawThreads.length; i++) {
            withdrawThreads[i] = new Thread(() -> {
                try {
                    for (int j = 0; j < 100; j++) {
                        account.withdraw(500);  // Withdraw 500 repeatedly
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // I start deposit threads and withdrawal threads
        for (Thread thread : depositThreads) {
            thread.start();
        }
        for (Thread thread : withdrawThreads) {
            thread.start();
        }

        // Wait for all of them to finish and prinit the final balance
        try {
            for (Thread thread : depositThreads) {
                thread.join();
            }
            for (Thread thread : withdrawThreads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Final Balance: " + account.getBalance());
    }
}
