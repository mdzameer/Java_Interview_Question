package asgmnt1.oops;

class ATM {
    private int pin;
    private double balance;
    private int attempts;
    private boolean isLocked;

    public ATM(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
        this.attempts = 0;
        this.isLocked = false;
    }

    public void withdraw(int enteredPin, double amount) {
        if (isLocked) {
            System.out.println("Account Locked");
            return;
        }

        if (enteredPin != pin) {
            attempts++;
            System.out.println("Incorrect PIN");
            if (attempts >= 3) {
                isLocked = true;
                System.out.println("Account Locked");
            }
            return;
        }

        attempts = 0;

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void deposit(int enteredPin, double amount) {
        if (isLocked) {
            System.out.println("Account Locked");
            return;
        }

        if (enteredPin != pin) {
            attempts++;
            System.out.println("Incorrect PIN");
            if (attempts >= 3) {
                isLocked = true;
                System.out.println("Account Locked");
            }
            return;
        }

        attempts = 0;
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void changePIN(int enteredPin, int newPin) {
        if (isLocked) {
            System.out.println("Account Locked");
            return;
        }

        if (enteredPin != pin) {
            attempts++;
            System.out.println("Incorrect PIN");
            if (attempts >= 3) {
                isLocked = true;
                System.out.println("Account Locked");
            }
            return;
        }

        attempts = 0;
        pin = newPin;
        System.out.println("PIN Changed");
    }
}
