package sccx.soft.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadTxt {
	/**
	 * 
	 * @param name 读取文件的地址
	 * @return 返回包含每行文件的有序list集合，list中包含的数据为字符串，未做split切分。
	 */
	public static ArrayList toArrayByFileReader1(String name) {
		// 使用ArrayList来存储每行读取到的字符串
		ArrayList<String> arrayList = new ArrayList();
		try {
			FileReader fr = new FileReader(name);
			BufferedReader bf = new BufferedReader(fr);
			String str;
			// 按行读取字符串
			while ((str = bf.readLine()) != null) {
				arrayList.add(str);
			}
			bf.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arrayList;
	}

      
}
