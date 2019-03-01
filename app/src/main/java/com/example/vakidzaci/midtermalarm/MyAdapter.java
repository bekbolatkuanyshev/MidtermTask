package com.example.vakidzaci.midtermalarm;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;



import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.TruckViewHolder>{

    private View.OnClickListener myClickListener;
    private Context context;
    List<AlarmItem> items;

    public MyAdapter(){}

    @NonNull
    @Override
    public TruckViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.item, parent, false);

        TruckViewHolder viewHolder = new TruckViewHolder(contactView,myClickListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TruckViewHolder holder, int position) {
        AlarmItem alarmItem = items.get(position);
        holder.mTime.setText(alarmItem.getTime());
        holder.mMsg.setText(alarmItem.getMessage());
        holder.aSwitch.setChecked(alarmItem.isCheck());
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    public class TruckViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView mTime,mMsg;
        public Switch aSwitch;

        public TruckViewHolder(View itemView,View.OnClickListener myClickListener) {
            super(itemView);
            itemView.setOnClickListener(this);
            init();
            itemView.setOnClickListener(myClickListener);
        }

        private void init(){
            mTime = (TextView) itemView.findViewById(R.id.time);
            mMsg = (TextView) itemView.findViewById(R.id.message);
            aSwitch = (Switch) itemView.findViewById(R.id.switch1);

        }

        @Override
        public void onClick(View v) {

        }
    }

    public void addItems(List<AlarmItem> truckItems){
        items = truckItems;
        notifyDataSetChanged();
    }

    public void addContext(Context context){
        this.context = context;
    }





}
