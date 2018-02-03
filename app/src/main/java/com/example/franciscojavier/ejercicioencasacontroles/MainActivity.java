package com.example.franciscojavier.ejercicioencasacontroles;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnmasa, btntamano, btningredientes;
    Spinner spmasa;
    CheckBox cbpeperoni, cbcebolla, cbternera, cbpollo, cbchampinones, cbbacon;
    RadioGroup rgrouptamano;
    TextView txt_masa, txt_ingredientes, txt_tamano;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmasa= (Button)findViewById(R.id.btn_masa);
        btntamano= (Button)findViewById(R.id.btn_tamano);
        btningredientes=(Button)findViewById(R.id.btn_ingredientes);

        spmasa= (Spinner)findViewById(R.id.spinner);

        cbpeperoni= (CheckBox)findViewById(R.id.cb_peperoni);
        cbcebolla= (CheckBox)findViewById(R.id.cb_cebolla);
        cbchampinones= (CheckBox)findViewById(R.id.cb_champiñones);
        cbternera= (CheckBox)findViewById(R.id.cb_ternera);
        cbpollo= (CheckBox)findViewById(R.id.cb_pollo);
        cbbacon= (CheckBox)findViewById(R.id.cb_bacon);

        rgrouptamano= (RadioGroup)findViewById(R.id.rgroup_tamano);

        txt_masa= (TextView)findViewById(R.id.txt_masa_inferior);
        txt_ingredientes= (TextView)findViewById(R.id.txt_ingredientes_inferior);
        txt_tamano= (TextView)findViewById(R.id.txt_tamano_inferior);

        String[] tipos={"Elige Masa","fina","Gruesa","Bordes rellenos","Sin bordes"};

        ArrayAdapter<String> adaptador= new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,tipos);

        spmasa.setAdapter(adaptador);












































    }//FIN ON CREATE


    public void clickmasa (View view){

        String tipomasa= spmasa.getSelectedItem().toString();

        if(tipomasa.equals("Elige Masa")){

            Toast.makeText(this,"Debes selccionar una masa",Toast.LENGTH_LONG).show();



        }else{

            txt_masa.setText(tipomasa);
            btningredientes.setEnabled(true);
        }





    }


    public void clickingredientes (View view){

        String ingredientes="";

        if (cbbacon.isChecked()){

            ingredientes+="Bacon, ";
        }

        if (cbternera.isChecked()){

            ingredientes+="Ternera, ";
        }

        if (cbcebolla.isChecked()){

            ingredientes+="Cebolla, ";
        }

        if (cbchampinones.isChecked()){

            ingredientes+="Champiñones, ";
        }

        if (cbpollo.isChecked()){

            ingredientes+="Pollo, ";
        }

        if (cbpeperoni.isChecked()){

            ingredientes+="Peperoni, ";
        }

        txt_ingredientes.setText(ingredientes);


    }


    public void clicktamano (View view){

        if(txt_ingredientes.equals("")){

            Toast.makeText(this,"Debes selccionar los ingredientes",Toast.LENGTH_LONG).show();


        }else{

            btntamano.setEnabled(true);
        }


        int idradio= rgrouptamano.getCheckedRadioButtonId();

        if (idradio == -1) {
            Toast.makeText(this, "Debes selccionar un tamaño", Toast.LENGTH_LONG).show();

        }else{

            RadioButton radiopequeña= (RadioButton)findViewById(R.id.radiobt_pequeña);
            String textradiopequeña= radiopequeña.getText().toString();

            RadioButton radiomediana= (RadioButton)findViewById(R.id.radiobt_mediana);
            String textradiomediana= radiomediana.getText().toString();

            RadioButton radiogrande= (RadioButton)findViewById(R.id.radiobtn_grande);
            String taxtradiogrande= radiogrande.getText().toString();




        }















        }





















}//NO BORRAR
