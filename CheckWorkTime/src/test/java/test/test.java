package test;

import java.util.ArrayList;

import org.junit.Test;

import sccx.soft.util.ReadProperties;
import sccx.soft.util.ReadTxt;

public class test {
         @Test
         public void test1() {
        	ArrayList<String> al = ReadTxt.toArrayByFileReader1(ReadProperties.kqtxt);
        	System.out.print(al);
        	
         }
         
}
