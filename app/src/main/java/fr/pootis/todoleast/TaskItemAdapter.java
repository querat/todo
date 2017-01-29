package fr.pootis.todoleast;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.View;
import android.widget.TextView;

import java.util.List;

/**
 * Created by querat_g on 24/01/17.
 */

public class TaskItemAdapter extends ArrayAdapter<TaskItem> {


    private class TaskItemViewHolder {
        public TextView title;
        public TextView content;
        public TextView date;
    }

    TaskItemAdapter(Context context, List<TaskItem> taskList){
        super(context, 0, taskList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_textfield, parent, false);
        }

        TaskItemViewHolder viewHolder = (TaskItemViewHolder)convertView.getTag();

        if (viewHolder == null) {

            viewHolder = new TaskItemViewHolder();

            viewHolder.title = (TextView)convertView.findViewById(R.id.title);
            viewHolder.content = (TextView)convertView.findViewById(R.id.text);
            viewHolder.date = (TextView)convertView.findViewById(R.id.date);
            convertView.setTag(viewHolder);
        }

        TaskItem taskItem = this.getItem(position);

        viewHolder.title.setText(taskItem.getTitle());
        viewHolder.content.setText(taskItem.getContent());
        viewHolder.date.setText(taskItem.getDate());

        return convertView;

    }


}