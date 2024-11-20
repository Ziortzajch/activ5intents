package es.travelworld.www.activ5intents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import es.travelworld.www.activ5intents.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //aqui quiero que reciba los datos de la activity registro//
        Intent intent = getIntent();
        if (intent !=null && intent.getExtras()!=null){
            Bundle datosregistro =intent.getExtras();
            binding.textLogin.getText().toString();
            binding.textPassword.getText().toString();
        }

        binding.btCreateNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //en estas lineas he desarrollado las dos casillas es correcto? no entiendo que dato va aqui (los datos del mainactivity o los de registro?)//
                String datousuario= binding.textLogin.getText().toString();
                String datocontrasena=binding.textPassword.getText().toString();

                Usuario usuario= new Usuario(String datousuario);//aqui no entiendo porque no me reconoce datousuario cuando lo tengo nombrado en la clase Usuario//
                Usuario usuario1=new Usuario(String datocontrasena);


                //Aquí quiero llamar al segundo activity Registro//
                Intent intentIrRegistro=new Intent(MainActivity.this, Registro.class);
                startActivity(intentIrRegistro);

                Bundle bundle= new Bundle();
                // porque tengo que poner el bundle aqui tambien ?//
                bundle.putSerializable("datousuario",usuario);//no entiendo que es lo que hay que poner "" //
                bundle.putSerializable("datocontrasena",usuario);
                //con este intent quiero relacionar los datos con la pag registro.//
                intent.putExtra("datocontrasenabundle",bundle);
                intent.putExtra("datousuariobunlde",bundle);
                startActivity(intentIrRegistro);
            }
        });

        //aqui quiero que a traves del boton login pase a la pag home//
        binding.btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(MainActivity.this,Home.class);
                startActivity(loginIntent);
            }
        });




    }
}