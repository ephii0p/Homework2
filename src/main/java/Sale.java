public class Sale {
    public static void main(String[] args) {
        final int costShirt = 3550; // цена рубашки
        int quantityShirt = 6; //количество в корзине, изменится, когда захотим получить скдку
        final int quantityShirtForDiscount = 10; // количество рубашек для скидки

        int quantityNeededforDiscount = quantityShirtForDiscount - quantityShirt;
        System.out.println(quantityNeededforDiscount);

        int sumofprice = costShirt * quantityShirt;
        System.out.println(sumofprice);

        int neededforDiscount = costShirt * quantityNeededforDiscount;
        System.out.println(neededforDiscount);

        double discount = 32.1; //скидка
        double sumShirtswithDiscount = (sumofprice + neededforDiscount) -
                ((sumofprice + neededforDiscount) / 100 * discount);
        System.out.println(sumShirtswithDiscount);

        double costShirtwithDiscount = costShirt - (costShirt / 100 * discount);
        System.out.println(costShirtwithDiscount);

        double economy = (sumofprice + neededforDiscount) - sumShirtswithDiscount;
        System.out.println(economy);

        double FreeShirts = economy / costShirt;
        System.out.println(FreeShirts);
    }
}
