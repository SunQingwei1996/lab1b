package lab1b;

import static org.junit.Assert.*;

import org.junit.Test;

import lab1b.Graph.Edge;

public class GraphTestW {

	public static Graph aaa = new Graph();
	public static lab1b bbb = new lab1b();
	@Test
	public void testCalcshortestPath1() {
		aaa = lab1b.test("d:/word.txt");
		aaa.Floyd();
		String result = aaa.calcShortestPath("to", "strange");
		String str = "to->explore->strange\n" + "The length of path is 2\n";
		assertEquals(result, str);
	}
	
	@Test
	public void testCalcshortestPath2() {
		aaa.Floyd();
		String result = aaa.calcShortestPath("to", "to");
		String str = "No way!";
		assertEquals(result, str);
	}
	
	@Test
	public void testCalcshortestPath3() {
		aaa.Floyd();
		String result = aaa.calcShortestPath("to", "new");
		String str = "to->explore->strange->new\n" + "The length of path is 3\n";
		assertEquals(result, str);
	}
	
	@Test
	public void testCalcshortestPath4() {
		aaa.Floyd();
		String result = aaa.calcShortestPath("to", "ºº×Ö");
		String str = "to or ºº×Ö is not in the graph!";
		assertEquals(result, str);
	}
	
	@Test
	public void testCalcshortestPath5() {
		aaa.Floyd();
		String result = aaa.calcShortestPath("to", " ");
		String str = "to or   is not in the graph!";
		assertEquals(result, str);
	}
}
