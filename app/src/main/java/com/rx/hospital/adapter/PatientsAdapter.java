package com.rx.hospital.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rx.hospital.R;
import com.rx.hospital.model.Doctor;
import com.rx.hospital.model.Patient;

import java.util.ArrayList;

public class PatientsAdapter extends RecyclerView.Adapter<PatientsAdapter.ViewHolder> {

    private final Context context;
    private final ArrayList<Patient> courseModelArrayList;

    // Constructor
    public PatientsAdapter(Context context, ArrayList<Patient> courseModelArrayList) {
        this.context = context;
        this.courseModelArrayList = courseModelArrayList;
    }

    @NonNull
    @Override
    public PatientsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PatientsAdapter.ViewHolder holder, int position) {
        // to set data to textview and imageview of each card layout
        Patient model = courseModelArrayList.get(position);
        holder.courseNameTV.setText(model.getName());
        holder.courseRatingTV.setText("" + model.getGender());
      //  holder.courseIV.setImageResource(model.());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number of card items in recycler view
        return courseModelArrayList.size();
    }

    // View holder class for initializing of your views such as TextView and Imageview
    class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView courseIV;
        private final TextView courseNameTV;
        private final TextView courseRatingTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            courseIV = itemView.findViewById(R.id.idIVCourseImage);
            courseNameTV = itemView.findViewById(R.id.idTVCourseName);
            courseRatingTV = itemView.findViewById(R.id.idTVCourseRating);
        }
    }
}