package tests;

import com.github.bratuhin.categories.Fast;
import com.github.bratuhin.categories.Slow;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(ApiTest.class)
public class ApiTest {

    @Test
    public void firstTestMethod(){
        System.out.println("Первый тестовый метод! Нет категории");
    }

    @Category(Slow.class)
    @Test
    public void testMethodSlow(){
        System.out.println("Второй тестовый метод! Категория = Slow");
    }

    @Category({Slow.class, Fast.class})
    @Test
    public void testMethodUnstable(){
        System.out.println("Третий тестовый метод! Категория = Fast + Slow");
    }

    @Category({Fast.class})
    @Test
    public void testMethodFast(){
        System.out.println("Четвертый тестовый метод! Категория = Fast");
    }
}
