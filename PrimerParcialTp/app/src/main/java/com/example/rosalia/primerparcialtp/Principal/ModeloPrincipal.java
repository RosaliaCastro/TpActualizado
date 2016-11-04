package com.example.rosalia.primerparcialtp.Principal;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jona on 28/09/2016.
 */
public class ModeloPrincipal {
    private String miUsuario;
    private String miClave;
    private String miEmail;

    public String getMiClave() {
        return miClave;
    }

    public String getMiUsuario() {
        return miUsuario;
    }

    public void setMiClave(String miClave) {
        this.miClave = miClave;
    }

    public void setMiUsuario(String miUsuario) {
        this.miUsuario = miUsuario;
    }

    public String getMiEmail() {
        return miEmail;
    }

    public void setMiEmail(String miEmail) {
        this.miEmail = miEmail;
    }

    static Boolean TraerUsuarioJS (String miArchivo) throws XmlPullParserException, IOException, JSONException {
        List<ModeloPrincipal> lista = new ArrayList<>();
        JSONObject jsonObject= new JSONObject(miArchivo);
        JSONArray ModeloPrincipal = jsonObject.getJSONArray("login");
        for (int i = 0; i < ModeloPrincipal.length(); i++){
            JSONObject c = ModeloPrincipal.getJSONObject(i);
            String miUsuario= c.getString("name");
            String miEmail = c.getString("email");
            String miClave = c.getString("apiKey");
        }
        return true;

    }
}
