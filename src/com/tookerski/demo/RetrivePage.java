package com.tookerski.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class RetrivePage {
	public static String downloadPage(String path) throws Exception{
		//create URL object by using path
		URL pageURL = new URL(path);
		//create stream
		BufferedReader reader = new BufferedReader(
								new InputStreamReader(
								pageURL.openStream()));
		String line;
		StringBuilder pageBuffer = new StringBuilder();
		while ((line = reader.readLine())!=null){
			pageBuffer.append(line);
		}
		return pageBuffer.toString();
		
	}
	public static void main(String[] args) throws Exception {
		String info = downloadPage("https://github.com/tookerski");
		System.out.println(info);
	}

}
