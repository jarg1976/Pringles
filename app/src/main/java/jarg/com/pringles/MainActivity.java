package jarg.com.pringles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void gotoToMachine(View view) {
    // Quando a imagem é clicada, cria-se uma intenção para iniciar a DetalhesActivity
    Intent intent = new Intent(this, MachineDashboardActivity.class);
    // Adicione dados extras à intenção, se necessário (por exemplo, para passar informações sobre a imagem)
    // intent.putExtra("chave", valor);
    // Inicie a nova Activity
    startActivity(intent);
  }
}