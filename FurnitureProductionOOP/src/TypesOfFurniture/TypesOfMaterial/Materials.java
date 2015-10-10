package TypesOfFurniture.TypesOfMaterial;

/**
 * Created by Honey on 20.09.2015.
 */
public class Materials {
    private String title;
    private int price;

    public Materials(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Materials{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
