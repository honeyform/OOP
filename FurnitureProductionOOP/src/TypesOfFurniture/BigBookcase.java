package TypesOfFurniture;

import TypesOfFurniture.TypesOfMaterial.Metal;
import TypesOfFurniture.TypesOfMaterial.Paint;
import TypesOfFurniture.TypesOfMaterial.Wood;

/**
 * Created by Honey on 20.09.2015.
 */
public class BigBookcase extends Bookcase {
    public BigBookcase() {
        super("BigBookcase", 4, 2, 10, new Wood(), 6);
    }
}
