package com.greenguide.dlsu.greenguide.section.fyi.section.arrows_express.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.greenguide.dlsu.greenguide.R;
import com.greenguide.dlsu.greenguide.data.model.Schedule;

import java.util.ArrayList;

/**
 * Created by Yep on 2/13/2017.
 */

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder>
{
	protected ArrayList<Schedule> listSchedule;
	private Context context;

	public ScheduleAdapter(ArrayList<Schedule> listSchedule)
	{
		this.listSchedule = listSchedule;
	}

	@Override
	public ScheduleViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
	{
		// inflate the View layout (template) for each item
		View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.sched_item, parent, false);

		context = parent.getContext();
		return new ScheduleViewHolder(v);
	}

	@Override
	public void onBindViewHolder(ScheduleViewHolder holder, int position)
	{
		// place in the data in this position
		final Schedule currSchedule = listSchedule.get(position);

		holder.txtActivityTime.setText(currSchedule.getTime());
		holder.txtActivityTitle.setText(currSchedule.getDescription());

		String fontPath = "fonts/Montserrat-Regular.ttf";
		Typeface tf = Typeface.createFromAsset(context.getAssets(), fontPath);
		holder.txtActivityTime.setTypeface(tf);
		holder.txtActivityTitle.setTypeface(tf);

		// Gray out if no activity
		if (currSchedule.getDescription().trim().isEmpty())
			holder.layMain.setCardBackgroundColor(ResourcesCompat.getColor(context.getResources(), R.color.no_sched, null));
	}

	@Override
	public int getItemCount()
	{
		return listSchedule.size();
	}

	public class ScheduleViewHolder extends RecyclerView.ViewHolder
	{
		protected CardView layMain;
		protected TextView txtActivityTime;
		protected TextView txtActivityTitle;

		public ScheduleViewHolder(View itemView)
		{
			super(itemView);

			layMain = (CardView) itemView.findViewById(R.id.card_view);
			txtActivityTime = (TextView) itemView.findViewById(R.id.activitytime);
			txtActivityTitle = (TextView) itemView.findViewById(R.id.activitytitle);
		}
	}
}
