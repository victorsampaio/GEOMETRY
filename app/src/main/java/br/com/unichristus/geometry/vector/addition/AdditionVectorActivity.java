package br.com.unichristus.geometry.vector.addition;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.com.unichristus.geometry.R;

public class AdditionVectorActivity extends ActionBarActivity {

    private static final String CATEGORY = "subtraction_vectorial";

    EditText vectorA1, vectorA2;
    EditText vectorB1, vectorB2;
    int v[];
    int w[];
    int a, b, c, d;

    Button btAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_vector);

        btAdd = (Button)findViewById(R.id.btnAddVet);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vectorA1 = (EditText)findViewById(R.id.edtVetA1);
                vectorA2 = (EditText)findViewById(R.id.edtVetAv2);

                vectorB1 = (EditText)findViewById(R.id.edtVetB1);
                vectorB2 = (EditText)findViewById(R.id.edtVetBv2);

                a = Integer.parseInt(vectorA1.getText().toString());
                b = Integer.parseInt(vectorA2.getText().toString());
                c = Integer.parseInt(vectorB1.getText().toString());
                d = Integer.parseInt(vectorB2.getText().toString());

                additionVectorial(a, b, c,d);
            }
        });

    }

    private void additionVectorial(int a, int b, int c, int d) {

        //int v[] = {a,b};
        //int w[] = {c, d};
        //int r[] = {a+c,b+d};

        int resu1 = a+c;
        int resu2 = b+d;

        TextView res = (TextView)findViewById(R.id.txvAdditionVet);
        res.setText("Resultado Adicao: (" + resu1 + "," + resu2+")");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_addition_vector, menu);
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
