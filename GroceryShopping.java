//*GroceryShopping.java

/**

*@Nelson

*

*/

public class GroceryShopping {
	
     //constants

     public static final double SERVICE_RATE = 3.0;

   public static final int DELIVERY_FEE = 0;


    //instance variable of the class

    private String vegetableName;

    private String fruitName;

    private double vegetablePrice;

    private double fruitPrice;

    private double vegetableOrdered;

    private double fruitOrdered;


     /**

       *@return the vegetableName

       */

       public String getVegetableName() {

           return vegetableName;

       }

       /**

       *@param vegetableName the vegetableName to set

       */

       public void setVegetableName(String vegetableName) {
	
	  this.vegetableName = vegetableName;

       }

       /**

       *@return the fruitname

       */

        public String getFruitName() {

            return fruitName;

        }

        /**

        *@param fruitName the fruitName to set

        */

        public void setFruitName(String fruitName) {

          this.fruitName = fruitName;

        }

        /**

        *@return the vegetablePrice

        */

        public double getVegetablePrice() {

            return vegetablePrice;

        }

        /**

        *@param vegetablePrice the vegetablePrice to set

        */

        public void setVegetablePrice(double vegetablePrice) {

           this.vegetablePrice = vegetablePrice;

        }

        /**

        *@return the fruitPrice

        */

        public double getFruitPrice() {

           return fruitPrice;

        }

        /**

        *@param fruitPrice the fruitPrice to set

        */

        public void setFruitPrice(double fruitPrice) {

           this.fruitPrice = fruitPrice;

        }

        /**

        *@return the vegetableOrdered

        */

        public double getVegetableOrdered() {

           return vegetableOrdered;

        }

        /**

        *@param vegetableOrdered the vegetableOrdered to set

        */

        public void setVegetableOrdered(double vegetableOrdered) {

           this.vegetableOrdered = vegetableOrdered;

        }

        /**

        *@return the fruitOrdered

        */

        public double getFruitOrdered() {

           return fruitOrdered;

        }

        /**

        *@param fruitOrdered the fruitOrdered to set

        */

        public void setFruitOrdered(double fruitOrdered) {

          this.fruitOrdered = fruitOrdered;

        }



        /**
  
          *@param vegetableName

          *@param fruitName

          *@param vegetablePrice

          *@param fruitPrice

          */

          public GroceryShopping(String vegetableName, String fruitName,
              
                   double vegetablePrice, double fruitPrice) {

            super();

            this.vegetableName = vegetableName;

            this.fruitName = fruitName;

            this.vegetablePrice = vegetablePrice;
java
            this.fruitPrice = fruitPrice;

            this.vegetableOrdered = 0;

            this.fruitOrdered = 0;


          }

           public double calculateSubtotal(){

	   return (vegetablePrice*vegetableOrdered) + (fruitPrice*fruitOrdered);


          }


	  public double calculateAdditionalFee(){

             return calculateSubtotal()* SERVICE_RATE + DELIVERY_FEE;

          }


          public void displayOrderSummary(){

           double totalBill=calculateSubtotal()+calculateAdditionalFee();

            System.out.println(".......................");

            System.out.println("Grocery Shopping Order Summary");

            System.out.println("Sub-total:     $"+calculateSubtotal());

            System.out.println("Additional Fee     $"+calculateAdditionalFee());

            System.out.println("Total Bill    $"+totalBill);

            System.out.println(".....................");

          }

        }
	
            
        

        

