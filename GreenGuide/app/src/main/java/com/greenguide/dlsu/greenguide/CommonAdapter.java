package com.greenguide.dlsu.greenguide;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by jasonsioco on 7/29/2016.
 */
public class CommonAdapter extends RecyclerView.Adapter<CommonAdapter.CommonViewHolder>{

        private List<String> list;

        public CommonAdapter(List<String> list) {
            this.list = list;
        }

        public static class CommonViewHolder extends RecyclerView.ViewHolder{
            protected TextView vTitle;
            protected CardView vCard;
            protected ImageView vImage;

            public CommonViewHolder(View v, List<String> list) {
                super(v);
                vTitle =  (TextView) v.findViewById(R.id.itemtitle);
                vCard = (CardView) v.findViewById(R.id.card_view);
                vImage = (ImageView)v.findViewById(R.id.img);
                String fontPath = "fonts/Montserrat-Regular.ttf";
                Typeface tf = Typeface.createFromAsset(v.getContext().getAssets(), fontPath);
                vTitle.setTypeface(tf);
            }


        }

        @Override
        public CommonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

            return new CommonViewHolder(itemView,list);
        }

        @Override
        public void onBindViewHolder(CommonViewHolder holder, final int position) {
            holder.vTitle.setText(list.get(position));
            holder.vCard.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent i;
                    switch(list.get(position)){
                        case "Lasallian Hymn":i = new Intent(v.getContext(),LasallianHymn.class); v.getContext().startActivity(i);break;
                        case "Lasallian Pledge":i = new Intent(v.getContext(),LasallianPledge.class); v.getContext().startActivity(i);break;
                        case "Lasallian Cheers":i = new Intent(v.getContext(),LasallianCheers.class); v.getContext().startActivity(i);break;
                        case "LPEP Schedule":i = new Intent(v.getContext(),LpepSchedule.class);v.getContext().startActivity(i);break;
                        case "Arrows Express":i = new Intent(v.getContext(),ArrowsExpress.class);v.getContext().startActivity(i);break;
                        case "Photocopy Services":i = new Intent(v.getContext(),Photocopy.class);v.getContext().startActivity(i);break;
                        case "CSO Executive Board":i = new Intent(v.getContext(),Csoexecom.class);v.getContext().startActivity(i);break;
                        case "Parking Locations":i = new Intent(v.getContext(),Parking.class);v.getContext().startActivity(i);break;
                        case "Wifi Spots":i = new Intent(v.getContext(),Wifi.class);v.getContext().startActivity(i);break;
                        case "Printing Services":i = new Intent(v.getContext(),Printing.class);v.getContext().startActivity(i);break;
                        case "Places to Eat":i = new Intent(v.getContext(),EatingPlaces.class);v.getContext().startActivity(i);break;
                        case "School Supplies":i = new Intent(v.getContext(),Supplies.class);v.getContext().startActivity(i);break;
                        case "Values and Prayers":i = new Intent(v.getContext(),ValuesPrayers.class);v.getContext().startActivity(i);break;
                        case "About the USG":i = new Intent(v.getContext(),AboutUsg.class);v.getContext().startActivity(i);break;
                        case "About the CSO":i = new Intent(v.getContext(),AboutCso.class);v.getContext().startActivity(i);break;
                        case "USG Executive Board":i = new Intent(v.getContext(),Usgexecom.class);v.getContext().startActivity(i);break;
                        case "Programs and Services":i = new Intent(v.getContext(),ProgramsServices.class);v.getContext().startActivity(i);break;
                        case "Organizations":i = new Intent(v.getContext(),Organizations.class);v.getContext().startActivity(i);break;
                        case "Tips and Tidbits":i = new Intent(v.getContext(),Tips.class);v.getContext().startActivity(i);break;
                    }
                }
            });
            if(list.get(position).equals("Lasallian Hymn"))
                holder.vImage.setBackgroundResource(R.drawable.l1);
        }

        @Override
        public int getItemCount() {
            return list.size();
        }


    }
