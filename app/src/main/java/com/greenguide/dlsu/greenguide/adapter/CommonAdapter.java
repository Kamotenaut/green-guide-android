package com.greenguide.dlsu.greenguide.adapter;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.greenguide.dlsu.greenguide.R;
import com.greenguide.dlsu.greenguide.StudentAffairs;
import com.greenguide.dlsu.greenguide.section.fyi.section.arrows_express.ArrowsExpress;
import com.greenguide.dlsu.greenguide.section.fyi.section.Cheers;
import com.greenguide.dlsu.greenguide.section.fyi.section.EatingPlaces;
import com.greenguide.dlsu.greenguide.section.fyi.section.Housing;
import com.greenguide.dlsu.greenguide.section.fyi.section.Hymns;
import com.greenguide.dlsu.greenguide.section.fyi.section.liturgical.LspoServices;
import com.greenguide.dlsu.greenguide.section.fyi.section.Parking;
import com.greenguide.dlsu.greenguide.section.fyi.section.Photocopy;
import com.greenguide.dlsu.greenguide.section.fyi.section.Printing;
import com.greenguide.dlsu.greenguide.section.fyi.section.Supplies;
import com.greenguide.dlsu.greenguide.section.fyi.section.Tips;
import com.greenguide.dlsu.greenguide.section.fyi.section.Wifi;
import com.greenguide.dlsu.greenguide.section.lpep.DeanActivity;
import com.greenguide.dlsu.greenguide.section.lpep.LasallianPledge;
import com.greenguide.dlsu.greenguide.section.lpep.schedule_a.LpepSchedule;
import com.greenguide.dlsu.greenguide.section.lpep.schedule_b.LpepScheduleb;
import com.greenguide.dlsu.greenguide.section.offices.section.Admin;
import com.greenguide.dlsu.greenguide.section.offices.section.MissionOffices;
import com.greenguide.dlsu.greenguide.section.student_orgs.section.AboutCso;
import com.greenguide.dlsu.greenguide.section.student_orgs.section.usg_officers.AboutUsg;
import com.greenguide.dlsu.greenguide.section.student_orgs.section.ProgramsServices;
import com.greenguide.dlsu.greenguide.section.student_orgs.section.UsgOfficers;
import com.greenguide.dlsu.greenguide.section.student_orgs.section.cso_orgs.Organizations;
import com.greenguide.dlsu.greenguide.section.values_prayers.section.CoreValues;
import com.greenguide.dlsu.greenguide.section.values_prayers.section.Prayers;

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
                        case "Dean's Message":i = new Intent(v.getContext(),DeanActivity.class); v.getContext().startActivity(i);break;
                        case "Lasallian Pledge":i = new Intent(v.getContext(),LasallianPledge.class); v.getContext().startActivity(i);break;
                        case "Lasallian Hymns":i = new Intent(v.getContext(),Hymns.class); v.getContext().startActivity(i);break;
                        case "DLSU Cheers":i = new Intent(v.getContext(),Cheers.class); v.getContext().startActivity(i);break;
                        case "LPEP Schedule A":i = new Intent(v.getContext(),LpepSchedule.class);v.getContext().startActivity(i);break;
                        case "LPEP Schedule B":i = new Intent(v.getContext(),LpepScheduleb.class);v.getContext().startActivity(i);break;
                        case "Arrows Express":i = new Intent(v.getContext(),ArrowsExpress.class);v.getContext().startActivity(i);break;
                        case "Photocopy Services":i = new Intent(v.getContext(),Photocopy.class);v.getContext().startActivity(i);break;
                        case "Parking Locations":i = new Intent(v.getContext(),Parking.class);v.getContext().startActivity(i);break;
                        case "Wifi Spots":i = new Intent(v.getContext(),Wifi.class);v.getContext().startActivity(i);break;
                        case "Printing Services":i = new Intent(v.getContext(),Printing.class);v.getContext().startActivity(i);break;
                        case "Places to Eat":i = new Intent(v.getContext(),EatingPlaces.class);v.getContext().startActivity(i);break;
                        case "School Supplies":i = new Intent(v.getContext(),Supplies.class);v.getContext().startActivity(i);break;
                        case "Core Values":i = new Intent(v.getContext(),CoreValues.class);v.getContext().startActivity(i);break;
                        case "Prayers":i = new Intent(v.getContext(),Prayers.class);v.getContext().startActivity(i);break;
                        case "About the CSO":i = new Intent(v.getContext(),AboutCso.class);v.getContext().startActivity(i);break;
                        case "About the USG":i = new Intent(v.getContext(),UsgOfficers.class);v.getContext().startActivity(i);break;
                        case "Programs and Services":i = new Intent(v.getContext(),ProgramsServices.class);v.getContext().startActivity(i);break;
                        case "CSO Organizations":i = new Intent(v.getContext(),Organizations.class);v.getContext().startActivity(i);break;
                        case "Tips and Tidbits":i = new Intent(v.getContext(),Tips.class);v.getContext().startActivity(i);break;
                        case "Administrative Offices":i = new Intent(v.getContext(),Admin.class);v.getContext().startActivity(i);break;
                        case "Liturgical Activities":i = new Intent(v.getContext(),LspoServices.class);v.getContext().startActivity(i);break;
                        case "Housing Facilities":i = new Intent(v.getContext(),Housing.class);v.getContext().startActivity(i);break;
                        case "Student Affairs Offices":i = new Intent(v.getContext(),StudentAffairs.class);v.getContext().startActivity(i);break;
                        case "Lasallian Mission Offices":i = new Intent(v.getContext(),MissionOffices.class);v.getContext().startActivity(i);break;
                    }
                }
            });
            if(list.get(position).equals("Dean's Message")) {
                holder.vImage.setImageResource(R.drawable.generic3);
            }else if(list.get(position).equals("Lasallian Pledge")) {
                holder.vImage.setImageResource(R.drawable.pledge);
            } else if(list.get(position).equals("Lasallian Hymns")) {
                holder.vImage.setImageResource(R.drawable.hymns);
            } else if(list.get(position).equals("DLSU Cheers")) {
                holder.vImage.setImageResource(R.drawable.dlsucheers);
            } else if(list.get(position).equals("LPEP Schedule A")) {
                holder.vImage.setImageResource(R.drawable.lpepa);
            } else if(list.get(position).equals("LPEP Schedule B")) {
                holder.vImage.setImageResource(R.drawable.lpepb);
            } else if(list.get(position).equals("Arrows Express")) {
                holder.vImage.setImageResource(R.drawable.arrowsexpress);
            } else if(list.get(position).equals("Photocopy Services")) {
                holder.vImage.setImageResource(R.drawable.generic1);
            } else if(list.get(position).equals("Parking Locations")) {
                holder.vImage.setImageResource(R.drawable.arrowsexpress);
            } else if(list.get(position).equals("Wifi Spots")) {
                holder.vImage.setImageResource(R.drawable.generic3);
            } else if(list.get(position).equals("Printing Services")) {
                holder.vImage.setImageResource(R.drawable.generic2);
            } else if(list.get(position).equals("Places to Eat")) {
                holder.vImage.setImageResource(R.drawable.eat);
            } else if(list.get(position).equals("School Supplies")) {
                holder.vImage.setImageResource(R.drawable.supplies);
            } else if(list.get(position).equals("Core Values")) {
                holder.vImage.setImageResource(R.drawable.values);
            } else if(list.get(position).equals("Prayers")) {
                holder.vImage.setImageResource(R.drawable.prayers);
            } else if(list.get(position).equals("About the USG")) {
                holder.vImage.setImageResource(R.drawable.generic4);
            } else if(list.get(position).equals("About the CSO")) {
                holder.vImage.setImageResource(R.drawable.aboutcso);
            } else if(list.get(position).equals("Programs and Services")) {
                holder.vImage.setImageResource(R.drawable.programsservices);
            } else if(list.get(position).equals("CSO Organizations")) {
                holder.vImage.setImageResource(R.drawable.csoorgs);
            } else if(list.get(position).equals("Tips and Tidbits")) {
                holder.vImage.setImageResource(R.drawable.generic4);
            } else if(list.get(position).equals("Administrative Offices")) {
                holder.vImage.setImageResource(R.drawable.generic3);
            } else if(list.get(position).equals("Liturgical Activities")) {
                holder.vImage.setImageResource(R.drawable.liturgical);
            } else if(list.get(position).equals("Housing Facilities")) {
                holder.vImage.setImageResource(R.drawable.housing);
            } else if(list.get(position).equals("Student Affairs Offices")) {
                holder.vImage.setImageResource(R.drawable.generic1);
            } else if(list.get(position).equals("Lasallian Mission Offices")) {
                holder.vImage.setImageResource(R.drawable.generic2);
            }

        }

        @Override
        public int getItemCount() {
            return list.size();
        }


    }
