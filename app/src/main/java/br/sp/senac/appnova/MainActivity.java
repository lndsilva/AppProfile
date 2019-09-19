package br.sp.senac.appnova;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnEntrar;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEntrar = findViewById(R.id.btnEntrar);

        builder = new AlertDialog.Builder(this);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                builder.setMessage(R.string.caixa_mensagem).setTitle(R.string.titulo_caixa_mensagem);

                builder.setMessage("Deseja fechar o aplicativo?")
                        .setCancelable(false)
                        .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                                Toast.makeText(getApplicationContext(), "Você escolheu sim!!!", Toast.LENGTH_SHORT).show();

                            }
                        })
                        .setNegativeButton("Não", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                                Toast.makeText(getApplicationContext(), "Você escolheu não!!!", Toast.LENGTH_SHORT).show();


                            }
                        });
                AlertDialog alert = builder.create();

                alert.setTitle("Exemplo de caixa de diálogo");
                alert.show();


            }
        });


    }
}
