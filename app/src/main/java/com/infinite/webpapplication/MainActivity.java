package com.infinite.webpapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.webp.libwebpJNI;

public class MainActivity extends AppCompatActivity {
    static {
        System.loadLibrary("webp");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        encode(new byte[2], new int[]{1,2}, 1, 1, 1);
    }


    private void encode(byte[] source, int[] outputSize, int var1, int var2, int var3) {
        libwebpJNI.wrap_WebPEncodeLosslessRGBA(source, 1, 1, outputSize, var1, var2, var3);
    }
}
