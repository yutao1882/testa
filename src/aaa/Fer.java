package aaa;

import com.yt.JmeterDes;
import com.yt.DesEncrypt;;

public class Fer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String result = new JmeterDes().getDesString("ccc", "key");
//		System.out.println(result);
		
		
		DesEncrypt de = new DesEncrypt();
		de.setKey("385963bcab8446ff87b17b254481dac4");
		System.out.println(de.encrypt("ssssss"));
	}

}
