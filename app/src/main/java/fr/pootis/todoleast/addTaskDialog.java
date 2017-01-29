package fr.pootis.todoleast;

import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by querat_g on 28/01/17.
 */

public class addTaskDialog extends DialogFragment {

    protected Button _addTaskConfirmButton;
    protected TextView _addTitleTextField;
    protected TextView _addContentTextField;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){

        final View rootView = inflater.inflate(R.layout.add_task_dialog, container, false);


        getDialog().setTitle("honk");


        _addTitleTextField = (TextView)(rootView.findViewById(R.id.addTitleTextField)) ;
        _addContentTextField = (TextView) (rootView.findViewById(R.id.addContentTextField)) ;
        _addTaskConfirmButton = (Button)(rootView.findViewById(R.id.addTaskConfirmButton));

        _addTaskConfirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(getString(R.string.app_name) , "_addTaskConfirmButton pressed !");

                MainActivity.addTask(new TaskItem(
                        0xDEADBEEF // the id will be set after database insertion
                        , _addTitleTextField.getText().toString()
                        , _addContentTextField.getText().toString()
                        , "32 Jambier 967"
                ));
            }
        });


        return rootView;
    }

}
