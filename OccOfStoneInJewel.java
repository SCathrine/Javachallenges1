package javachallenge;

import java.util.Arrays;

public class OccOfStoneInJewel {

	public static void main(String[] args) {
		
		//JAVACHALLENGE 10
		
		String jewels="aA";
		String stones="aAAbbbb";
		int count=0,index=0;
		String[] word=new String[stones.length()];
		String[] split1 = jewels.split("");
		for (int i=0;i<split1.length;i++) {
			
			System.out.println(split1[i]);
				

	}
		System.out.println("*******");
		
		String[] split2 = stones.split("");
		
		for (int i=0;i<split2.length;i++) {
			
			
			System.out.println(split2[i]);
				

	}
		for (int i=0;i<split1.length;i++) {
		
			for (int j=0;j<split2.length;j++) {
			
				if(split1[i].equals(split2[j])) {
					
					count++;
					word[index]=split1[i];
					index++;
					
				}
				
				
			}
			}
		
		String string = Arrays.toString(word);
		System.out.println(string);
		System.out.println(count);
		
		

}
}
