package com.example.u4ejercicioreserva1602;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;

/**
 * Created by DIDACT on 20/02/2018.
 */

public class DialogInfo extends DialogFragment{

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder =
                new AlertDialog.Builder(getActivity());

        builder.setMessage("Los mejores cocidos de la comarca. \nTu madre es una mindundi al lado nuestro.")
                .setTitle("Restaurante Casa Loli")
                .setPositiveButton("Vale, perdona", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        return builder.create();
    }
}
