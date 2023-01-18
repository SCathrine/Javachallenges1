package javachallenge;

import java.util.Arrays;

public class SmallestSecOccOfChar {
//JAVACHALLENGE 11
	
	public int[] callindexval(int index1[]) {
		
		for(int i=0;i<index1.length;i++) {
			
			index1[i]=0;
			
		}
		return index1;
		
	}
	
	public int sub(int[] value,String split) {
		int temp1,temp2,index=0;
		boolean flag=false;
		int temp3=0;
		
		returns:
		for(int i=0;i<value.length;i++) {
			
			if(value[i]!=0){
				
			
			for(int j=1+i;j<value.length;j++) {
				if(value[j]!=0){
					
					flag=true;
					temp1=value[j];
					temp2=value[i];
					index++;
					temp3=(temp1-temp2)-1;
					System.out.println("shortest index value of" +" " +split +" " +"is" +" " +temp3);

					break returns;
				
			}
				else {
					
					flag=false;
					
				}
				
			}
			
			if(flag==false) {
				
				temp3=(value[i]-1);
				
				System.out.println("shortest index value of" +" " +split +" " +"is" +" " +temp3);
				break;
				
			}
				
				
			}
		
		
		
		}
			
		
		
		return temp3;
		
	}
	
	public static void main(String[] args) {
		SmallestSecOccOfChar ss=new SmallestSecOccOfChar();
		String s="abbaab";
		int count=0,count1=0,indexs=0,ind=0;
		int[] counts=new int[4];
		int[] a=new int[7];
		int[] b=new int[7];
		int[] c=new int[7];
		int[] call;
		int[] indexval=new int[7];
		int shortest;
		int[] store=new int[3];
		int[] commondexval1=new int[7];
		String[] split = s.split("");
		String[] word=new String[3];
		
		for(int i=0;i<split.length;i++) {
			
			System.out.println(split[i]);
			
		}
		
		for(int i=0;i<split.length;i++) {
			if(split[i]!="") {
			count=0;
			call = ss.callindexval(indexval);
			for(int j=i+1;j<split.length;j++) {
				 
				if(split[i].equals(split[j])) {
					
					
					count++;
					counts[indexs]=count;
					word[indexs]=split[i];
					indexval[i]=i;        
			        indexval[j]=j;
			        split[j]="";
					commondexval1=indexval;
					
					if(split[i].contains("a")) {
						
						a=commondexval1;
						shortest = ss.sub(a,split[i]);
						store[ind]=shortest;
						ind++;
						break;
						
					}
					
					if(split[i].contains("b")) {
						
						b=commondexval1;
						shortest = ss.sub(b,split[i]);
						store[ind]=shortest;
						ind++;
						break;
					}
					
					else if(split[i].contains("c")) {
						
						c=commondexval1;
						shortest = ss.sub(c,split[i]);
						store[ind]=shortest;
						ind++;
						break;
					}
					
			}
			else {
				
				word[indexs]=split[i];
			}
						
		}
			
			indexs++;
			String strings = Arrays.toString(commondexval1);
			System.out.println(strings);
		}
		}
		String string = Arrays.toString(counts);		
		//String string2 = Arrays.toString(split);
		String string3 = Arrays.toString(word);
		//System.out.println("string:" +string2);
		System.out.println("counts " +string);
		System.out.println("word without duplicates" +string3);
		for(int i=0;i<word.length;i++) {
			
			int min=0;
			if(min>store[i]) {
				
				min=store[i];
				
				
			}
			else {
				
				if(min==store[i]) {
					
					System.out.println(word[i] +" " +"Shortest distance" +" " +"is" +" " +store[i]);
					break;
					
				}
			}
			
			
		}
		
	
	
		
			
			
			
		}
		

	}


