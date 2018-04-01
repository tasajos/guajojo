package org.geosbolivia.geos_v1;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class notificacion extends AppCompatActivity {

    WebView wvno;

    @Override
    public void onBackPressed(){
        if (wvno.canGoBack()){
            wvno.goBack();
        }else {
            super.onBackPressed();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.not);
        wvno = (WebView) findViewById(R.id.wvno);
        //Habilitar Js
        wvno.getSettings().setJavaScriptEnabled(true);
        wvno.setFocusable(true);
        wvno.setFocusableInTouchMode(true);

        //Incrementar Rendimiento

        wvno.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        wvno.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        wvno.getSettings().setDomStorageEnabled(true);
        wvno.getSettings().setAppCacheEnabled(true);
        wvno.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        //cargar url
        wvno.loadUrl("http://geosbolivia.org/geos2017/es/notc");
        wvno.setWebViewClient(new WebViewClient());


        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setIcon(R.mipmap.ic_launcher);
        progressDialog.setMessage("Cargando.........");
        progressDialog.show();



        //Define WebViewClient() para poder leer eventos que ocurren durante el cargado de contenido en el WebView.
        wvno.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                //elimina ProgressBar.
                progressDialog.dismiss();

            }
        });}}


