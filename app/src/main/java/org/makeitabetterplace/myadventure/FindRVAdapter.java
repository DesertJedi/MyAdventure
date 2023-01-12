package org.makeitabetterplace.myadventure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindRVAdapter extends RecyclerView.Adapter<FindRVAdapter.ViewHolder> {
    private ArrayList<FindsModal> findsModalArrayList;
    private Context context;

    // constructor
    public FindRVAdapter(ArrayList<FindsModal> findsModalArrayList, Context context) {
        this.findsModalArrayList = findsModalArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.find_rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int positition) {
        FindModal modal = findsModalArrayList.get(positition);
        holder.findDescription.setText(modal.getDescription());
        holder.findDetails.setText(modal.getDetails());
        holder.findLongitude.setText(modal.getLongitude());
        holder.findLatitude.setText(modal.getLatitude());
        holder.findAltitude.setText(modal.getAltitude());
    }

    @Override
    public int getItemCount() {
        return findsModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView findDescription, findDetails, findLongitude, findLatitude, findAltitude;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // initialize text views
            findDescription = itemView.findViewById(R.id.idFindDescription);
            findDetails = itemView.findViewById(R.id.idFindDetails);
            findLongitude = itemView.findViewById(R.id.id)
        }
    }
}
