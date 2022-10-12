public class PizzaDeal {
    /**
     @param p 

      @returns 

     */

 

    public double deal(Pizza p) {

        return p.getPrice() / p.getShape().getArea();

    }
    /**

     * @param p1 

     * @param p2 

     * @returns 

     */

 

    public boolean betterDeal(Pizza p1, Pizza p2) {

        return deal(p1) < deal(p2);

    }

 

}