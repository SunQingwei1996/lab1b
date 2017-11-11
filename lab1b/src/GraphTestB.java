package lab1b;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraphTestB {
public static Graph aaa = new Graph();
public static lab1b bbb = new lab1b();
	@Test
	public void testQueryBridgeWords1() {
		aaa = bbb.test("d:/word.txt");
		String result = aaa.queryBridgeWords("to", "strange");
		String str = "The bridge words from 'to' to 'strange' are: explore.";
		assertEquals(result,str);
	}
	
	@Test
	public void testQueryBridgeWords2() {
		String result = aaa.queryBridgeWords("to", "explore");
		String str = "No bridge words from 'to' to 'explore' !";
		assertEquals(result,str);
	}
	
	@Test
	public void testQueryBridgeWords3() {
		String result = aaa.queryBridgeWords("to", "new");
		String str = "No bridge words from 'to' to 'new' !";
		assertEquals(result,str);
	}
	
	@Test
	public void testQueryBridgeWords4() {
		String result = aaa.queryBridgeWords("a", "to");
		String str = "No'a'or'to'in the graph!";
		assertEquals(result,str);
	}
	
	@Test
	public void testQueryBridgeWords5() {
		String result = aaa.queryBridgeWords(" ", "to");
		String str = "No' 'or'to'in the graph!";
		assertEquals(result,str);
	}
}
