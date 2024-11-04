package junitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	login.class,FramHandling.class,windowHandling.class,KeybordAction.class,webTableDemo.class,Alertdemo.class
})

public class Runner_Suite {

}
