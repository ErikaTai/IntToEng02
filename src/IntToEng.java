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
    	String[] ENG_LIST2={"0","0","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
    	String[] ENG_LIST3={"0","0","0","hundred","thousand"};

    	if(input<100){
    		if(input<20) {  //0〜19の場合は直接アクセス
    			b=ENG_LIST[input];
    		}else{  //20以上の場合
    			if(remainder(input)==0) {  //1の位が0
    				b=ENG_LIST2[divide(input)];
    			}else{  //1の位が0以外
    				b=ENG_LIST2[divide(input)]+" "+ENG_LIST[remainder(input)];
    			}/*else{
    			b=ENG_LIST[input];
    			}*/
    		}
    	}else{
    		b=ENG_LIST[msd(input)]+" "
    				+ENG_LIST3[digit(input)];
    	}
    	return b;
    }
    
    static int remainder(int input){
    	int remain;
    	remain=input%10;
    	if(remain>=10) remainder(remain);
    	return remain;
    }
    
    static int divide(int input){
		int divide;
    	divide=input/10;
    	return divide;
    }
    
    static int digit(int input){
    	int dig = 0;
		while(input>0) {
			input /= 10;
			dig++;
		}
    	return dig;
    }
    
    static int msd(int input) {
    	int msd = input;
    	for(int i=0; i<digit(input)-1; i++) msd = divide(msd);
    	return remainder(msd);
    }
}
