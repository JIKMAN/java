public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    // 접근제어자
    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        }
    }
    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }

    public void setCashAmount(int newAmount) {
        if (newAmount > 0) {
            cashAmount = newAmount;
        }
    }
    public int getCashAmount() {
        return cashAmount;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount pAccount) {
        account = pAccount;
    }

}
