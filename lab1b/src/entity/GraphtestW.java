package entity;

import static org.junit.Assert.*;

import org.junit.Test;
import boundary.lab1;
import entity.Graph;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.Graph.Edge;
public class GraphtestW {

	public static Graph aaa = new Graph();
	public static lab1 bbb = new lab1();
	@Test
	public void testCalcshortestPath1() {
		aaa = lab1.test("d:/word.txt");
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
		String result = aaa.calcShortestPath("to", "����");
		String str = "to or ���� is not in the graph!";
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
