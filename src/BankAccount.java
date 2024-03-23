
// Рефакторинг: Переименование поля для улучшения понимания
// Принцип: Понятные названия
// Объяснение: Переименование поля balance в bankAccount в accountBalance
// повышает ясность и понимание его назначения.


// Класс содержит методы для получения и установки баланса.
public class BankAccount <B> {
    private B balance;

    public B getAccountBalance() {
        return balance;
    }

    public void setAccountBalance(B balance) {
        this.balance = balance;
    }

    public BankAccount(B balance) {
        this.balance = balance;
    }

    public BankAccount() {
    }

    public static void main(String[] args) {
        BankAccount<SavingsAccount<Ruble>> bankAccount = new BankAccount<>();
        bankAccount.setAccountBalance(new SavingsAccount<>(new Ruble()));
        bankAccount.getAccountBalance().transferMoney(1000);
        bankAccount.getAccountBalance().takeMoney(200);
        System.out.println(bankAccount.getAccountBalance().getSum());

    }
    
    
}
