package com.example.rosalia.primerparcialtp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Log;

/**
 * Created by Jona on 28/09/2016.
 */
public class ListenerAlert implements OnClickListener {
    @Override
    public void onClick(DialogInterface dialogInterface, int which) {
        Log.d("dialog", "Click!");
    }
}
