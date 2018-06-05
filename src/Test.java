import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
	
	public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		System.out.println("Enter value : ");
		int startPointer = readInput();
		System.out.println("StartPointer is "+startPointer);
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        System.out.println("Start value is "+start);
        String stringNumber = String.valueOf(start);
        int n = 1;//scan.nextInt();
        while(n >= 1){
            stringNumber = lookAndSay(stringNumber);
            n--;
            
            
        }
        
        System.out.print(start);
        
    }
    private static int readInput() {
    		Scanner scan = new Scanner(System.in);
    		boolean isValidInput = false;
    		Integer result = null;
    		
    		while(!isValidInput) {
    			if(scan.hasNext(Pattern.compile("[1-9]"))) {
    				result = scan.nextInt();
    				isValidInput = true;
        		}else {
        			System.out.println("Enter only numerical value");
        			
        		}
    		}
    		
		return result;
	}
	private static String lookAndSay( String number){
        StringBuilder result = new StringBuilder();
        
        char repeat = number.charAt(0);
        
            number = number.substring(1) + " ";
       
        
        int times = 1;
        
        for(char actual: number.toCharArray()){
            if(actual != repeat){
                result.append(times+""+repeat);
                times=1;
                repeat=actual;
            }else{
                times+=1;
            }
        }
        return result.toString();
    }

}
