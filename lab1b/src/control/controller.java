package control;
import entity.Graph;

import java.io.IOException;

import boundary.lab1;
public class controller {
	private static Graph myGraph;
	public static void buildGraph(String[] readin,int number) {
			myGraph= new Graph();
		    myGraph.readGraph(readin,number);
	}
	
		    public static void showDirectedGraph() {
		  	  lab1.showDirectedGraph(myGraph);
		    }
		    
		    public static String queryBridgeWords(String word1, String word2) {
		  	 return myGraph.queryBridgeWords(word1, word2);
		    }
		    
		    
		    public static String generateNewText(String[] inputText) {
		  	  return myGraph.generateNewText(inputText);
		    }
		    
		    public static String calcShortestPath(String word1,String word2){
		  	return myGraph.calcShortestPath(word1, word2);
		    }
		    
		    public static String randomWalk () throws IOException{
		  	  return myGraph.randomWalk();
		    }


		  

}
