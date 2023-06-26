package com.example.layoutexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creación de snackbar con mensaje de bienvenida.
        Snackbar.make(MainActivity.this.findViewById(android.R.id.content),
                R.string.welcome_shogun6578_to_our_real_estate_portal, Snackbar.LENGTH_LONG)
                .setBackgroundTint(Color.parseColor("#2A6F97"))
                .setTextColor(Color.parseColor("#E3F2FD"))
                .show();

        // Llamado al método para cambiar de tema.
        switchLightTheme();
    }
    private void switchLightTheme() {
        // Se crea una instancia de la clase SwitchMaterial para el botón switch.
        SwitchMaterial switchMaterialTheme = findViewById(R.id.lightThemeSwitch);

        // Se le da funcionalidad al botón switch.
        switchMaterialTheme.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Comportamiento para el modo oscuro.
                if (isChecked) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    buttonView.setText(R.string.light);

                // Comportamiento para el modo claro.
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    buttonView.setText(R.string.night);
                }
            }
        });
    }
}
