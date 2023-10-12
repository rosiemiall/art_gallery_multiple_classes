import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CustomerTest{
    Artwork painting1;
    Artwork painting2;
    Artist vanGogh;
    ArrayList artCollection;
    ArrayList artCollectionNew;
    Customer customer;

    @BeforeEach
    public void SetUp(){
        vanGogh = new Artist("Van Gogh");
        painting1 = new Artwork("Painting 1", vanGogh, 100);
        painting2 = new Artwork("Painting 2", vanGogh, 50);
        customer = new Customer("John",200);
    }

    @Test
    public void canGetName(){
        assertThat(customer.getName()).isEqualTo("John");
    }
    @Test
    public void canGetWallet(){
        assertThat(customer.getWallet()).isEqualTo(200);
    }

    @Test
    public void canGetArtCollection(){
        artCollection = new ArrayList<>();
        artCollection.add(painting1);
        customer.setArtCollection(artCollection);
        assertThat(customer.getArtCollection()).isEqualTo(artCollection);
    }

    @Test
    public void canBuyArtArrayCheck(){
        artCollection = new ArrayList<>();
        artCollection.add(painting1);
        customer.setArtCollection(artCollection);
        customer.buyArt(painting2);
        artCollectionNew = new ArrayList<>();
        artCollectionNew.add(painting2);
        assertThat(customer.getArtCollection()).isEqualTo(artCollection);
    }
    @Test
    public void canBuyArtWalletCheck(){
        artCollection = new ArrayList<>();
        artCollection.add(painting1);
        customer.setArtCollection(artCollection);
        customer.buyArt(painting2);
        assertThat(customer.getWallet()).isEqualTo(150);
    }
}
