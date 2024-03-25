package com.example.benis;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import android.content.pm.PackageManager;
import android.widget.Toast;



public class SecondActivity extends AppCompatActivity {

    private static final int REQUEST_CALL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button buttonGoToSecondActivity = findViewById(R.id.button_go_to_kampus);
        buttonGoToSecondActivity.setOnClickListener(v -> {
            String uri = "geo:0,0?q=Universitas+Hasanuddin";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
            intent.setPackage("com.google.android.apps.maps");
            startActivity(intent);
        });

        Button telphone = findViewById(R.id.button_go_to_tlp);
        telphone.setOnClickListener(v -> {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:085904403535"));
                startActivity(intent);

        });
    }


}
