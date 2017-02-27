package com.projecttravel.projecttravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private static Button button_sbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();}
    public void OnClickButtonListener() {
        button_sbm = (Button) findViewById(R.id.button);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View V) {
                        Intent intent = new Intent("com.projecttravel.projecttravel.Main2Activity");
                        startActivity(intent);
                    }});
        button_sbm = (Button) findViewById(R.id.button2);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View V) {
                        Intent intent = new Intent("com.projecttravel.projecttravel.Main3Activity");
                        startActivity(intent);
                    }});
        button_sbm = (Button) findViewById(R.id.button3);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View V) {
                        Intent intent = new Intent("com.projecttravel.projecttravel.Main4Activity");
                        startActivity(intent);
                    }});}
}
