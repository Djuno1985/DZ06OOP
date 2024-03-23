// Класс SavingsAccount расширяет BankAccount и представляет собой счет для накоплений.
// Он параметризован типом Money (и его подклассами), что позволяет хранить сумму в различных валютах.
// Класс содержит методы для перевода денег на счет и снятия денег со счета.

public class SavingsAccount <T extends Money> extends BankAccount{
    private T sum;

    void transferMoney (int count){
        sum.setCount(sum.getCount() + count);
    }

    void takeMoney(int count){
        sum.setCount(sum.getCount() - count);
    }

    public T getSum() {
        return sum;
    }

    public SavingsAccount(T sum) {
        this.sum = sum;
    }
}
