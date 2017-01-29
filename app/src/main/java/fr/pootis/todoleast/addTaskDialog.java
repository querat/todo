package fr.pootis.todoleast;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by querat_g on 28/01/17.
 */

public class addTaskDialog extends Dialog {

    protected Activity mActvity;

    public addTaskDialog(Activity activity){
        super(activity, android.R.style.Theme_Translucent);
        mActvity = activity;
    }

}
