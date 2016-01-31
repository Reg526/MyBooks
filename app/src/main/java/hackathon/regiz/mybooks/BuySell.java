package hackathon.regiz.mybooks;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class BuySell extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_sell);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void buttonOnClick(View v){
        switch(v.getId()){
            case R.id.buy_button:
                startActivity(new Intent(BuySell.this, BuyHomepage.class));
                break;
            case R.id.sell_button:
                startActivity(new Intent(BuySell.this, SellForm.class));
                break;
        }
    }

}
