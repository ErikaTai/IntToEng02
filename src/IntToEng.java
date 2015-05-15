import java.util.Scanner;

public class IntToEng {
	  // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int input) {
    	String b="";
    	String[] ENG_LIST= {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen" };
    	String[] ENG_LIST2={"0","0","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety","hundred"};
    	if(divide(input)==2){
    		if(remainder(input)==0) {
    			b=ENG_LIST2[divide(input)];
    		}else{
    	b=ENG_LIST2[divide(input)]+ENG_LIST[remainder(input)];
    	}
    	}else if(divide(input)==3){
    		if(remainder(input)==0) {
    			b=ENG_LIST2[divide(input)];
    		}else{
    		b=ENG_LIST2[divide(input)]+ENG_LIST[remainder(input)];
    		}
    	}else if(divide(input)==4){
    		if(remainder(input)==0) {
    			b=ENG_LIST2[divide(input)];
    		}else{
    		b=ENG_LIST2[divide(input)]+ENG_LIST[remainder(input)];
    		}	
    	}else if(divide(input)==5){
    		if(remainder(input)==0) {
    			b=ENG_LIST2[divide(input)];
    		}else{
    		b=ENG_LIST2[divide(input)]+ENG_LIST[remainder(input)];
    		}
    	}else if(divide(input)==6){
    		if(remainder(input)==0) {
    			b=ENG_LIST2[divide(input)];
    		}else{
    		b=ENG_LIST2[divide(input)]+ENG_LIST[remainder(input)];
    		}
    	}else if(divide(input)==7){
    		if(remainder(input)==0) {
    			b=ENG_LIST2[divide(input)];
    		}else{
    		b=ENG_LIST2[divide(input)]+ENG_LIST[remainder(input)];
    		}
    	}else if(divide(input)==8){
    		if(remainder(input)==0) {
    			b=ENG_LIST2[divide(input)];
    		}else{
    			b=ENG_LIST2[divide(input)]+ENG_LIST[remainder(input)];
    		}
    	}else if(divide(input)==9){
    		if(remainder(input)==0) {
    			b=ENG_LIST2[divide(input)];
    		}else{
    		b=ENG_LIST2[divide(input)]+ENG_LIST[remainder(input)];
    		}
    	}else if(divide(input)== 10) {
    		b=ENG_LIST2[divide(input)];
    		
    	}else{
    		b=ENG_LIST[input];
    }
    	return b;
}
    
    static int remainder(int input){
    	int remain;
    	remain=input%10;
    	return remain;
    }
    
    static int divide(int input){
    	return division(input);
    }

	static int division(int input) {
		int divide;
    	divide=input/10;
    	return divide;
	}
}
