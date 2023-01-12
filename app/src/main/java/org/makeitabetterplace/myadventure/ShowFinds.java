package org.makeitabetterplace.myadventure;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ShowFinds extends AppCompatActivity {

    private DBHelper dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_finds);

        dbHandler = new DBHelper(this);
    }
}