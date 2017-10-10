package suite;

import com.github.bratuhin.categories.Fast;
import com.github.bratuhin.categories.Slow;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.ApiTest;
import tests.UITest;

@RunWith(Categories.class)
@Categories.IncludeCategory(Fast.class)
@Categories.ExcludeCategory(Slow.class)
@Suite.SuiteClasses({ApiTest.class, UITest.class})
public class FastTestSuite {
}
