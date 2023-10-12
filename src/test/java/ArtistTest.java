import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    Artist vanGogh;

    @BeforeEach
    public void SetUp(){
        vanGogh = new Artist("Van Gogh");
    }

    @Test
    public void canGetName(){
        assertThat(vanGogh.getName()).isEqualTo("Van Gogh");
    }
    
    @Test
    public void canSetName(){
        vanGogh.setName("Vincent Van Gogh");
        assertThat(vanGogh.getName()).isEqualTo("Vincent Van Gogh");
    }

}
