import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Lion lionMock;

    Feline feline = new Feline();

    Lion lion = new Lion("Самец",feline);

    public LionTest() throws Exception {
    }

    @Test
    public void getKittensMockTest() {
        lionMock.getKittens();
        Mockito.verify(lionMock).getKittens();
    }
    @Test
    public void getKittensTest(){
        assertEquals(1, lion.getKittens());
    }
    @Test
    public void getFoodMockTest() throws Exception {
        lionMock.getFood();
        Mockito.when(lionMock.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(feline.eatMeat(), lionMock.getFood());
    }
    @Test
    public void getFoodTest() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}