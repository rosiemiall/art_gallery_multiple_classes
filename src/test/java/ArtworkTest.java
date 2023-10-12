import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork painting1;
    Artist vanGogh;


    @BeforeEach
    public void SetUp(){
        vanGogh = new Artist("Van Gogh");
        painting1 = new Artwork("Painting 1", vanGogh, 100);
    }

    @Test
    public void hasTitle(){
        assertThat(painting1.getTitle()).isEqualTo("Painting 1");
    }

    @Test
    public void hasArtist(){
        assertThat(painting1.getArtist()).isEqualTo(vanGogh);
    }

    @Test
    public void hasPrice(){
        assertThat(painting1.getPrice()).isEqualTo(100);
    }


}
