import java.util.ArrayList;

public class Customer {

    private String name;
    private int wallet;
    private ArrayList<Artwork> artCollection;
    private Gallery gallery;

    public Customer(String name, int wallet, Gallery gallery){
        this.name = name;
        this.wallet = wallet;
        this.artCollection = new ArrayList<>();
        this.gallery = gallery;
    }

    public void buyArt(Artwork artwork){
        if (artwork.getPrice() < this.wallet) {
            this.artCollection.add(artwork);
            this.wallet -= artwork.getPrice();
            gallery.removeArtwork(artwork);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public ArrayList<Artwork> getArtCollection() {
        return artCollection;
    }

    public void setArtCollection(ArrayList<Artwork> artCollection) {
        this.artCollection = artCollection;
    }
}
