package entity;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;
import boundary.lab1;
import entity.Graph; 
public class GraphtestB {
public static Graph aaa = new Graph();
public static lab1 bbb = new lab1();
	@Test
	public void testQueryBridgeWords1() {
		aaa = lab1.test("d:/word.txt");
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
		String result = aaa.queryBridgeWords("1", "new");
		String str = "No'1'or'new'in the graph!";
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
