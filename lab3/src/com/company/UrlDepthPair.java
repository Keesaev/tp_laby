package com.company;

public class UrlDepthPair {
    public String url;
    public Integer depth;
    public static final String URL_PREFIX = "http://";
    public static final String LINK_PREFIX = "<a href";

    public UrlDepthPair(String url, Integer depth){
        this.url = url;
        this.depth = depth;
    }

    public String getString(){
        return Integer.toString(depth) + " - " + url;
    }
}
