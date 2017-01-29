package fr.pootis.todoleast;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by querat_g on 28/01/17.
 */

public class addTaskDialog extends DialogFragment {

    protected Button _addTaskConfirmButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){

        final View rootView = inflater.inflate(R.layout.add_task_dialog, container, false);

        getDialog().setTitle("honk");

        _addTaskConfirmButton = (Button)(rootView.findViewById(R.id.addTaskConfirmButton));
        _addTaskConfirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("TodoList", "_addTaskConfirmButton pressed !");


            }
        });


        return rootView;
    }

}
