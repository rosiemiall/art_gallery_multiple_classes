import java.util.ArrayList;

public class Gallery {

    private String name;
    private int till;
    private ArrayList<Artwork> stock;

    public Gallery(String name){
        this.name=name;
        this.till = 0;
        this.stock = new ArrayList<>();
    }

    public void removeArtwork(Artwork artwork){
        this.stock.remove(artwork);
        this.till += artwork.getPrice();
    }

    public void addArtwork(Artwork artwork){
        this.stock.add(artwork);
//        this.till += artwork.getPrice();
    }

    public int stock_take(){
        int stockValue = 0;
        for(Artwork artwork : this.stock){
            stockValue += artwork.getPrice();
        }
        return stockValue;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTill() {
        return this.till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public ArrayList<Artwork> getStock() {
        return this.stock;
    }

    public void setStock(ArrayList<Artwork> stock) {
        this.stock = stock;
    }
}
