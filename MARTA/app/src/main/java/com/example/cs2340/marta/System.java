package com.example.cs2340.marta;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class System extends AppCompatActivity implements View.OnClickListener {

    private Button buttonLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system);
        buttonLogout= (Button) findViewById(R.id.mslogout);
        buttonLogout.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v == buttonLogout) {
            Intent intLogout = new Intent(this, MainActivity.class);
            startActivity(intLogout);
        }
    }
}
