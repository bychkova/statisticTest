package ru.netology.stats;

public class StatsService {

    public int getSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int getAverageSale(int[] sales) {
        return getSum(sales) / sales.length;
    }

    public int maxSalesMonth(int[] sales) {
        int maxSale = sales[0];
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                maxMonth = i + 1;
            }
        }
        return maxMonth;
    }

    public int minSalesMonth(int[] sales) {
        int minSale = sales[0];
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minSale = sales[i];
                minMonth = i + 1;
            }
        }
        return minMonth;
    }

    public int getSalesBelowAverage(int[] sales) {
        int average = getAverageSale(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int getSalesAboveAverage(int[] sales) {
        int average = getAverageSale(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }

}