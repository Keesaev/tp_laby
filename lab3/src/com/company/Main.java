package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.URL;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    String url;
	    Integer depth;

	    if(args.length == 2)
	        try{
	            url = args[0];
	            depth = Integer.parseInt(args[1]);

				Crawler crawler = new Crawler(url, depth);
            }
	        catch (Exception ex){
                System.out.println("Ввод: lab3 <URL> <depth>");
                return;
            }

    }


}

