package com.tookerski.httpclient.demo;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class RetrivePage {

	public static void main(String[] args) throws IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			HttpGet httpget = new HttpGet("https://github.com/tookerski");
			CloseableHttpResponse response1 = httpclient.execute(httpget);
			try {
				System.out.println(response1.getStatusLine());
				HttpEntity entity1 = response1.getEntity();
				EntityUtils.consume(entity1);
			} finally{
				response1.close();
			}
		}  finally{
			httpclient.close();
		}

	}

}
