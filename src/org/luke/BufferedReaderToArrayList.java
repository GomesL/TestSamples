package org.luke;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BufferedReaderToArrayList {

	public static void main(String[] args) throws Exception {
		
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Project\\speed-wss\\TestSamples\\resources\\in.txt")))
		{

			String CurrentLine = br.readLine();
			String SurrentLine [] = br.readLine().split(",");
			ArrayList<String> b = new ArrayList<String>(Arrays.asList(SurrentLine));
			
			for (String r : b) {
				System.out.println(r);
			}
			
			/*
			 * Remove specific element from arraylist
			 */
			
			for (int j = 0; j < b.size(); j++) {
				if(j==3)
					b.remove(j);
			}
					
			/*
			 * Sort arraylist ascending
			 */

			Collections.sort(b);
			
			for (String k : b) {
				System.out.println(k);
			}	
			
			/*
			 * Split by comma and trim unnecessary whitespaces
			 */
			
			String vv = br.readLine();;
			String []v = vv.trim().split("\\s*,\\s*");
			for (String z : v) {
				System.out.println(z);
			}	
			

		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
