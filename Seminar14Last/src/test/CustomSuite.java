package test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({TestCaseDummyT.class, TestCaseGetPromovabilitate.class, GrupaFakeTest.class})

@IncludeCategory({SpecialTests.class})
@ExcludeCategory({NormalTests.class})
public class CustomSuite {

}
