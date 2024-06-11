package ru.netology.stats;

public class StatsService {
    // сумма всех продаж
    public long totalSales(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total = total + sale;
        }
        return total;
    }

    // средняя сумма продаж в мес
    public double averageSales(long[] sales) {
        return (double) totalSales(sales) / sales.length;
    }

    // месяц с максимальными продажами
    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // месяц с минимальными продажами
    public int minSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // Продажи ниже среднего, кол-во в мес
    public int belowAverageMonths(long[] sales) {
        double average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    // Продажи выше среднего, кол-во в мес
    public int aboveAverageMonths(long[] sales) {
        double average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}