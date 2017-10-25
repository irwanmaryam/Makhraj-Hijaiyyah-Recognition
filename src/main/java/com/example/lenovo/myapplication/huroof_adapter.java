package com.example.lenovo.myapplication;
/**
 * Created by lenovo on 18-Oct-17.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.lenovo.myapplication.R;

import java.util.List;

public class huroof_adapter extends RecyclerView.Adapter<huroof_adapter.MyViewHolder> {

    private Context mContext;
    private List<Huroof> huroofList;
    private huroofAdapterListener listener;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;
        public ImageView thumbnail, overflow;
        public CardView cardView;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            count = (TextView) view.findViewById(R.id.count);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            cardView = view.findViewById(R.id.card_view);

        }
    }


    public huroof_adapter(Context mContext, List<Huroof> huroofList) {
        this.mContext = mContext;
        this.huroofList = huroofList;
        this.listener = listener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.huroof_card, parent, false);

        return new MyViewHolder(itemView);
    }


    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        Huroof huroof = huroofList.get(position);
        holder.title.setText(huroof.getName());
        holder.count.setText(huroof.getNumOfHuroof() + " Huroof");


        // loading album cover using Glide library
        Glide.with(mContext).load(huroof.getThumbnail()).into(holder.thumbnail);



        holder.cardView.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){
                if (position == 0)
                {
                    Intent intent = new Intent(view.getContext(),HaaActivity.class);
                    mContext.startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(view.getContext(), TsaActivity.class);
                    mContext.startActivity(intent);
                }
                if(position == 2)
                {
                    Intent intent = new Intent(view.getContext(),ZhoActivity.class);
                    mContext.startActivity(intent);
                }
                if(position == 3)
                {
                    Intent intent = new Intent(view.getContext(),DzaActivity.class);
                    mContext.startActivity(intent);
                }





            }
        });

        holder.thumbnail.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view){
                    if (position == 0)
                    {
                        Intent intent = new Intent(view.getContext(),HaaActivity.class);
                        mContext.startActivity(intent);
                    }
                    if (position == 1) {
                        Intent intent = new Intent(view.getContext(), TsaActivity.class);
                        mContext.startActivity(intent);
                    }
                    if(position == 2)
                    {
                        Intent intent = new Intent(view.getContext(),ZhoActivity.class);
                        mContext.startActivity(intent);
                    }
                    if(position == 3)
                    {
                        Intent intent = new Intent(view.getContext(),DzaActivity.class);
                        mContext.startActivity(intent);
                    }

            }
        });

    }





    @Override
    public int getItemCount() {
        return huroofList.size();
    }


    public interface huroofAdapterListener
    {
        void onCardSelected(int position, ImageView thumbnail);


    }


}