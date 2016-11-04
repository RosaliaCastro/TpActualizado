package com.example.rosalia.primerparcialtp.Principal;

import android.app.Notification;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;

import java.io.IOException;

/**
 * Created by Jona on 01/11/2016.
 */
public class HiloPrincipal extends Thread {
    private Handler handler;
    Uri.Builder parametro = new Uri.Builder();
    public HiloPrincipal(Handler myHandler){handler=myHandler;}
    public HiloPrincipal(Uri.Builder p){parametro = p;}

    @Override
    public void run() {
        super.run();
        //indico ruta donde debe conectarse
        String ruta="http://lkdml.myq-see.com/login";
        byte[] informacion = null;
        HttpManegerPrincipal httpManegerPrincipal = new HttpManegerPrincipal();
        try {
            informacion = httpManegerPrincipal.login(parametro, ruta);
        }catch (IOException e){e.printStackTrace();}
        try{
            Thread.sleep(1000);
            Message miMensage = new Message();
            miMensage.arg1=PantallaPrincipal.MENSAJE_INGRESAR;
            miMensage.obj=informacion;
            handler.sendMessage(miMensage);

        }catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
