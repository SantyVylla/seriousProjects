public class Cookies {
    public static void main(String[] args) {
        Cookie cookie = new Cookie();
        Cookie cookie2 = new Cookie();
        cookie.flavor = "Chocolate";
        cookie2.flavor = "Vanilla";
        cookie.glaze = true;
        cookie2.glaze = false;
        cookie.dessert.drink = "milk";
        cookie2.dessert.drink = "tea";
        cookie.dessert.iceCream = "vanilla";
        cookie2.dessert.iceCream = "coffe";

        Companion p = cookie.getDessert();
        Companion q = cookie2.getDessert();
        System.out.println(p.drink + " " + p.iceCream);
        System.out.println(q.drink + " " + q.iceCream);

        

    }
}