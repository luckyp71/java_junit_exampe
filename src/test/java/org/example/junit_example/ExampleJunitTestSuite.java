package org.example.junit_example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	CustomerControllerTest.class,
	TestOnly.class
})


public class ExampleJunitTestSuite {

}
