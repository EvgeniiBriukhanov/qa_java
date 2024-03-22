import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    Feline feline = new Feline();
    Cat cat = new Cat(feline);


    @Test
    public void getSoundTest(){
        cat.getSound();
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        cat.getFood();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),cat.getFood());

    }
}

