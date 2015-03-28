package br.com.unichristus.geometry.vector.addition;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.com.unichristus.geometry.R;

public class AdicaoVetorialActivity extends ActionBarActivity {

    private static final String CATEGORY = "adicao vetores";

    EditText vectorA1, vectorA2;
    EditText vectorB1, vectorB2;
    int v[];
    int w[];
    int a, b, c, d;

    Button btAdicaoVetor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicao_vetorial);
        //ActionBar actionBar = getSupportActionBar();
        //actionBar.hide();

        Button btAdicaoVetor;
        btAdicaoVetor = (Button)findViewById(R.id.btnAddition);
        btAdicaoVetor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vectorA1 = (EditText)findViewById(R.id.edtVetorA1);
                vectorA2 = (EditText)findViewById(R.id.edtVetorA2);
                vectorB1 = (EditText)findViewById(R.id.edtVetorB1);
                vectorB2 = (EditText)findViewById(R.id.edtVetorB2);

                a = Integer.parseInt(vectorA1.getText().toString());
                b = Integer.parseInt(vectorA2.getText().toString());
                c = Integer.parseInt(vectorB1.getText().toString());
                d = Integer.parseInt(vectorB2.getText().toString());

                adicaoVetorial(a, b, c, d);
            }
        });
    }

    private  void adicaoVetorial(int a, int b, int c, int d) {

       int v[] = {a,b};
       int w[] = {c, d};
       int r[] = {a+c , b+d};

        String soma;
        soma = r.toString();
        TextView res = (TextView)findViewById(R.id.txvResultSoma);
        res.setText("Resultado Soma: (" + r[0] + "," + r[1]+")");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_adicao_vetorial, menu);
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
