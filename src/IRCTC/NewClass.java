package IRCTC;

public class NewClass {
	public static void main(String args[]) {
		String fial="helloworld";
		String now="";
		int index=0;
		int final_index=fial.length()-1;
		
		while(index<=final_index) {
			for(char c='a';c<='z';c++)
			{
				if(fial.charAt(index)==c)
				{
					index++;
					now=now+c;
					System.out.println(now);
				}
			}
		}
	}
}
