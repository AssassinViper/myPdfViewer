package com.example.packdel.mypdfviewer;

import android.graphics.pdf.PdfDocument;
import android.graphics.pdf.PdfRenderer;
import android.os.AsyncTask;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.webkit.WebView;

import com.github.barteksc.pdfviewer.PDFView;

import org.xmlpull.v1.XmlPullParser;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String url = "https://freepsychotherapybooks.org/order/download/file_id-6570/order_id-724594";

        /*try {

            InputStream inputStream = getAssets().open("manipulator.pdf");

            ConstraintLayout layout = findViewById(R.id.main_layout);

            MyAsyncTask myAsyncTask = new MyAsyncTask(getApplicationContext(), inputStream, layout);

            myAsyncTask.doInBackground(null);

        } catch (IOException e) {
            e.printStackTrace();
        }*/


        WebView webView = findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);




    }
}
