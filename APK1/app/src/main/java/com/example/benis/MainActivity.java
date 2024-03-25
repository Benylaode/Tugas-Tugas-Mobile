package com.example.benis;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.content.Intent;


        import androidx.activity.EdgeToEdge;
        import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button buttonGoToSecondActivity = findViewById(R.id.button_go_to_second_activity);
        buttonGoToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke aktivitas kedua
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }

        });
    }
}