package com.example.listviewth;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<User> userList;// chua danh sach nhung doi tuong (User)

    public ListAdapter(Context context, int layout, List<User> userList) {
        this.context = context;
        this.layout = layout;
        this.userList = userList;
    }

    @Override
    public int getCount() { //tra ve so dong de hien thi du lieu tren listview
        return userList.size(); //lay ptu cua mang trong userlist (tat ca)
    }

    @Override
    public Object getItem(int i) { //tra ve object
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        CircleImageView civPic;
        TextView txtName, txtId;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) { //tra ve moi dong tren item khi goi den adapter

        ViewHolder holder;

        if(view == null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService((Context.LAYOUT_INFLATER_SERVICE));//lay phan context
            view = inflater.inflate(layout, null);
            //khoi tao viewholder
            holder = new ViewHolder();
            //anh xa view
            holder.txtName = (TextView) view.findViewById(R.id.tvNameStudent);
            holder.txtId = (TextView) view.findViewById(R.id.tvIdStudent);
            holder.civPic = (CircleImageView) view.findViewById((R.id.imgProfile));
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }

        //gan gia tri
        User user = userList.get(i);
        holder.txtName.setText(user.getName());
        holder.txtId.setText(user.getIdStudent());
        holder.civPic.setImageResource(user.getPicProfile());

        return view;
    }
}
