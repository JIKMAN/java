public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    // 생성자
    public Person(String pName, int pAge, int pCashAmount) {
        name = pName;
        age = pAge;
        cashAmount = pCashAmount;
    }
    // 오버로딩
    public Person(String pName, int pAge) {
        name = pName;
        age = pAge;
        cashAmount = 0;
    }

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

    public boolean transfer(Person to, int amount) {
        return account.transfer(to.getAccount(), amount);

    }

    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to, amount);
    }

}
