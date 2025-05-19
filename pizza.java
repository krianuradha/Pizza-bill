public class pizza {

    private int price;
    private Boolean veg;
    private int extraChesse=70;
    private int extraTopping=50;
    private int packCharge=20;
    private int basePizzaPrice;

    private Boolean extraChesseAdded=false;
    private Boolean extraToppingAdded=false;
    private Boolean takeAwayOpted=false;


    public pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg)
        {
            this.price=300;
        }
        else {
             this.price=400;
        }
        basePizzaPrice=this.price;
    }

public void addExtraCheese(){
        extraChesseAdded=true;

this.price+=extraChesse;
}

public void addExtraTopping(){
        extraToppingAdded=true;

this.price+=extraTopping;
}
public void takeAway(){
        takeAwayOpted=true;

   this.price+=packCharge;
}

public void getBill(){
        String bill="";

    System.out.println("Pizza : " +basePizzaPrice);

    if(extraChesseAdded){
        bill+="Extra cheese added:  " +extraChesse +"\n";

    }
    if(extraToppingAdded){
        bill+="Extra toppings added:  " +extraTopping +"\n";
    }
    if(takeAwayOpted){
        bill+="Take away opted: " +packCharge +"\n";
    }

    bill+="Total bill : " +this.price;

    System.out.println(bill);
}
}
