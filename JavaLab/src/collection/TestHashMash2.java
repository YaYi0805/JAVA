package collection;

import java.util.HashMap;
import java.util.Map;

public class TestHashMash2 {

	public static void main(String[] args) {


		Map map = new HashMap();
		    Map infoOfDavid = new HashMap();
		    infoOfDavid.put("phone", "0911222333");
		    infoOfDavid.put("city", "Taoyuan");
		    infoOfDavid.put("gender", "male");
		    
		map.put("David", infoOfDavid);//key:String(David),Value:Map
		
		Map value = (Map)map.get("David");
		System.out.println(value.get("phone"));
		    
		    
		

	}

}
