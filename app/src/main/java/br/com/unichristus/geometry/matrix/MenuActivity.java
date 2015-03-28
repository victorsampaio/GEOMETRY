package br.com.unichristus.geometry.matrix;

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
import br.com.unichristus.geometry.matrix.adicao.AdicaoVetorialActivity;

public class MenuActivity extends ActionBarActivity {

    Button btStartAdicao, btStartSubtracao, btStartEscalar, btStartProdVetorial, btModVetor, lmgtfy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        // ADICAO
        btStartAdicao = (Button)findViewById(R.id.btnStartAdicao);
        btStartAdicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itAdicao = new Intent(getApplicationContext(), AdicaoVetorialActivity.class);
                startActivity(itAdicao);
            }
        });

        // SUBTRACAO
        btStartSubtracao = (Button)findViewById(R.id.btnStartSubtracao);
        btStartSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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
