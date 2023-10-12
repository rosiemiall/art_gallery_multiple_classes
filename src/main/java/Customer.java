import java.util.ArrayList;

public class Customer {

    private String name;
    private int wallet;
    private ArrayList<Artwork> artCollection;

    private void buyArt(Artwork artwork){
        artCollection.add(artwork);
        wallet -= artwork.getPrice();
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
