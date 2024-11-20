package es.travelworld.www.activ5intents;

import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class GestionMenus extends AppCompatActivity {

    //sobreescribo los metodos para que el menu funcione//
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        getMenuInflater().inflate(R.menu.mi_menu,menu); //no me reconoce la variable de menu//
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }



}











