package com.smile.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class UnclosedConnections {

    public void callOpenAPI() throws IOException {
        URL url = new URL("ftp://speedtest.tele2.net");
        URLConnection urlc = url.openConnection();
        InputStream is = urlc.getInputStream();
    }
}
