
package com.example.dikta_pc.sentimenanalis.adapter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.example.dikta_pc.sentimenanalis.R;
import com.squareup.picasso.Picasso;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WisataViewAdapter extends RecyclerView.Adapter<WisataViewAdapter.ImageViewHolder> {
    private Context mContex;
    private List<Wisata> mListUploads;

    public WisataViewAdapter(Context mCon, List<Wisata> list){
        mContex = mCon;
        mListUploads = list;
    }


    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContex).inflate(R.layout.item_wisata,parent, false);
        return new ImageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ImageViewHolder holder, int position) {
        final Wisata mWis = mListUploads.get(position);

        Picasso.get().load(mWis.getImgUrl()).into(holder.imgView);
    }

    @Override
    public int getItemCount() {
        return mListUploads.size();
    }


    //class temp
    public class ImageViewHolder extends RecyclerView.ViewHolder{
        public ImageView imgView;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            imgView = itemView.findViewById(R.id.imgbgview);
        }
    }

}
