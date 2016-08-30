package com.greenguide.dlsu.greenguide;

import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.greenguide.dlsu.greenguide.data.model.NameTag;

import java.util.List;

/**
 * Created by jasonsioco on 8/13/2016.
 */
public class OrgAdapter extends RecyclerView.Adapter<OrgAdapter.OrgViewHolder>{

    private List<NameTag> list;

    public OrgAdapter(List<NameTag> list) {
        this.list = list;
    }

    public static class OrgViewHolder extends RecyclerView.ViewHolder{
        protected TextView vTitle;
        //protected TextView vDescription;
        protected ImageView vPhoto;

        public OrgViewHolder(View v, List<NameTag> list) {
            super(v);
            vTitle = (TextView) v.findViewById(R.id.orgtitle);
            //vDescription = (TextView) v.findViewById(R.id.orgdescription);
            vPhoto = (ImageView)v.findViewById(R.id.orgimg);
            String fontPath = "fonts/Montserrat-Regular.ttf";
            Typeface tf = Typeface.createFromAsset(v.getContext().getAssets(), fontPath);
            vTitle.setTypeface(tf);
            //vDescription.setTypeface(tf);
        }


    }

    @Override
    public OrgViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.org_item, parent, false);

        return new OrgViewHolder(itemView,list);
    }

    @Override
    public void onBindViewHolder(OrgViewHolder holder, final int position) {
        holder.vTitle.setText(list.get(position).getName());
        //holder.vDescription.setText(list.get(position).getDescription());
        switch(list.get(position).getName()){

            case "AdCreate Society":holder.vPhoto.setImageResource(R.drawable.adcreate);break;
            case "Business Management Society (BMS)":holder.vPhoto.setImageResource(R.drawable.bms) ;break;
            case "Economics Organization (EconOrg)": holder.vPhoto.setImageResource(R.drawable.econorg);break;
            case "Junior Entrepreneurs Marketing Association (JEMA)": holder.vPhoto.setImageResource(R.drawable.jema);break;
            case "Junior Philippine Institute of Accountants (JPIA)": holder.vPhoto.setImageResource(R.drawable.jpia);break;
            case "Ley La Salle (LSS)": holder.vPhoto.setImageResource(R.drawable.ley);break;
            case "Management of Financial Institution Association (MaFIA)": holder.vPhoto.setImageResource(R.drawable.mafia);break;
            case "Young Entrepreneurs Society (YES)": holder.vPhoto.setImageResource(R.drawable.yes);break;

            case "The Organization for American Studies Students (AMSTUD)": holder.vPhoto.setImageResource(R.drawable.amstud);break;
            case "Behavioral Sciences Society (BSS)": holder.vPhoto.setImageResource(R.drawable.bss);break;
            case "Dalubhasaan ng mga Umuusbong na Mag-aaral ng Araling Filipino (DANUM)": holder.vPhoto.setImageResource(R.drawable.danum);break;
            case "European Studies Association (ESA)": holder.vPhoto.setImageResource(R.drawable.esa);break;
            case "Sociedad de Historia (SDH)": holder.vPhoto.setImageResource(R.drawable.sdh);break;
            case "Samahan ng Lasalyanong Pilosopo (DLSU Pilosopo)": holder.vPhoto.setImageResource(R.drawable.pilosopo);break;
            case "Nihon Kenkyuu Kai (NKK)": holder.vPhoto.setImageResource(R.drawable.nkk);break;
            case "Political Science Society (POLISCY)": holder.vPhoto.setImageResource(R.drawable.poliscy);break;
            case "Samahan ng mga Mag-aaral sa Sikolohiya (SMS)": holder.vPhoto.setImageResource(R.drawable.sms);break;
            case "Team Communications (TEAMCOMM)": holder.vPhoto.setImageResource(R.drawable.teamcomm);break;
            case "Kapatiran ng Kabataan para sa Kaunlaran (KKK)": holder.vPhoto.setImageResource(R.drawable.kkk);break;
            //case "Cultura" : holder.vPhoto.setImageResource();break;

            case "Association of Computer Engineering Students (ACCESS)": holder.vPhoto.setImageResource(R.drawable.access);break;
            case "Chemical Engineering Society (ChEn)": holder.vPhoto.setImageResource(R.drawable.chen);break;
            case "Civil Engineering Society (CES)": holder.vPhoto.setImageResource(R.drawable.ces);break;
            case "Electronics and Communications Engineering Society (ECES)": holder.vPhoto.setImageResource(R.drawable.eces);break;
            //case "Industrial Management Engineering Society (IMES)": holder.vPhoto.setImageResource(R.drawable.imes);break;
            case "Mechanical Engineering Society (MES)": holder.vPhoto.setImageResource(R.drawable.mes);break;
            case "Society of Manufacturing Engineering (SME)": holder.vPhoto.setImageResource(R.drawable.sme);break;

            case "Chemistry Society (ChemSoc)": holder.vPhoto.setImageResource(R.drawable.chemsoc);break;
            case "Mathematics Circle (Math Circle)": holder.vPhoto.setImageResource(R.drawable.mc);break;
            case "Physics Society (PhySoc)": holder.vPhoto.setImageResource(R.drawable.physoc);break;
            case "Societas Vitae (SV)": holder.vPhoto.setImageResource(R.drawable.sv) ;break;

            case "La Salle Computer Society (LSCS)": holder.vPhoto.setImageResource(R.drawable.lscs);break;
            case "Union of Students Inspired Towards Education (UNITED)": holder.vPhoto.setImageResource(R.drawable.united);break;
            //case "DLSU Filipino & Chinese Organization (ENGLICOM)": holder.vPhoto.setImageResource(R.drawable.englicom);break;
            case "Rotaract Club of DLSU (ROTARACT)": holder.vPhoto.setImageResource(R.drawable.rotaract);break;
            case "United International Student Organization (UNISTO)": holder.vPhoto.setImageResource(R.drawable.unisto);break;
            case "AISEC-DLSU": holder.vPhoto.setImageResource(R.drawable.aisec_dlsu);break;
            //case "Moomedia": holder.vPhoto.setImageResource(R.drawable.moo);break;
            case "Outdoor Club (OC)": holder.vPhoto.setImageResource(R.drawable.oc);break;
            case "Writers’ Guild (WG)": holder.vPhoto.setImageResource(R.drawable.wg);break;
            case "De La Salle University – Environmental Conservation Organization (ECO)": holder.vPhoto.setImageResource(R.drawable.eco);break;
            case "Gakuen Anime Soshiki (GAS – School of Anime Organization)": holder.vPhoto.setImageResource(R.drawable.gas);break;
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
