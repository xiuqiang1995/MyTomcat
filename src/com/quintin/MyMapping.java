package com.quintin;

import java.util.HashMap;

public class MyMapping {

    public static HashMap<String, String> mapping = new HashMap<>();

    static {
        mapping.put("/myTomcat", "com.quintin.MyServlet");
    }

    public HashMap<String, String> getMapping() {
        return mapping;
    }
}
