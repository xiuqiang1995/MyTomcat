package com.quintin;

public class MyServlet extends MyHttpServlet{
    @Override
    public void doGet(MyRequest request, MyResponse response) throws Exception {
        response.write("doGet");
    }

    @Override
    public void doPost(MyRequest request, MyResponse response) throws Exception {
        response.write("doPost");
    }
}
