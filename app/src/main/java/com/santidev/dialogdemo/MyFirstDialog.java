package com.santidev.dialogdemo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class MyFirstDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //El dialogo tendra por titulo elige una opcion de las siguientes y tendra un boton ok y uno cancelar
        builder.setMessage("Elige una opcion de las siguientes")
                .setTitle("Alerta").setIcon(R.mipmap.ic_launcher_round)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

        //devolvemos el objeto fabricado Dialog
        return builder.create();
    }
}
