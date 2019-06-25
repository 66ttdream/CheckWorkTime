package sccx.soft.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public static String url;
	static String driver;
	static String user;
	static String password;
	static String initSize;
	static String maxActive;
	public static String kqtxt;
	static String upSql;
	//通过静�?�代码块加载mysql链接信息
    static{
    	    Properties p = new Properties();
    		FileInputStream in = null;
			try {
				in = new FileInputStream("D://local//CheckWork//src//main//resources//conf//mysql.properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
    		
    		
    			try {
					p.load(in);
				} catch (IOException e) {
					e.printStackTrace();
				}
    			url = p.getProperty("url");
    			driver = p.getProperty("driver");
    			user = p.getProperty("user");
    			password = p.getProperty("password");
    			initSize = p.getProperty("initSize");
    			maxActive = p.getProperty("maxActive");
    			kqtxt = p.getProperty("kqtxt");
    			upSql = p.getProperty("upSql");
    			try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} 
     }

