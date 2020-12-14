package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Crawler {
    public static LinkedList<UrlDepthPair> visitedSites = new LinkedList<>();
    public static LinkedList<UrlDepthPair> notVisitedSites = new LinkedList<>();
    private static Integer depth;

    public Crawler(String initUrl, Integer depth){
        this.depth = depth;
        notVisitedSites.add(new UrlDepthPair(initUrl, 0));

        while(!notVisitedSites.isEmpty()){
            UrlDepthPair site = notVisitedSites.getFirst();

            getSites(site);
            visitedSites.add(site);
            notVisitedSites.remove(site);
        }

        System.out.println("Visited sites");
        for (UrlDepthPair i : visitedSites){
            System.out.println(i.getString());
        }
    }
    public static void getSites(UrlDepthPair urlDepthPair){
        if(urlDepthPair.depth > depth)
            return;
        try{
            URL url = new URL(urlDepthPair.url);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(500);
            connection.setReadTimeout(500);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String line = reader.readLine();

            while(line != null){
                if(line.contains(UrlDepthPair.URL_PREFIX)){
                    line = line.substring(line.indexOf(UrlDepthPair.URL_PREFIX), line.length());
                    line = line.substring(0, line.indexOf("\""));

                    notVisitedSites.add(new UrlDepthPair(line, urlDepthPair.depth + 1));
                }

                line = reader.readLine();
            }
            reader.close();
        }
        catch(Exception ex){
            System.err.println(ex.getMessage() + " with " + urlDepthPair.url);
        }
        System.out.println(urlDepthPair.getString());
    }
}
