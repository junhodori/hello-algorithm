package solution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreedyAlgorithm {
    public static class Item {
        double weight;
        double value;

        public Item(double weight, double value) {
            this.weight = weight;
            this.value = value;
        }
    }
    public static void main(String[] args) {
        /**
         * 가방 용량 : 50kg
         */
        double capacity = 50;

        /**
         * 아이템 A : 무게 10kg / 가치 60
         * 아이템 B : 무게 20kg / 가치 100
         * 아이템 C : 무게 15kg / 가치 120
         */
        List<Item> items = Arrays.asList(
            new Item(10, 60),
            new Item(20, 100),
            new Item(30, 120)
        );

        double maxValue = fractionalKnapsack(items, capacity);
        System.out.println("maxValue : " + maxValue);
    }

    public static double fractionalKnapsack(List<Item> items, double capacity) {
        items = items.stream().sorted((a, b) -> {
            double aRatio = a.value / a.weight;
            double bRatio = b.value / b.weight;

            if (aRatio < bRatio) {
                return 1;
            } else if (aRatio == bRatio) {
                return 0;
            } else {
                return -1;
            }
        }).collect(Collectors.toList());

        double totalValue = 0;
        double curCappacity = capacity;

        System.out.println(items);

        for (Item item : items) {
            if (item.weight <= curCappacity) {
                curCappacity -= item.weight;
                totalValue += item.value;
            } else {
                double valuePerWeight = item.value / item.weight;
                totalValue += (curCappacity * valuePerWeight);
                break;
            }
        }
        return totalValue;
    }
}
