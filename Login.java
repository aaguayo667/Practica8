package com.example.iniciosesion.app;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by GB667 on 03/06/2014.
 */
public class Login{
    String nom,pass = null;


    public Login(String nom, String pass) {
        setLogin();
    }

    private int setLogin() {

        if (nom.equals("GB667") && pass.equals("gb667")) {
            Toast.makeText(getApplicationContext(), "usuario aceptado", Toast.LENGTH_SHORT).show();
            return 1;
        } else {
            Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
            return 0;
        }

    }


    private Context getApplicationContext() {
        return null;
    }


}
