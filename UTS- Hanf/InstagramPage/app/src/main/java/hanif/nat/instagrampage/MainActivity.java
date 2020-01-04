package hanif.nat.instagrampage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvIg;
    private ArrayList<Ig> list = new ArrayList<>();

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.profil, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.item_about){
            startActivity(new Intent(this, Aboutme.class));
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvIg = findViewById(R.id.rv_ig);
        rvIg.setHasFixedSize(true);

        list.addAll(IgData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvIg.setLayoutManager(new LinearLayoutManager(this));
        CardIgAdapter cardIgAdapter = new CardIgAdapter(this, list);
        rvIg.setAdapter(cardIgAdapter);
    }
}
