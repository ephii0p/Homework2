public class Sale {
    public static void main(String[] args) {
        final int costShirt = 3550; // цена рубашки
        int quantityShirt = 6; //количество в корзине, изменится, когда захотим получить скдку
        final int quantityShirtForDiscount = 10; // количество рубашек для скидки

        int quantityNeededForDiscount = quantityShirtForDiscount - quantityShirt;
        System.out.println(quantityNeededForDiscount);

        int sumOfPrice = costShirt * quantityShirt;
        System.out.println(sumOfPrice);

        int neededForDiscount = costShirt * quantityNeededForDiscount;
        System.out.println(neededForDiscount);

        double discount = 32.1; //скидка
        double sumShirtsWithDiscount = (sumOfPrice + neededForDiscount) -
                ((sumOfPrice + neededForDiscount) / 100 * discount);
        System.out.println(sumShirtsWithDiscount);

        double costShirtwithDiscount = costShirt - (costShirt / 100 * discount);
        System.out.println(costShirtwithDiscount);

        double economy = (sumOfPrice + neededForDiscount) - sumShirtsWithDiscount;
        System.out.println(economy);

        double freeShirts = economy / costShirt;
        System.out.println(freeShirts);
    }
}
