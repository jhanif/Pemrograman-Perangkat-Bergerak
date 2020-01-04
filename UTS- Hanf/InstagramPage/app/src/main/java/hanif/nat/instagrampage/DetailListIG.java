package hanif.nat.instagrampage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListIG extends AppCompatActivity {
    private int ig_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<Ig> listIg = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_ig);

        ig_id = getIntent().getIntExtra("ig_id", 0);
        tvName = findViewById(R.id.nama_ig);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listIg.addAll(IgData.getListData());

        setLayout();
    }

    private void setLayout() {
        tvName.setText(listIg.get(ig_id).getName());
        tvDesc.setText(listIg.get(ig_id).getDescription());
        Glide.with(this)
                .load(listIg.get(ig_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }
}
