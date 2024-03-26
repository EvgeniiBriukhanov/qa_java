import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Lion lion;

    @Test
    public void getKittensTest() {
        lion.getKittens();
        Mockito.verify(lion).getKittens();
    }

    @Test
    public void getFoodTest() throws Exception {
        lion.getFood();
        Mockito.verify(lion).getFood();
    }
}