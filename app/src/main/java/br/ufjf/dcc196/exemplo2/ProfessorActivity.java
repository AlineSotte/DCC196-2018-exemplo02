package br.ufjf.dcc196.exemplo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ProfessorActivity extends AppCompatActivity {

        private TextView txtProfMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor);
        txtProfMensagem=findViewById(R.id.txt_prof_mensagem);
        Bundle extras=getIntent().getExtras();

        if(extras!=null) {
            String nome = extras.getString(MainActivity.Pessoa_Nome);
            txtProfMensagem.setText("Olá Prof." + nome + "!");
        }

        Toast.makeText(getApplicationContext(),"prof onCreate()", Toast.LENGTH_SHORT).show();

        @Override
        protected void onStart(){
            super.onStart();
            Toast.makeText(getApplicationContext(),"prof onCreate()", Toast.LENGTH_SHORT).show();

        }

        @Override
        protected void onResume(){

            super.onResume();
            Toast.makeText(getApplicationContext(),"prof onCreate()", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onStop(){
            super.onStop();
            Toast.makeText(getApplicationContext(),"prof onCreate()", Toast.LENGTH_SHORT).show(); }
        }

    }
}
