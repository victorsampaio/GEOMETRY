package br.com.unichristus.geometry.matrix.adicao;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Vector;

import br.com.unichristus.geometry.R;

public class AdicaoVetorialActivity extends ActionBarActivity {

    int vetorA[], vetorB[], vetorSoma[];

    int vet1val1, vet1val2, vet1val3;
    int vet2val1, vet2val2, vet2val3;

    TextView txvSoma;
    EditText edVet1val1, edVet1val2, edVet1val3;
    EditText edVet2val1, edVet2val2,edVet2val3;
    Button btAdicaoVetor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicao_vetorial);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btAdicaoVetor= (Button)findViewById(R.id.btnAdicaoDeVetores);
        btAdicaoVetor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adicaoVetorial();
            }
        });

    }

    private void adicaoVetorial() {
        // vetor 1
        edVet1val1 = (EditText)findViewById(R.id.edtVetor1Val1);
        edVet1val2 = (EditText)findViewById(R.id.edtVetor1Val2);
        edVet1val3 = (EditText)findViewById(R.id.edtVetor1Val3);

        // Vetor 2
        edVet2val1 = (EditText)findViewById(R.id.edtVetor2Val1);
        edVet2val2 = (EditText)findViewById(R.id.edtVetor2Val1);
        edVet2val3 = (EditText)findViewById(R.id.edtVetor2Val3);

        // Parse Vetor 1
        vet1val1 = Integer.parseInt(edVet1val1.getText().toString());
        vet1val2 = Integer.parseInt(edVet1val2.getText().toString());
        vet1val3 = Integer.parseInt(edVet1val3.getText().toString());

        // Parse Vetor 2
        vet2val1 = Integer.parseInt(edVet2val1.getText().toString());
        vet2val2 = Integer.parseInt(edVet2val2.getText().toString());
        vet2val3 = Integer.parseInt(edVet2val3.getText().toString());

       //vetorA = new int[3];
       //vetorB = new int[3];
        //vetorA = [vet1val1, vet1val2, vet1val3];
        // vetorA[] = {vet1val1, vet1val2, vet1val3};       // = new {0,1,2,3,4,5,6,7,8,9};
        // vetorB[3] = new int[];

        Vector<Integer> vectorA = new Vector<Integer>(3);
        vectorA.add(0, vet1val1);
        vectorA.add(1, vet1val2);
        vectorA.add(2, vet1val3);

        Vector<Integer> vectorB = new Vector<Integer>(3);
        vectorA.add(0, vet2val1);
        vectorA.add(1, vet2val2);
        vectorA.add(2, vet2val3);

        Vector<Integer> vectorC = new Vector<Integer>(3);

        vetorSoma = new int[3];

        /*
        for(int i = 0 ; i < 3 ; i++)
        {
            vetorSoma[i] = vetorA[i] + vetorA[i];
        }
        */

        txvSoma = (TextView)findViewById(R.id.txvResultSoma);
        txvSoma.setText("Resultado da Soma: " + vetorSoma[1]);
        /*
        for(i = 0; i < 4 ; i++)
        {
            System.out.print(Integer.toString(somar[... + "\n"));
        }
        */
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
