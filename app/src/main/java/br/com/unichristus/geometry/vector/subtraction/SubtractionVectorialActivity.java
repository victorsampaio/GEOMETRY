package br.com.unichristus.geometry.vector.subtraction;

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

public class SubtractionVectorialActivity extends ActionBarActivity {

    private static final String CATEGORY = "subtraction_vectorial";

    EditText vectorA1, vectorA2;
    EditText vectorB1, vectorB2;
    int v[];
    int w[];
    int a, b, c, d;

    Button btSubtractionVector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtraction_vectorial);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();



        btSubtractionVector = (Button)findViewById(R.id.btnSubtractionVectorial);
        btSubtractionVector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vectorA1 = (EditText)findViewById(R.id.edtVetorAv1);
                vectorA2 = (EditText)findViewById(R.id.edtVetorAv2);

                vectorB1 = (EditText)findViewById(R.id.edtVetorBv1);
                vectorB2 = (EditText)findViewById(R.id.edtVetorBv2);

                a = Integer.parseInt(vectorA1.getText().toString());
                b = Integer.parseInt(vectorA2.getText().toString());
                c = Integer.parseInt(vectorB1.getText().toString());
                d = Integer.parseInt(vectorB2.getText().toString());

                subtractionVectorial();

            }
        });

    }

    private void subtractionVectorial() {

        int v[] = {a,b};
        int w[] = {c, d};
        int r[] = {a-c , b-d};

        String soma;
        soma = r.toString();
        TextView res = (TextView)findViewById(R.id.txvResultSubtraction);
        res.setText("Resultado Subtração: (" + r[0] + "," + r[1]+")");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_subtraction_vectorial, menu);
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
