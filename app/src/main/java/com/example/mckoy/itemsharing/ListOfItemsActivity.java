package com.example.mckoy.itemsharing;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ListOfItemsActivity extends AppCompatActivity {

    //private TextView mWelcomeMessage;
    private Button mButton;
    private EditText mEditText;
    private CardView cardView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_items);
        //mWelcomeMessage = (TextView) findViewById(R.id.welcome);
        Toast.makeText(ListOfItemsActivity.this, "Login is successful",
                Toast.LENGTH_SHORT).show();
        mButton = (Button) findViewById(R.id.button_id);

        Log.i("aa", "Welcome home");
        //mWelcomeMessage.setText("Welcome to the homepage!");


        mButton.setOnClickListener(buttonClickListener);

        FragmentManager fm = getSupportFragmentManager();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        MenuItem item = menu.findItem(R.id.app_bar_search);
        SearchView searchView = (SearchView) item.getActionView();
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menu) {

        View view = LayoutInflater.from(this).inflate(R.layout.edit_text, null);
        final EditText commentEditText = (EditText) view.findViewById(R.id.text_input);


        return super.onOptionsItemSelected(menu);
    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent i = new Intent(ListOfItemsActivity.this, PostItemActivity.class);
            startActivity(i);
        }
    };


}
