package hanif.nat.instagrampage;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CardIgAdapter extends RecyclerView.Adapter<CardIgAdapter.ListViewHolder> {
    private ArrayList<Ig> listIg;
    private Context context;

    public CardIgAdapter(Context context, ArrayList<Ig> listWisata) {
        this.listIg = listWisata;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_ig, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Ig ig = listIg.get(position);
        Glide.with(holder.itemView.getContext())
                .load(ig.getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgPhoto);
        holder.tvName.setText(ig.getName());
        holder.tvDesc.setText(ig.getDescription());


        holder.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailListIG.class);
                intent.putExtra("ig_id", ig.getId());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public  int getItemCount () { return listIg.size(); }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_ig_list);
            tvName = itemView.findViewById(R.id.nama_ig_list);
            tvDesc = itemView.findViewById(R.id.desc_ig_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }


}
