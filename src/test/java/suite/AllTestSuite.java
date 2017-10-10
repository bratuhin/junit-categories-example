package suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.ApiTest;
import tests.UITest;

@RunWith(Categories.class)
@Suite.SuiteClasses({ApiTest.class, UITest.class})
public class AllTestSuite {
}
