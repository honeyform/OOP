package TypesOfFurniture;

import TypesOfFurniture.TypesOfMaterial.Metal;
import TypesOfFurniture.TypesOfMaterial.Paint;
import TypesOfFurniture.TypesOfMaterial.Skin;
import TypesOfFurniture.TypesOfMaterial.Wood;

/**
 * Created by Honey on 20.09.2015.
 */
public class Chair extends Furniture {
    public Chair() {
        super("Chair", 2, 3, 3, new Wood(), 5);
    }

    @Override
    public int calculateCost(){
        return this.getMaterial().getPrice() * this.getMaterialAmount() + new Skin().getPrice() * 2;
        //System.out.println("The cost of ordering is " + this.getMaterial().getPrice() * this.getMaterialAmount() + new Skin().getPrice() * 2 + " UAN.");
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + this.getName() + '\'' +
                ", weight=" + this.getWeight()+
                ", width=" + this.getWidth() +
                ", length=" + this.getLength() +
                ", material=" + this.getMaterial() +
                ", materialAmount=" + this.getMaterialAmount() +
                ", material=skin" +
                ", materialAmount=2"+

                '}';
    }
}
