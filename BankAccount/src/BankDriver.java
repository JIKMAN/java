public class BankDriver {
    public static void main(String[] args) {
        // 사람
//        Person p1 = new Person();
//        p1.setName("김두한");
//        p1.setAge(28);
//        p1.setCashAmount(30000);


        // 은행 계좌 생성
        Person p1 = new Person("김두한", 28, 30000);

        BankAccount a1 = new BankAccount(100000, p1);
        p1.setAccount(a1);

        Person p2 = new Person("홍길동", 30, 100000);

        BankAccount a2 = new BankAccount(500000, p2);
        p2.setAccount(a2);


        a2.deposit(30000);
        a2.withdraw(170000);
        a2.deposit(620000);
        a2.withdraw(890000);

        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);
    }
}
