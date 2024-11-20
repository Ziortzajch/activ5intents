package es.travelworld.www.activ5intents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import es.travelworld.www.activ5intents.databinding.ActivityRegistroBinding;

public class Registro extends GestionMenus {



    ActivityRegistroBinding binding;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityRegistroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //aqui coloco la informacion del toolbar para que sea visible en esta pantalla//
        setActionBar(findViewById(R.id.toolbar));
        getActionBar().setTitle("REGISTRO");

        Bundle bundle=getIntent().getBundleExtra("datobundle");
        Usuario usuario=(Usuario)bundle.getSerializable("datousuario");
        Usuario usuario1=(Usuario)bundle.getSerializable("datocontrasena");//es correcto poner los dos usuarios?//
        binding.setUser(usuario);



        //aqui quiero recoger los datos de la pag registro a través del botón me apunto//
        binding.btMeapunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String comotellamas =binding.textinputedittexNombre.getText().toString();
                String tuapellido = binding.textinputedittexApellido.getText().toString();
                String spinneredad = binding.spEdad.toString();

                if (!comotellamas.isEmpty() && !tuapellido.isEmpty() && !spinneredad.isEmpty()){ //cuando es un spinner tambien se utiliza el .isEmpty?//
                //aqui quiero volver a la main mediante un intent//
                    Intent intentVolverMain = new Intent(Registro.this, MainActivity.class);
                    Bundle bundleVolverMain = new Bundle();
                    //en el hueco de "" lo he de dejar vacio para que registre el nombre que el usuario quiere poner?//
                    //el bundle se relaciona con el intent de la main activity//
                    Bundle datousuariobundle= getIntent().getBundleExtra("datousuariobundle");
                    Bundle datocontrasenabundle= getIntent().getBundleExtra("datocontrasenabundle");


                    Toast.makeText(this,"Registro realizado correctamente", Toast.LENGTH_SHORT).show();
                    startActivity(intentVolverMain);
                    finish();

                }






            }
        });



    }
}