package br.ufjf.dcc196.exemplo2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String Pessoa_Nome="nome";
    private static int Request_SIAP=1;
    public static String PROF_SIAPE="siape";
    private Button btnProfessor;
    private EditText edNome;
    private TextView txtMensagem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMensagem=(TextView) findViewById(R.id.txt_prof_mensagem);
        edNome=(EditText) findViewById(R.id.edt_nome);

        btnProfessor=findViewById(R.id.btn_professor);
        btnProfessor.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ProfessorActivity.class);
                intent.putExtra(Pessoa_Nome,edNome.getText().toString());
                startActivityForResult(intent, MainActivity.Request_SIAP);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==MainActivity.Request_SIAP && resultCode== Activity.RESULT_OK && data!= null){

        Bundle bundleResultado=data.getExtras();
        String siape=bundleResultado.getString(MainActivity.PROF_SIAPE);
        txtMensagem.setText("Olá Professor de Siape"+ siape);
    }}
}
