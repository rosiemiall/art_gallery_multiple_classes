import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class GalleryTest {
    Gallery gallery;
    Artwork painting1;
    Artwork painting2;
    Artwork painting3;
    Artist vanGogh;
    ArrayList stock;
    ArrayList stockNew;
    Customer customer;

    @BeforeEach
    public void setUp(){
        vanGogh = new Artist("Van Gogh");
        painting1 = new Artwork("Painting 1", vanGogh, 100);
        painting2 = new Artwork("Painting 2", vanGogh, 50);
        painting3 = new Artwork("Painting 3", vanGogh, 10);
        customer = new Customer("John",200);
        gallery = new Gallery("Art Gallery");
    }

    @Test
    public void canGetName(){
        assertThat(gallery.getName()).isEqualTo("Art Gallery");
    }
    @Test
    public void canGetTill(){
        gallery.setTill(100);
        assertThat(gallery.getTill()).isEqualTo(100);
    }
    @Test
    public void canGetStock(){
        stock = new ArrayList<>();
        stock.add(painting1);
        gallery.setStock(stock);
        assertThat(gallery.getStock()).isEqualTo(stock);
    }

    @Test
    public void canRemoveArtowork(){
        stock = new ArrayList<>();
        stock.add(painting1);
        gallery.addArtwork(painting1);
        gallery.addArtwork(painting2);
        gallery.removeArtwork(painting2);
        assertThat(gallery.getStock()).isEqualTo(stock);
    }

    @Test
    public void canCheckStock(){
        gallery.addArtwork(painting1);
        gallery.addArtwork(painting2);
        gallery.addArtwork(painting3);
        assertThat(gallery.stock_take()).isEqualTo(160);
    }
}
