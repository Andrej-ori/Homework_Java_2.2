public class Main {
    public static void main(String[] args) {

        int invoiceAmount = 365; // Сумма на счете клиента
        int replenishmentAmount = 4876; // Сумма пополнения счета клиента
        int bonusAmount = 1; // Сумма бонуса
        int bonus; // количество начисленных бонусов

        System.out.println("Начальные данные: у клиента на счёте " + invoiceAmount + " рублей(я)."); // Вывод начальной суммы на счете клиента

        if (replenishmentAmount >= 1_000) { // проверка выопления условия для начисления бонуса
            bonus = replenishmentAmount / 100 * bonusAmount; // расчет суммы бонуса
        }
        else { // условие для начисления бонуса не выполнено
            bonus = 0; // бонус равен нулю
        }
        invoiceAmount = invoiceAmount + replenishmentAmount + bonus; // расчет итоговой суммы после пополнения счета и начисления бонусных рублей

        if (bonus == 0) {
            System.out.println("Клиент пополнил счёт на " + replenishmentAmount + " рублей(я) - бонусов нет, итоговая сумма на счету клиента - " + invoiceAmount + " рублей(я).");
        }
        else {
            System.out.println("Клиент пополнил счёт на " + replenishmentAmount + " рублей(я) - бонус равен " + bonus + " рублям(ю), итоговая сумма на счету клиента - " + invoiceAmount + " рублей(я).");
        }
        // вывод суммы пополнения, итоговой суммы и количества бонусов

    }
}