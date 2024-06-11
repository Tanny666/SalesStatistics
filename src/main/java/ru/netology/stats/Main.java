package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        ru.netology.stats.StatsService stats = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Сумма всех продаж: " + stats.totalSales(sales));
        System.out.println("Средняя сумма продаж в месяц: " + stats.averageSales(sales));
        System.out.println("Месяц  с максимальными продажами: " + stats.maxSalesMonth(sales));
        System.out.println("Месяц с минимальными продажами: " + stats.minSalesMonth(sales));
        System.out.println("Продажи ниже среднего, кол-во в мес: " + stats.belowAverageMonths(sales));
        System.out.println("Продажи выше среднего, кол-во в мес: " + stats.aboveAverageMonths(sales));
    }
}