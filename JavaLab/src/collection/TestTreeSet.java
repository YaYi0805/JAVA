package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
	    //作法1
		//DescComparator comparator = new DescComparator();
		
		//作法2
		//用Anonymous class,TreeSet$1.class
		Comparator com = new Comparator() {
			public int compare(Object o1, Object o2) {
				Integer i1 = (Integer) o1 ;
				Integer i2 = (Integer) o2 ;
				if(i1 > i2) {
					return -1;//-1文件裡有定義
				}else if (i1 < i2) {
					return 1;
				}
				return 0;//相等情況,就隨便TreeSet排->基本上set不會有重複的情況
			}
		};
		
		/*lambda-------------------------------------------------------
		Comparator com1 = ( o1, o2 ) ->{
			Integer i1 = (Integer) o1 ;
			Integer i2 = (Integer) o2 ;
			if(i1 > i2) {
				return -1;//-1文件裡有定義
			}else if (i1 < i2) {
				return 1;
			}
			return 0;
		};
		-----------------------------------------------------------*/
		
		//Set set = new TreeSet();//預設是由小到大,自然排序
		Set set = new TreeSet(com);
		
		/*作法3(更簡潔)-----------------------------------------------
		Set set = new TreeSet( new Comparator() {
			public int compare(Object o1, Object o2) {
				Integer i1 = (Integer) o1 ;
				Integer i2 = (Integer) o2 ;
				if(i1 > i2) {
					return -1;
				}else if (i1 < i2) {
					return 1;
				}
				return 0;//相等情況,就隨便TreeSet排
			}
		});
		----------------------------------------------------*/
		
		set.add(4);//autoboxing
		set.add(3);
		set.add(2);
		set.add(1);
		
		for( Object item : set) {
			System.out.println(item);
		}

	}

}
