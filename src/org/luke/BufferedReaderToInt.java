package org.luke;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderToInt {

	public static void main(String[] args) throws Exception {
		
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Project\\speed-wss\\TestSamples\\resources\\in.txt")))
		{

			String CurrentLine = br.readLine();
			String SurrentLine [] = br.readLine().split(" ");
			int a [] = new int[SurrentLine.length];
			
			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(SurrentLine[i]);
			}
			
			for (int j : a) {
				System.out.println(j);
			}	
			

		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
