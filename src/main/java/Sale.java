public class Sale {
    public static void main(String[] args) {
    int CostShirt = 3550;
    int quantityShirt = 6;
    final int QUANTITY_SHIRT_FOR_DISCOUNT = 10;

    int quantityNeededforDiscount = QUANTITY_SHIRT_FOR_DISCOUNT-quantityShirt;
        System.out.println(quantityNeededforDiscount);

        int sumofprice = CostShirt*quantityShirt;
        System.out.println(sumofprice);

        int NeededforDiscount = CostShirt*quantityNeededforDiscount;
        System.out.println(NeededforDiscount);

        double Discount = 32.1;
        double sumShirtswithDiscount = (sumofprice+NeededforDiscount)-
                ((sumofprice+NeededforDiscount)/100*Discount);
        System.out.println(sumShirtswithDiscount);

        double CostShirtwithDiscount = CostShirt-(CostShirt/100*Discount);
        System.out.println(CostShirtwithDiscount);

        double Economy = (sumofprice+NeededforDiscount)-sumShirtswithDiscount;
        System.out.println(Economy);

        double FreeShirts = Economy/CostShirt;
        System.out.println(FreeShirts);
    }
}
