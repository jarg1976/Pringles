package jarg.com.pringles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import jarg.com.pringles.models.User;

public class MachineDashboardActivity extends AppCompatActivity {

  private User;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_machine_dashboard);

    this.user = (User) getIntent().getSerializableExtra("user");

  }
}