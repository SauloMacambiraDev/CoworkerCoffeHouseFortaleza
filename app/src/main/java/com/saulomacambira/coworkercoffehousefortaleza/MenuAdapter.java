package com.saulomacambira.coworkercoffehousefortaleza;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    private final MenuItem[] menuItems;

    public MenuAdapter(MenuItem [] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public int getItemCount() {
        return menuItems.length;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_menu_item_row, parent, false);
        return new MenuViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        holder.bind(menuItems[position]);
    }

    class MenuViewHolder extends RecyclerView.ViewHolder {

        private View itemView;
        private ImageView cardViewDissertImage;
        private TextView textViewTitleDissert;
        private TextView textViewDescriptionDissert;
        private TextView textViewPriceDissert;


        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            initViews();
        }

        private void initViews() {
            cardViewDissertImage = itemView.findViewById(R.id.image_view_menu);
            textViewTitleDissert = itemView.findViewById(R.id.text_view_title_menu);
            textViewDescriptionDissert = itemView.findViewById(R.id.text_view_description_menu);
            textViewPriceDissert = itemView.findViewById(R.id.text_view_price_menu);
        }

        public void bind(MenuItem menuItem) {
            cardViewDissertImage.setImageResource(menuItem.getImageResourceId());
            textViewTitleDissert.setText(menuItem.getTitle());
            textViewDescriptionDissert.setText(menuItem.getDescription());
            textViewPriceDissert.setText("R$ " + String.valueOf(menuItem.getPrice()));
        }
    }
}
