import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    Feline feline = new Feline();

    @Mock
    private Feline felineMock;

    @Spy
    private Feline felineSpy;


    @Test
    public void eatMeatNumberOfCallsTest() throws Exception {
        felineSpy.eatMeat();
        Mockito.verify(felineSpy, Mockito.times(1)).getFood("Хищник");
    }
    @Test
    public void eatMeatTest() throws Exception {
        feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.getFood("Хищник"));
    }

    @Test
    public void getFamilyTest(){
        feline.getFamily();
        assertEquals("Кошачьи",feline.getFamily());
    }

    @Test
    public void getKittensNumberOfCallsTest() {
        felineSpy.getKittens();
        Mockito.verify(felineSpy, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getKittensTest(){
        felineMock.getKittens();
        Mockito.when(felineMock.getKittens()).thenReturn(10);
        System.out.println(felineMock.getKittens());
    }

    @Test
    public void getKittensWithParametersTest() {
        felineMock.getKittens(50);
        Mockito.verify(felineMock).getKittens(Mockito.anyInt());
    }
}