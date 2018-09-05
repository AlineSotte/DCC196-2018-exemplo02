package br.ufjf.dcc196.exemplo2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ProfessorActivity extends AppCompatActivity {

        private TextView txtProfMensagem;
        private Button  btnProfConfirma;
        private EditText edtSiape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor);
        txtProfMensagem = findViewById(R.id.txt_prof_mensagem);
        Bundle extras = getIntent().getExtras();



        if (extras != null) {
            String nome = extras.getString(MainActivity.Pessoa_Nome);
            txtProfMensagem.setText("Olá Prof." + nome + "!");
            }

            btnProfConfirma.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent resutado=new Intent();
                    resutado.putExtra(MainActivity.PROF_SIAPE, edtSiape.getText().toString());
                    setResult(Activity.RESULT_OK,resutado);
                    finish();
                }
            });

        Toast.makeText(getApplicationContext(), "prof onCreate()", Toast.LENGTH_SHORT).show();

    }

        @Override
        protected void onStart(){
            super.onStart();
            Toast.makeText(getApplicationContext(),"prof onStart()", Toast.LENGTH_SHORT).show();

        }

        @Override
        protected void onResume(){

            super.onResume();
            Toast.makeText(getApplicationContext(),"prof onResume()", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onStop(){
            super.onStop();
            Toast.makeText(getApplicationContext(),"prof onStop()", Toast.LENGTH_SHORT).show(); }




}

