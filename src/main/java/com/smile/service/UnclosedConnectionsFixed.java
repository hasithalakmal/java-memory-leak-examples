package com.smile.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UnclosedConnectionsFixed {

    //TODO need to close the connection
    public void callOpenAPI() throws IOException {
        URL url = new URL("ftp://speedtest.tele2.net");
        URLConnection urlc = url.openConnection();
        InputStream is = urlc.getInputStream();
        is.close();
    }
}
