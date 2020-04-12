package com.quintin;

import java.io.InputStream;

public class MyRequest {

    //请求方法
    private String requestMethod;
    //请求地址
    private String requestUrl;

    public MyRequest(InputStream inputStream) throws Exception {
        byte[] buffer = new byte[1024];
        int len = 0;
        String str = null;

        if ((len = inputStream.read(buffer)) > 0) {
            str = new String(buffer, 0, len);
            String requestRow = str.split("\n")[0];
            String[] params = requestRow.split(" ");
            this.requestMethod = params[0];
            this.requestUrl = params[1];
        }

    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }
}
