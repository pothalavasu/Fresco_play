package Parallel_Testing;
import org.testng.annotations.*;
import org.testng.SkipException;

public class skiptest_example {
boolean flag = true;
@Test
public void f() {
	if(flag)
		throw new SkipException("custom error");
		System.out.println("hello bhai");
}
}
