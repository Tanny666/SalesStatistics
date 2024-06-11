import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import ru.netology.stats.StatsService;

class StatsServiceTest {

    @Test
        // Тест Сумма всех продаж
    void shouldCalculateTotalSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180; // Ожидаемое значение продаж
        long actual = service.totalSales(sales); // Расчет фактического значения продаж
        assertEquals(expected, actual);
    }

    @Test
        // Тест Средняя сумма продаж в месяц
    void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15; // Ожидаемое значение средних продаж
        double actual = service.averageSales(sales); // Расчет фактического значения средних продаж
        assertEquals(expected, actual);
    }

    @Test
        // Тест Месяц  с максимальными продажами
    void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8; // Ожидаемый номер месяца с max продажами
        int actual = service.maxSalesMonth(sales); // Расчет фактического номера месяца с max продажами
        assertEquals(expected, actual);
    }

    @Test
        // Тест Месяц с минимальными продажами
    void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9; // Ожидаемый номер месяца с min продажами
        int actual = service.minSalesMonth(sales); // Расчет фактического номера месяца с min продажами
        assertEquals(expected, actual);
    }

    @Test
        // Тест Продажи ниже среднего, кол-во в мес
    void shouldCalculateBelowAverageMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5; // Ожидаемое количество месяцев
        int actual = service.belowAverageMonths(sales); // Расчет фактического количества месяцев
        assertEquals(expected, actual);
    }

    @Test
        // Тест Продажи выше среднего, кол-во в мес
    void shouldCalculateAboveAverageMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // Массив с данными о продажах
        int expected = 5; // Ожидаемое количество месяцев
        int actual = service.aboveAverageMonths(sales); // Расчет фактического количества месяцев
        assertEquals(expected, actual);
    }
}