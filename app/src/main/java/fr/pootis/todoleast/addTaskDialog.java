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

/**
 * Created by querat_g on 28/01/17.
 */

public class addTaskDialog extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){

        View rootView = inflater.inflate(R.layout.add_task_dialog, container, false);

        getDialog().setTitle("honk");

        /*

        getDialog().setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // TODO: add to SQLite
                        Log.w("addTaskDialog", "Pressed OK");
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // TODO: add to SQLite
                        Log.w("addTaskDialog", "Pressed OK");
                    }
                });
*/

       /* Dialog dialog = builder.create();
        dialog.show();*/
        return rootView;
    }

}
