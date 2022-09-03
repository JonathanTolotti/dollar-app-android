package com.example.dollarapp.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dollarapp.R;

public class LoginActivity extends AppCompatActivity {
    private String userPhoneValue;
    private String userPassValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    /**
     * Gerencia a parte de login do aplicativo
     */
    public void handlerLogin(View view) {
        createCredentialsLogin();

        doLogin();
    }

    /**
     * Busca as informações digitadas e monta as variáveis usadas pelo login
     */
    private void createCredentialsLogin() {
        EditText userPhone = findViewById(R.id.LoginUserPhone);
        EditText userPass = findViewById(R.id.LoginUserPass);

        userPhoneValue = userPhone.getText().toString();
        userPassValue = userPass.getText().toString();
    }

    /**
     * Valida se as credenciais estão corretas e trata o retorno
     */
    private void doLogin() {
        if (userPhoneValue.equals("51996766591") && userPassValue.equals("1234")) {
            Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Usuário e/ou senha inválido(s)", Toast.LENGTH_SHORT).show();
        }
    }

}