package com.greenguide.dlsu.greenguide.section.student_orgs.section.adapter;

import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.greenguide.dlsu.greenguide.R;
import com.greenguide.dlsu.greenguide.data.model.Profile;
import com.uncopt.android.widget.text.justify.JustifiedTextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by jasonsioco on 8/13/2016.
 */
public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>{


    private List<Profile> list;

    public ProfileAdapter(List<Profile> list) {
        this.list = list;
    }

    public static class ProfileViewHolder extends RecyclerView.ViewHolder{
        protected TextView vName;
        protected TextView vPosition;
        protected TextView tvEmail;
        protected JustifiedTextView vDescription;
        protected CircleImageView vPhoto;

        public ProfileViewHolder(View v, List<Profile> list) {
            super(v);
            vName =  (TextView) v.findViewById(R.id.profilename);
            vPosition = (TextView) v.findViewById(R.id.profileposition);
            tvEmail = (TextView) v.findViewById(R.id.tv_email);
            vDescription = (JustifiedTextView) v.findViewById(R.id.profiledescription);
            vPhoto = (CircleImageView)v.findViewById(R.id.profileimg);
            String fontPath = "fonts/Montserrat-Regular.ttf";
            Typeface tf = Typeface.createFromAsset(v.getContext().getAssets(), fontPath);
            vName.setTypeface(tf);
            vPosition.setTypeface(tf);
            tvEmail.setTypeface(tf);
            //vDescription.setTypeface(tf);
        }


    }

    @Override
    public ProfileViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_item, parent, false);

        return new ProfileViewHolder(itemView,list);
    }

    @Override
    public void onBindViewHolder(ProfileViewHolder holder, final int position) {
        holder.vName.setText(list.get(position).getName());
        holder.vDescription.setText(list.get(position).getDescription());
        holder.vPosition.setText(list.get(position).getPosition());
        holder.tvEmail.setText(list.get(position).getEmail());
        switch(list.get(position).getPosition()){
            case "USG President":holder.vPhoto.setImageResource(R.drawable.usgpresident);break;
            case "Council Chairperson":holder.vPhoto.setImageResource(R.drawable.cso_council_chairperson);break;
            case "Executive Vice Chairperson for Externals":holder.vPhoto.setImageResource(R.drawable.cso_vc_externals);break;
            case "Executive Vice Chairperson for Internals":holder.vPhoto.setImageResource(R.drawable.cso_vc_internals);break;
            case "Executive Vice Chairperson for Activities and Documentations":holder.vPhoto.setImageResource(R.drawable.cso_vc_docu);break;
            case "Executive Vice Chairperson for Finance":holder.vPhoto.setImageResource(R.drawable.cso_vc_finance);break;
            case "Executive Vice Chairperson for Laguna Campus":holder.vPhoto.setImageResource(R.drawable.cso_vc_stc);break;
            case "Vice President for External Affairs" : holder.vPhoto.setImageResource(R.drawable.usg_vp_external); break;
            case "Vice President for Internal Affairs" : holder.vPhoto.setImageResource(R.drawable.usg_vp_internal); break;
            case "Executive Secretary" : holder.vPhoto.setImageResource(R.drawable.usg_secretary); break;
            case "Executive Treasurer" : holder.vPhoto.setImageResource(R.drawable.usg_treasurer); break;
            case "Computer Studies Government (CSG)" : holder.vPhoto.setImageResource(R.drawable.ccspresident); break;
            case "College Government of Education (CGE)" : holder.vPhoto.setImageResource(R.drawable.coepresident); break;
            case "Arts College Government (ACG)" : holder.vPhoto.setImageResource(R.drawable.clapresident); break;
            case "Business College Government (BCG)" : holder.vPhoto.setImageResource(R.drawable.cobpresident); break;
            case "College of Engineering Government (ECG)" : holder.vPhoto.setImageResource(R.drawable.gcoepresident); break;
            case "Science College Government (SCG)" : holder.vPhoto.setImageResource(R.drawable.cospresident); break;
            case "School of Economics Government (SEG)" : holder.vPhoto.setImageResource(R.drawable.soepresident); break;
            case "Science and Technology Complex Government (STCG)" : holder.vPhoto.setImageResource(R.drawable.stcpresident); break;
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
