public class BankAccount {
    private int balance;
    private Person owner;

    public BankAccount(int pBalance) {
        if (pBalance < 0) {
            balance = 0;
        } else {
            balance = pBalance;
        }
    }
    public BankAccount(Person pOwner) {
        owner = pOwner;
        balance = 0;
    }

    public BankAccount(int pBalance, Person pOwner) {
        if (pBalance < 0) {
            balance = 0;
        } else {
            balance = pBalance;
        }
        owner = pOwner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int pBalance) {
        balance = pBalance;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person pOwner) {
        owner = pOwner;
    }



    // 파라미터 : 입금할 액수(정수)
    // 리턴 : 성공여부(불린)
    boolean deposit(int amount) {
        // 1. write code here
        if (amount >= 0 && owner.getCashAmount() >= amount) {
            balance += amount;
            owner.setCashAmount(owner.getCashAmount() - amount);
            System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        } else {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }
    }

    public boolean deposit(double amount, double exchangeRate) {
        return deposit((int) (amount * exchangeRate));
    }

    // 파라미터 : 출금할 액수(정수)
    // 리턴 : 성공여부(불린)
    boolean withdraw(int amount) {
        // 2. write code here
        if (balance >= amount && amount >= 0) {
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        } else {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }
    }

    public boolean transfer(BankAccount to, int amount) {
        boolean success;

        if (amount < 0 || amount > balance) {
            success = false;
        } else {
            balance -= amount;
            to.balance += amount;
            success = true;
        }

        System.out.println(success + " - from: " + owner.getName() + ", to: " + to.owner.getName() + ", amount: " + amount + ", balance: " + balance);

        return success;
    }

    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }
}
