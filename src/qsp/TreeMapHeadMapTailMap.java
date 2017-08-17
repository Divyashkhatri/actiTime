package qsp;

import java.util.TreeMap;

public class TreeMapHeadMapTailMap {

	public static void main(String[] args) {
		TreeMap hm=new TreeMap();
		
		hm.put("nz","newzealand");
		hm.put("ind","India");
		hm.put("uk","united kingdom");
		
		System.out.println(hm);
		System.out.println(hm.descendingMap());
		System.out.println(hm.tailMap("nz"));
		
		System.out.println(hm.headMap("nz"));
		System.out.println(hm.headMap("nz",true));
	}

}
