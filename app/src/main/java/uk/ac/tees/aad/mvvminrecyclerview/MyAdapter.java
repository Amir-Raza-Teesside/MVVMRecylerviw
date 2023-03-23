package uk.ac.tees.aad.mvvminrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uk.ac.tees.aad.mvvminrecyclerview.databinding.SingleRowBinding;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.viewholder> {

    List<Hj> datalist;

    public MyAdapter(List<Hj> datalist) {
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        SingleRowBinding binding = SingleRowBinding.inflate(inflater,null);

        return new viewholder(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        Hj hj = datalist.get(position);
        holder.rowBinding.setData(hj);

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class viewholder  extends RecyclerView.ViewHolder{
        SingleRowBinding rowBinding;
        public viewholder(@NonNull SingleRowBinding singleRowBinding) {
            super(singleRowBinding.getRoot());
            this.rowBinding = singleRowBinding;
        }
    }
}
