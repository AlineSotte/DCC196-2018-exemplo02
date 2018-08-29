package br.ufjf.dcc196.exemplo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String Pessoa_Nome="nome";
    private Button btnProfessor;
    private EditText edNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNome=findViewById(R.id.edt_nome);

        btnProfessor=findViewById(R.id.btn_professor);
        btnProfessor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ProfessorActivity.class);
                intent.putExtra(Pessoa_Nome,edNome.getText().toString());
                startActivity(intent);
            }
        });
    }
}
