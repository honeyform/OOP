package TypesOfFurniture;

import TypesOfFurniture.TypesOfMaterial.Materials;

/**
 * Created by Honey on 20.09.2015.
 */
public abstract class Bookcase extends Furniture{
    public Bookcase(String name, int weight, int width, int length, Materials material, int materialAmount) {
        super(name, weight, width, length, material, materialAmount);
    }
}
