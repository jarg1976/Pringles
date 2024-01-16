package jarg.com.pringles;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import jarg.com.pringles.models.User;

public class MainActivity extends AppCompatActivity {
  EditText editTextEmail;
  EditText editTextPassword;
  User user;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    editTextEmail = findViewById(R.id.edit_text_emaill);
    editTextPassword = findViewById(R.id.edit_text_password);

    this.user = new User("jarg@gmail.com", "jarg", 200.00);
  }

  public void gotoToMachine(View view) {

    String tempEmail = this.editTextEmail.getText().toString();
    String tempPassword = this.editTextPassword.getText().toString();

    if(this.user.validateData(tempEmail, tempPassword)) {
      // Quando a imagem é clicada, cria-se uma intenção para iniciar a DetalhesActivity
      Intent intent = new Intent(this, MachineDashboardActivity.class);
      // Adicione dados extras à intenção, se necessário (por exemplo, para passar informações sobre a imagem)
      // intent.putExtra("chave", valor);
      // Inicie a nova Activity
      intent.putExtra("user", this.user);
      startActivity(intent);
    } else {
      Toast.makeText(getApplicationContext(), "Erro nas credênciais", Toast.LENGTH_SHORT).show();
    }

  }
}