package com.example.ahosanhabib.mycountryprofiledemo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button bangladeshbutton, indiabutton, pakistanbutton;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshbutton = findViewById(R.id.banglaID);
        indiabutton = findViewById(R.id.indiaID);
        pakistanbutton = findViewById(R.id.pakID);

        bangladeshbutton.setOnClickListener(this);
        indiabutton.setOnClickListener(this);
        pakistanbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.banglaID){
            intent = new Intent(MainActivity.this,activity_profile.class);
            intent.putExtra("name","bangladesh");
            startActivity(intent);
        }
        if(v.getId()==R.id.indiaID){
            intent = new Intent(MainActivity.this,activity_profile.class);
            intent.putExtra("name","india");
            startActivity(intent);
        }
        if(v.getId()==R.id.pakID){
            intent = new Intent(MainActivity.this,activity_profile.class);
            intent.putExtra("name","pakistan");
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder  alertDialogBuilder;
        alertDialogBuilder = new  AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setIcon(R.drawable.question);
        alertDialogBuilder.setTitle(R.string.title_text);
        alertDialogBuilder.setMessage(R.string.messege_text);
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
