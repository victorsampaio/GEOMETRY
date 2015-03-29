package br.com.unichristus.geometry.vector;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import br.com.unichristus.geometry.R;
import br.com.unichristus.geometry.vector.addition.AdditionVectorActivity;
import br.com.unichristus.geometry.vector.escalar.EscalarProductActivity;
import br.com.unichristus.geometry.vector.subtraction.SubtractionVectorialActivity;

public class MenuActivity extends ActionBarActivity {

    Button btStartAdd, btStartSubtracao, btStartEscalar, btStartProdVetorial, btModVetor, lmgtfy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btStartAdd = (Button)findViewById(R.id.btnStartAdd);
        btStartAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itAdd = new Intent(getApplicationContext(), AdditionVectorActivity.class);
                startActivity(itAdd);
            }
        }) ;

        // SUBTRACAO - Subtraction
        btStartSubtracao = (Button)findViewById(R.id.btnStartSubtracao);
        btStartSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itSubtraction = new Intent(getApplicationContext(), SubtractionVectorialActivity.class);
                startActivity(itSubtraction);

            }
        });


        // Google - http://lmgtfy.com/?q=Vetores
        lmgtfy = (Button)findViewById(R.id.lmgtfy);
        lmgtfy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://lmgtfy.com/?q=Vetores");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Produto Escalar
        btStartEscalar = (Button)findViewById(R.id.btnStartEscalar);
        btStartEscalar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itEscalar = new Intent(getApplicationContext(), EscalarProductActivity.class);
                startActivity(itEscalar);
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_matrix, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
