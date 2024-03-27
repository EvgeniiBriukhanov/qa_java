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
    public void getKittensTest(){
        lionMock.getKittens();
        Mockito.when(lionMock.getKittens()).thenReturn(1);
        assertEquals(lion.getKittens(),lionMock.getKittens());
    }
    @Test
    public void getFoodMockTest() throws Exception {
        lionMock.getFood();
        Mockito.when(lionMock.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(lion.getFood(), lionMock.getFood());
    }
}