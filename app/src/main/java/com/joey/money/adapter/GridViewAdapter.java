package com.joey.money.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.joey.money.R;
import com.joey.money.bean.Money;

import java.util.List;

/** 
* GridView 的适配器 
* @author joey
* created at 2017/8/20 15:38 
*/

public class GridViewAdapter extends BaseAdapter {
    private Context mContext;
    private List<Money> mData;
    private LayoutInflater inflater;

    public GridViewAdapter(Context mContext, List<Money> mData) {
        this.mContext = mContext;
        this.mData = mData;
        this.inflater = LayoutInflater.from(mContext);
    }

    public void setData(List<Money> data) {
        this.mData = data;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Money getItem(int i) {
        return mData.get(i);
    }


    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.gv_item_layout, null);
            holder.name = view.findViewById(R.id.tv_name);
            holder.picId = view.findViewById(R.id.iv_photo);
            view.setTag(holder);
        }else {
            holder= (ViewHolder) view.getTag();
        }

        Money money=getItem(i);
        holder.name.setText(money.getName());
        //holder.picId.setImageResource(money.getPicId());

        return view;
    }

    private class ViewHolder {
        private ImageView picId;
        private TextView name;
    }
}
