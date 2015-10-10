package TypesOfFurniture;

import TypesOfFurniture.TypesOfMaterial.Wood;

/**
 * Created by Honey on 20.09.2015.
 */
public class Desk extends Furniture {
    public Desk() {
        super("Desk", 5, 2, 3, new Wood(), 5);
    }
}
