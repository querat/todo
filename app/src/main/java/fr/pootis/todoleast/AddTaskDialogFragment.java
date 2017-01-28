package fr.pootis.todoleast;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by querat_g on 28/01/17.
 */

public class AddTaskDialogFragment extends DialogFragment {

    public static  AddTaskDialogFragment newInstance(int title) {

        AddTaskDialogFragment dialog = new AddTaskDialogFragment();
        Bundle args = new Bundle();

        args.putInt("Ajout", title);
        dialog.setArguments(args);
        return dialog;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {

        View v = inflater.inflate(R.layout.add_task_dialog_fragment, container, false);


        return v;
    }
}
