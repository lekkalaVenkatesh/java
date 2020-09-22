package com.java.puzzles.k;

public class SortingCalnderDates {
	  
	  static boolean isAvailable(int[][]meetings, int startTime, int endtime){
	    
	    
	    for(int[] meeting : meetings){
	      
//	      if(startTime >= meeting[0] &&   meeting[1] <= endtime)
//	      
//	       return false; 
//	       
//	      // 800 850 - false
//	      else (startTime <= meeting[0]  &&  endtime > startTime){
//	        
//	        return false;
//	        
//	      }
	      
	    	System.out.println(meeting[0]+""+meeting[1]);
	    	
	    }
	    
	    return false;
	  }
	  
	  
	  public static void main(String[] argv) {
	    int[][] meetings = {
	      {1230, 1300},
	      { 845,  900},
	      {1300, 1500},
	    };
	    
	    System.out.println(isAvailable(meetings, 915, 1215));
	    
	  }
}

