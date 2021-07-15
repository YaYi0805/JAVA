import javax.sound.midi.Soundbank;

public class TestBasic {

	public static void main(String[] args) {
		
		//變數宣告
		long salary = 5000;
		System.out.println("salary=" + salary);
		
		//一次宣告多個變數
		int i,j,k;
		i = 10;
		j = 20;
		k = 30;
		System.out.println("i="+i+",j="+j+",k="+k);
		
		//整數預設型別為int正負21億
		//System.out.println(2222222222);  out of range 
		System.out.println(2222222222L);
		//超過21e加L
		int a = 2000000000;
		int b = a + a;
		System.out.println("b=" + b );//40e overflow 會計算出不對的數值
		
		//char, boolean
		char c = '中';//字元-單引號(字串多個字元-雙引號)
		System.out.println(c);
		boolean d = false;//或true ,1 bit
		System.out.println(d);
		
		//8個基本型態:4個整數型態,2個浮點數,char,boolean
		
		//跳脫字元
		System.out.println("\"Hello World\"");
		System.out.println("\\Hello World\\");
		System.out.println("Hello\r\nWorld");//\r\n換行符號
		
		//算數運算子 = 二元運算子 Binary operators
		int x = 10;
		int y = 3;
		int z = x * y;
		System.out.println("z=" + z);
		System.out.println(x / y);//int跟int運算結果一定是int
		
		short xx = 10;
		short yy = 3;
		//short zz = xx + yy; 會錯誤, 因至少是int, 4byte
		int zz = xx + yy;
		System.out.println(zz);
		//兩相同型別運算時,結果會為同型別
		//不同則以能儲存的range最大的為主,double>float>long>int,至少為int
		
		//%取餘數
		int zzz = x % y;
		System.out.println("zzz=" + zzz);
		
		//d+i->d
		double aa = 10.5;
		int bb = 5;
		double cc = aa + bb;
		System.out.println(cc);
		
		//型別轉換 Casting
		double ccc = 10.34567;
		int aaa = (int)ccc;
		System.out.println("aaa=" + aaa);
		
		//比較運算子 Comparison operators
		//>,>=,<,<=,==,!=不等於
		//條件運算 Conditional operators
		//&&,||,!,&,|,^
		int age = 20;
		boolean isAdult = (age > 18  && age < 30 );
		System.out.println(isAdult);
		boolean isAdult1 = !(age > 18  && age < 30 );//相反的布林值
		System.out.println(isAdult1);
		
		//位元運算子 Bitwise operators
		System.out.println(12 & 6);//&,兩bit都是1結果才為1否則為0
		//位元位移運算子 Shift operators
		System.out.println(2 << 2);//左移<<2等同於乘上2的2次方
		
		//遞增,遞減
		age--;
		System.out.println("age=" + age);
		age++;
		System.out.println("age=" + age);
		
		//後置型,先取值結束後加1
		System.out.println("age=" + (age++));
		System.out.println("age=" + age);//結束後加1
		//前置型,先執行再取值
		System.out.println("age=" + (++age));
		
		//指定運算 Assignment operators
		age += 10;//age = age + 10
		System.out.println(age);
		
		//三元運算 用法a?b:c, 若a為true,則執行運算b,否則執行運算c
		System.out.println(age > 18 ? "成年" : "未成年");
		
		int sales = 16;
		int salary1 = 100;
		salary1 = sales > 1000 ? salary1 + 10 : salary1 - 10;//if,else
		System.out.println("salary1=" + salary1);
		}

}
