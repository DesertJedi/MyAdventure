package org.makeitabetterplace.myadventure;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShowFinds extends AppCompatActivity {

    private DBHelper dbHandler;
    private ArrayList<FindsModal> findsModalArrayList;
    private FindRVAdapter findsRVAdapter;
    private RecyclerView findsRV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_finds);

        dbHandler = new DBHelper(this);
        findsModalArrayList = new ArrayList<>();

        findsModalArrayList = dbHandler.readFinds();

        findsRVAdapter = new FindRVAdapter(findsModalArrayList, ShowFinds.this);
        findsRV = findViewById(R.id.idRVFinds);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ShowFinds.this, RecyclerView.VERTICAL, false);
        findsRV.setLayoutManager(linearLayoutManager);

        findsRV.setAdapter(findsRVAdapter);

    }
}