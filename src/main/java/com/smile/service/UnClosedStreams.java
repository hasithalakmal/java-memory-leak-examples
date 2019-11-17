package com.smile.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class UnClosedStreams {

    public void callOpenAPI() throws IOException {
        String str = "";
        URLConnection conn = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt").openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));

        while (br.readLine() != null) {
            str += br.readLine();
        }
    }
}
