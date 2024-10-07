package com.example.mobilecomputingactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView movetoact1, movetoact2, movetoact3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        movetoact1 = findViewById(R.id.MoveToAct1);
        movetoact2 = findViewById(R.id.MoveToAct2);
        movetoact3 = findViewById(R.id.MoveToAct3);
    }

    @Override
    public void onClick (View view) {
        if (view.getId() == R.id.MoveToAct1) {
            startActivity(new Intent(MainActivity.this, HelloWorld.class));
        } if (view.getId() == R.id.MoveToAct2) {
            startActivity(new Intent(MainActivity.this, RegisterForm.class));
        } if (view.getId() == R.id.MoveToAct3) {
            startActivity(new Intent(MainActivity.this, SignUp.class));
        } if (view.getId() == R.id.MoveToAct4) {
            startActivity(new Intent(MainActivity.this, Calculator.class));
        }
    }
}