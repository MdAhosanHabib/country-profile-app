package com.example.ahosanhabib.mycountryprofiledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_profile extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView = findViewById(R.id.imageID);
        textView = findViewById(R.id.textID);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){
            String countryname = bundle.getString("name");
            showdetails(countryname);
        }
    }

    void showdetails(String countryname){
        if(countryname.equals("bangladesh")){
            imageView.setImageResource(R.drawable.shanshad);
            textView.setText(R.string.bng_text);
        }
        if(countryname.equals("india")){
            imageView.setImageResource(R.drawable.tajmahal);
            textView.setText(R.string.india_text);
        }
        if(countryname.equals("pakistan")){
            imageView.setImageResource(R.drawable.pakistan_historical);
            textView.setText(R.string.pak_text);
        }
    }
}
