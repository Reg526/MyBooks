package hackathon.regiz.mybooks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    //AutoCompleteTextView loginEmail = (AutoCompleteTextView) findViewById(R.id.loginEmail);
   // EditText loginPass = (EditText) findViewById(R.id.loginPass);
    TextView forgotPassBtn, createAccBtn;
    Button loginBtn;

    public void buttonOnClick(View v){
        switch(v.getId()){
            case R.id.loginBtn:
                //TODO Add function to main page login button
                break;
            case R.id.createAccBtn:
                startActivity(new Intent(LoginActivity.this, CreateAccount.class));
                break;
            case R.id.forgotPassBtn:
                startActivity(new Intent(LoginActivity.this, ForgotPassword.class));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
