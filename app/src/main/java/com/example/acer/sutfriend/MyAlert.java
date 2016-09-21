package com.example.acer.sutfriend;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.provider.AlarmClock;

/**
 * Created by acer on 21/9/2559.
 */
public class MyAlert {

    //Explicit
    private Context context;
    private int anInt;
    private String titleSting, messageString;

    public MyAlert(Context context, int anInt, String titleSting, String messageString) {
        this.context = context;
        this.anInt = anInt;
        this.titleSting = titleSting;
        this.messageString = messageString;

    }
    public void  myDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(anInt);
        builder.setTitle(titleSting);
        builder.setMessage(messageString);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();


            }
        });
        builder.show();
    }
}// Main Class
