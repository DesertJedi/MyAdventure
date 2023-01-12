package org.makeitabetterplace.myadventure;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btnAddAFind;
    Button btnShowFinds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddAFind = (Button) findViewById(R.id.btn_launchAddAFindActivity);

        btnAddAFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddAFindActivity();
            }
        });

        btnShowFinds = (Button) findViewById(R.id.btn_launchShowFindsActivity);
        btnShowFinds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openShowFindsActivity(); }
        });
    }

    public void openAddAFindActivity(){
        Intent intent = new Intent(this, AddAFind.class);
        startActivity(intent);
    }
    public void openShowFindsActivity(){
        Intent intent = new Intent(this, ShowFinds.class);
        startActivity(intent);
    }
}