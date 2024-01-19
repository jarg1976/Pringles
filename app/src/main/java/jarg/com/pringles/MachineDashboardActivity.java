package jarg.com.pringles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import jarg.com.pringles.models.User;

public class MachineDashboardActivity extends AppCompatActivity {

  private User user;
  TextView textViewBalanceValue;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_machine_dashboard);

    this.user = (User) getIntent().getSerializableExtra("user");

    this.textViewBalanceValue = findViewById(R.id.textView_balance_value);

    this.textViewBalanceValue.setText(String.valueOf(this.user.getBalance()));


  }
}