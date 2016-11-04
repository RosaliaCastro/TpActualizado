package com.example.rosalia.primerparcialtp.Principal;

import android.net.Uri;
import android.system.Os;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Jona on 02/11/2016.
 */
public class HttpManegerPrincipal {
    private String url;
    private HttpURLConnection conexion;

    public byte[] login (Uri.Builder postParames, String urlString) throws IOException {
        URL url= new URL(urlString);
        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("POST");
        conexion.setDoOutput(true);
        String query = postParames.build().getEncodedQuery();
        OutputStream os = conexion.getOutputStream();
        int response;
        BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(os,"UTF8"));
        escribir.write(query);
        escribir.flush();
        escribir.close();
        response = conexion.getResponseCode();
        if (response == 200){
            InputStream is = conexion.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte [] buffet = new byte [1024];
            int length = 0;
            while ((length = is.read(buffet))!= -1){
                baos.write(buffet, 0, length);
            }
            is.close();
            conexion.disconnect();
            return baos.toByteArray();
            }else
                throw new IOException();
    }


}
