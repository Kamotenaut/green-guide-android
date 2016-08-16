package com.greenguide.dlsu.greenguide;

import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by jasonsioco on 8/17/2016.
 */
public class DevAdapter extends RecyclerView.Adapter<DevAdapter.ProfileViewHolder>{


        private List<Profile> list;

        public DevAdapter(List<Profile> list) {
            this.list = list;
        }

        public static class ProfileViewHolder extends RecyclerView.ViewHolder{
            protected TextView vName;
            protected TextView vPosition;
            protected TextView vDescription;
            protected CircleImageView vPhoto;

            public ProfileViewHolder(View v, List<Profile> list) {
                super(v);
                vName =  (TextView) v.findViewById(R.id.devname);
                vPosition = (TextView) v.findViewById(R.id.devposition);
                vDescription = (TextView) v.findViewById(R.id.devdescription);
                vPhoto = (CircleImageView)v.findViewById(R.id.devimg);
                String fontPath = "fonts/Montserrat-Regular.ttf";
                Typeface tf = Typeface.createFromAsset(v.getContext().getAssets(), fontPath);
                vName.setTypeface(tf);
                vPosition.setTypeface(tf);
                //vDescription.setTypeface(tf);
            }


        }

        @Override
        public ProfileViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.dev_item, parent, false);

            return new ProfileViewHolder(itemView,list);
        }

        @Override
        public void onBindViewHolder(ProfileViewHolder holder, final int position) {
            holder.vName.setText(list.get(position).getName());
            holder.vDescription.setText(list.get(position).getDescription());
            holder.vPosition.setText(list.get(position).getPosition());
            holder.vPhoto.setImageResource(list.get(position).getResid());
            /*
            switch(list.get(position).getName()){
                case "Jason Sioco":holder.vPhoto.setImageResource(R.drawable.sioco);break;
                case "Miguel Sietereales":holder.vPhoto.setImageResource(R.drawable.siete);break;
                case "Gela Acorda":holder.vPhoto.setImageResource(R.drawable.acorda);break;
                case "Jeno Panganiban":holder.vPhoto.setImageResource(R.drawable.panganiban);break;
                case "Chino Tapales":holder.vPhoto.setImageResource(R.drawable.tapales);break;
                case "Jerrick Estioko":holder.vPhoto.setImageResource(R.drawable.estioko);break;
                case "Megan Avanceña":holder.vPhoto.setImageResource(R.drawable.avancena);break;
                case "Marcus Ramos":holder.vPhoto.setImageResource(R.drawable.ramos);break;
            }*/

        }

        @Override
        public int getItemCount() {
            return list.size();
        }

    }

