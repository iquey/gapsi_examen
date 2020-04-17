package mx.iquey.examen_gapsi.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import java.util.ArrayList;
import java.util.List;

import mx.iquey.examen_gapsi.R;
import mx.iquey.examen_gapsi.beans.Record;

public class ProductosAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int ITEM = 0;
    private static final int LOADING = 1;

    private List<Record> productosList;
    private Context context;

    private boolean isLoadingAdded = false;

    public ProductosAdapter(Context context) {
        this.context = context;
        productosList = new ArrayList<>();
    }

    public List<Record> getProducts() {
        return productosList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        switch (viewType) {
            case ITEM:
                viewHolder = getViewHolder(parent, inflater);
                break;
            case LOADING:
                View v2 = inflater.inflate(R.layout.item_progress, parent, false);
                viewHolder = new LoadingVH(v2);
                break;
        }
        return viewHolder;
    }

    @NonNull
    private RecyclerView.ViewHolder getViewHolder(ViewGroup parent, LayoutInflater inflater) {
        RecyclerView.ViewHolder viewHolder;
        View v1 = inflater.inflate(R.layout.item_list, parent, false);
        viewHolder = new ProductVH(v1);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        Record result = productosList.get(position);

        switch (getItemViewType(position)) {
            case ITEM:
                final ProductVH productVH = (ProductVH) holder;

                productVH.mProductTitle.setText(result.getProductDisplayName());


                productVH.mPrecio.setText("$" +
                        String.valueOf(result.getListPrice()));
                productVH.mProductId.setText(result.getProductId());

                /**
                 * Using Glide to handle image loading.
                 * Learn more about Glide here:
                 * <a href="http://blog.grafixartist.com/image-gallery-app-android-studio-1-4-glide/" />
                 */
                Glide
                        .with(context)
                        .load(result.getLgImage())
                        .listener(new RequestListener<Drawable>() {
                            @Override
                            public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                productVH.mProgress.setVisibility(View.GONE);
                                return false;
                            }

                            @Override
                            public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                productVH.mProgress.setVisibility(View.GONE);
                                return false;
                            }
                        })
                        .diskCacheStrategy(DiskCacheStrategy.ALL)   // cache both original & resized image
                        .centerCrop()
                        .into(productVH.mProductImg);

                break;

            case LOADING:
//                Do nothing
                break;
        }

    }

    @Override
    public int getItemCount() {
        return productosList == null ? 0 : productosList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return (position == productosList.size() - 1 && isLoadingAdded) ? LOADING : ITEM;
    }


    /*
   Helpers
   _________________________________________________________________________________________________
    */

    public void add(Record r) {
        productosList.add(r);
        notifyItemInserted(productosList.size() - 1);
    }

    public void addAll(List<Record> moveResults) {
        for (Record result : moveResults) {
            add(result);
        }
    }

    public void remove(Record r) {
        int position = productosList.indexOf(r);
        if (position > -1) {
            productosList.remove(position);
            notifyItemRemoved(position);
        }
    }

    public void clear() {
        isLoadingAdded = false;
        while (getItemCount() > 0) {
            remove(getItem(0));
        }
    }

    public boolean isEmpty() {
        return getItemCount() == 0;
    }


    public void addLoadingFooter() {
        isLoadingAdded = true;
        add(new Record());
    }

    public void removeLoadingFooter() {
        isLoadingAdded = false;

        int position = productosList.size() - 1;
        Record result = getItem(position);

        if (result != null) {
            productosList.remove(position);
            notifyItemRemoved(position);
        }
    }

    public Record getItem(int position) {
        return productosList.get(position);
    }


   /*
   View Holders
   _________________________________________________________________________________________________
    */

    /**
     * Main list's content ViewHolder
     */
    protected class ProductVH extends RecyclerView.ViewHolder {
        private TextView mProductTitle;
        private TextView mProductId;
        private TextView mPrecio; // displays "year | language"
        private ImageView mProductImg;
        private ProgressBar mProgress;

        public ProductVH(View itemView) {
            super(itemView);

            mProductTitle = itemView.findViewById(R.id.product_title);
            mProductId = itemView.findViewById(R.id.product_id);
            mPrecio =  itemView.findViewById(R.id.product_price);
            mProductImg =  itemView.findViewById(R.id.product_img);
            mProgress = itemView.findViewById(R.id.progress);
        }
    }


    protected class LoadingVH extends RecyclerView.ViewHolder {

        public LoadingVH(View itemView) {
            super(itemView);
        }
    }


}