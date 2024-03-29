package com.ard.arddevone.comicnet.Adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import com.ard.arddevone.comicnet.Item.ScdList;
import com.ard.arddevone.comicnet.R;

import java.util.List;

/**
 * Created by admin on 01-01-2018.
 */

public class AllCommentAdapter extends RecyclerView.Adapter<AllCommentAdapter.ViewHolder> {

    private Activity activity;
    private List<ScdList> scdLists;

    public AllCommentAdapter(Activity activity, List<ScdList> scdLists) {
        this.activity = activity;
        this.scdLists = scdLists;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.comment_adapter, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        holder.textView_Name.setText(scdLists.get(0).getCommentLists().get(position).getUser_name());
        holder.textView_date.setText(scdLists.get(0).getCommentLists().get(position).getDt_rate());
        holder.textView_comment.setText(scdLists.get(0).getCommentLists().get(position).getComment_text());

    }

    @Override
    public int getItemCount() {
        return scdLists.get(0).getCommentLists().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView_Name, textView_date, textView_comment;

        public ViewHolder(View itemView) {
            super(itemView);

            textView_Name = (TextView) itemView.findViewById(R.id.textView_userName_comment_adapter);
            textView_date = (TextView) itemView.findViewById(R.id.textView_date_comment_adapter);
            textView_comment = (TextView) itemView.findViewById(R.id.textView_comment_adapter);

        }
    }
}
