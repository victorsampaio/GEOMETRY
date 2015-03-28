package br.com.unichristus.geometry.vector.escalar;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.com.unichristus.geometry.R;

public class EscalarProductActivity extends ActionBarActivity {

    private static final String CATEGORY = "escalar";

    EditText vectorA1, vectorA2;
    EditText vectorB1, vectorB2;
    int v[];
    int w[];
    int a, b, c, d;

    Button btEscalar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escalar_product);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btEscalar = (Button)findViewById(R.id.btnEscalar);
        btEscalar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vectorA1 = (EditText)findViewById(R.id.edtVetorAe1);
                vectorA2 = (EditText)findViewById(R.id.edtVetorAe2);

                vectorB1 = (EditText)findViewById(R.id.edtVetorBe1);
                vectorB2 = (EditText)findViewById(R.id.edtVetorBe2);

                a = Integer.parseInt(vectorA1.getText().toString());
                b = Integer.parseInt(vectorA2.getText().toString());
                c = Integer.parseInt(vectorB1.getText().toString());
                d = Integer.parseInt(vectorB2.getText().toString());

                escalar(a, b, c, d);

            }
        });

    }

    private void escalar(int a, int b, int c, int d) {

        int v[] = {a,b};
        int w[] = {c, d};
        int r[] = {(a*c) + (b*d)};

        String soma;
        soma = r.toString();
        TextView res = (TextView)findViewById(R.id.txvEscalar);
        res.setText("Resultado Escalar: " + r[0]);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_escalar_product, menu);
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
