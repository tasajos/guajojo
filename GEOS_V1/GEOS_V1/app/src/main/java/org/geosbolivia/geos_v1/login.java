package org.geosbolivia.geos_v1;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class login extends AppCompatActivity {

    WebView wvlo;

    @Override
    public void onBackPressed(){
        if (wvlo.canGoBack()){
            wvlo.goBack();
        }else {
            super.onBackPressed();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        wvlo = (WebView) findViewById(R.id.wvlo);
        //Habilitar Js
        wvlo.getSettings().setJavaScriptEnabled(true);
        wvlo.setFocusable(true);
        wvlo.setFocusableInTouchMode(true);

        //Incrementar Rendimiento

        wvlo.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        wvlo.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        wvlo.getSettings().setDomStorageEnabled(true);
        wvlo.getSettings().setAppCacheEnabled(true);
        wvlo.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        //cargar url
        wvlo.loadUrl("http://geosbolivia.org/geos2017/user/login");
        wvlo.setWebViewClient(new WebViewClient());


        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setIcon(R.mipmap.ic_launcher);
        progressDialog.setMessage("Cargando.........");
        progressDialog.show();



        //Define WebViewClient() para poder leer eventos que ocurren durante el cargado de contenido en el WebView.
        wvlo.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                //elimina ProgressBar.
                progressDialog.dismiss();

            }
        });}}


