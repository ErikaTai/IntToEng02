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

    	if(input<20) {
    		b=ENG_LIST[input];
    	}else{
    		if(remainder(input)==0) {  //1の位が0
    			b=ENG_LIST2[divide(input)];
    		}else{  //1の位が0以外
    			b=ENG_LIST2[divide(input)]+" "+ENG_LIST[remainder(input)];
    		}/*else{
    			b=ENG_LIST[input];
    	}*/
    	}
    	return b;
    }
    
    static int remainder(int input){
    	int remain;
    	remain=input%10;
    	return remain;
    }
    
    static int divide(int input){
    	//return division(input);
		int divide;
    	divide=input/10;
    	return divide;
    }
}
