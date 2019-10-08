package sree.com.tourlist;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.nfc.Tag;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TourAdapter extends RecyclerView.Adapter<TourAdapter.ViewHolder> {

    private List<String> mData;
    private Context mContext;


    // data is passed into the constructor
    public TourAdapter(Context context, List<String> data) {
        this.mContext = context;
        this.mData = data;

    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tour_list, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.animalName.setText(mData.get(position));
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (mData.get(position)){
                    case "Tour 1":
                        Toast.makeText(mContext,"Canada", Toast.LENGTH_SHORT).show();
                        break;

                    case "Tour 2":
                        Toast.makeText(mContext,"UK", Toast.LENGTH_SHORT).show();
                        break;

                    case "Tour 3":
                        Toast.makeText(mContext,"Norway", Toast.LENGTH_SHORT).show();
                        break;

                    case "Tour 4":
                        Toast.makeText(mContext,"Iceland", Toast.LENGTH_SHORT).show();
                        break;

                    case "Tour 5":
                        Toast.makeText(mContext,"Africa", Toast.LENGTH_SHORT).show();
                        break;


                    default:
                        Toast.makeText(mContext,"Ireland", Toast.LENGTH_SHORT).show();
                        break;
                }

              //  Toast.makeText(mContext,mData.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView animalName;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            animalName=itemView.findViewById(R.id.tvAnimalName);
            parentLayout=itemView.findViewById(R.id.parent_layout);
        }
    }
}
