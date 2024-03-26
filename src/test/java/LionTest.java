import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
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

    Feline feline = new Feline();

    @Test
    public void getKittensTest() {
        lion.getKittens();
        Mockito.verify(lion).getKittens();
    }

    @Test
    public void getFoodTest() throws Exception {
        lion.getFood();
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(feline.eatMeat(), lion.getFood());
    }
}