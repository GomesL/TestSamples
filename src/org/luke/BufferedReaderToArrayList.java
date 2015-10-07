package org.luke;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class BufferedReaderToArrayList {

	public static void main(String[] args) throws Exception {
		
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Project\\speed-wss\\TestSamples\\resources\\in.txt")))
		{

			String CurrentLine = br.readLine();
			String SurrentLine [] = br.readLine().split(" ");
			ArrayList<String> b = new ArrayList<String>(Arrays.asList(SurrentLine));
			
			for (String r : b) {
				System.out.println(r);
			}	
			
			for (int j = 0; j < b.size(); j++) {
				b.remove(j);
			}
			
			System.out.println("----------------------");
			for (String k : b) {
				System.out.println(k);
			}	
			

		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
