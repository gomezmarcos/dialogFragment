package com.example.android.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.View;
import android.widget.Toast;

/**
 * Created by android on 15/10/15.
 */
public class MiDialogo extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.dialog, null);
        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
        dialog.setView(view);
        dialog.setTitle("El Titulo");
        dialog.setMessage("El Mensaje");
        dialog.setPositiveButton("Ejecutar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"un dialog",Toast.LENGTH_SHORT).show();
            }
        });//el null este es el listener!
        dialog.setNegativeButton("Cancelar", null);
        return dialog.create();
    }
}
