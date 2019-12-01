package com.bw.mvp_one.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bw.mvp_one.R;
import com.bw.mvp_one.model.bean.Bean;
import com.bw.mvp_one.uitl.NetUitl;

import java.util.List;

/**
 * DateTime:2019/12/1 0001
 * author:朱贵全(Administrator)
 * function:
 */
public class MyAdaoter extends BaseAdapter {
    private List<Bean.ListdataBean> listdata;

    public MyAdaoter(List<Bean.ListdataBean> listdata) {

        this.listdata = listdata;
    }

    @Override
    public int getCount() {
        return listdata.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder=null;
        if(view==null){
            view=View.inflate(viewGroup.getContext(), R.layout.item,null);
            viewHolder=new ViewHolder();
            viewHolder.imageView=view.findViewById(R.id.img);
            viewHolder.textView=view.findViewById(R.id.tv);
            view.setTag(viewHolder);
        }else{
             viewHolder = (ViewHolder) view.getTag();
        }
        Bean.ListdataBean listdataBean = listdata.get(i);
        viewHolder.textView.setText(listdataBean.getContent());
        NetUitl.getInstance().getPhoto(listdataBean.getAvatar(),viewHolder.imageView);
        return view;
    }
    private class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
