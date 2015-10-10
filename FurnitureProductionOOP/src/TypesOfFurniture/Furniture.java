package TypesOfFurniture;

import TypesOfFurniture.TypesOfMaterial.Materials;

/**
 * Created by Honey on 20.09.2015.
 */
public abstract class Furniture {
    private String name;
    private int weight;
    private int width;
    private int length;
    private Materials material;
    private int materialAmount;

    public Furniture(String name, int weight, int width, int length, Materials material, int materialAmount) {
        this.name = name;
        this.weight = weight;
        this.width = width;
        this.length = length;
        this.material = material;
        this.materialAmount = materialAmount;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public Materials getMaterial() {
        return material;
    }

    public int getMaterialAmount() {
        return materialAmount;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", width=" + width +
                ", length=" + length +
                ", material=" + material +
                ", materialAmount=" + materialAmount +
                '}';
    }

    public int calculateCost(){
        return material.getPrice() * materialAmount;
        //System.out.println("The cost of ordering is " + material.getPrice() * materialAmount + " UAN.");
    }
}
