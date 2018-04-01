package org.geosbolivia.geos_v1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class segundo extends AppCompatActivity {

    Button sgte;
    Button call;
    Button login;
    Button notfic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundo);

        call=(Button) findViewById(R.id.btn2);
        sgte = (Button) findViewById(R.id.btn1);
        login = (Button) findViewById(R.id.btn3);
        notfic = (Button) findViewById(R.id.btn4);

        call.setOnClickListener (new View.OnClickListener() {

            public void onClick (View s){

                Intent callIntent =new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:60777577"));

                startActivity(callIntent);

            }


                                 });
        sgte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  sgte = new Intent(segundo.this,sitio.class);
                 startActivity(sgte);}});

                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View l) {
                        Intent login = new Intent(segundo.this, login.class);
                        startActivity(login);}});

                        notfic.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View n) {
                                Intent notfic = new Intent(segundo.this, notificacion.class);
                                startActivity(notfic);}});

                            }

                        }

