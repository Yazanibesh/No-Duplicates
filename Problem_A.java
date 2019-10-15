import java.util.Scanner;

public class Problem_A {

	public static void main(String[] args) {



		String sentence=getInput();
		String[] words=sentence.split(" ");

		int i=0,check=0;

		while(i < words.length) {
			int j=0;
			while(j < words.length) {
				if(words[j].equalsIgnoreCase(words[i]) && j!=i) {
					System.out.println("No");
					check=1;
					break;

				}

                j=j+1;
			}
			if(check!=0) {
				break;
			}
			i=i+1;
		}
		if(check==0) {
			System.out.println("Yes");
		}
	}

	public static String getInput() {
		Scanner scan=new Scanner(System.in);
		String ret=null;
		while(ret==null) {
			ret=scan.nextLine();
		}
		scan.close();
		return ret;
	}


}
