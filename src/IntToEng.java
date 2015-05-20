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
    		b = zeroToNinetynine(input, ENG_LIST, ENG_LIST2);
    	}else if(input<10000){  //100以上10000未満の場合
    		b = divisible(input, ENG_LIST, ENG_LIST3);
			int d = 1;
			for(int i=1; i<digit(input); i++) {
				d *= 10;
			}
			input = remainder(input,d);

			if(input!=0 && input<100) {
				b += " "+zeroToNinetynine(input, ENG_LIST, ENG_LIST2);
    		}else if(input!=0){
        		b += " "+divisible(input, ENG_LIST, ENG_LIST3);
    			d = 1;
    			for(int i=1; i<digit(input); i++) {
    				d *= 10;
    			}
    			input = remainder(input,d);
    			if(input!=0 && input<100) {
    				b += " "+zeroToNinetynine(input, ENG_LIST, ENG_LIST2);
        		}
    		}
    	}
    	return b;
    }

	public static String zeroToNinetynine(int input, String[] ENG_LIST,
			String[] ENG_LIST2) {
		String b;
		if(input<20) {  //0〜19の場合は直接アクセス
			b=ENG_LIST[input];
		}else{  //20以上の場合
			if(remainder(input)==0) {  //1の位が0
				b=ENG_LIST2[divide(input)];
			}else{  //1の位が0以外
				b=ENG_LIST2[divide(input)]+" "+ENG_LIST[remainder(input)];
			}
		}
		return b;
	}
    
    public static boolean isDivisible(int input) {  //キリのいい数字かどうか
    	input %= 10;
    	if(input>10) isDivisible(input);
    	return input==0;
    }

	public static String divisible(int input, String[] ENG_LIST,
			String[] ENG_LIST3) {
		String b;
		b=ENG_LIST[msd(input)]+" "+ENG_LIST3[digit(input)];
		return b;
	}
    
    static int remainder(int input){
    	return remainder(input,10);
    }
    
    static int remainder(int input, int n) {
    	int remain;
    	remain=input%n;
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
