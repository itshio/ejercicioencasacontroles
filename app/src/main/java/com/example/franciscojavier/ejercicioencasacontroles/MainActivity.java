package com.example.franciscojavier.ejercicioencasacontroles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

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
        txt_ingredientes= (TextView)findViewById(R.id.txt_ingredientes);
        txt_tamano= (TextView)findViewById(R.id.txt_tamano_inferior);

        String[] tipos={"Elige Masa","fina","Gruesa","Bordes rellenos","Sin bordes"};

        ArrayAdapter<String> adaptador= new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,tipos);

        spmasa.setAdapter(adaptador);












































    }//FIN ON CREATE


    public void clickmasa (View view){

        String tipomasa= spmasa.getSelectedItem().toString();

        if(tipomasa.equals("Elige Masa")){
            



        }






    }





















}//NO BORRAR
