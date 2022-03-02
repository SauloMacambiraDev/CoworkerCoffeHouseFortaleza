package com.saulomacambira.coworkercoffehousefortaleza;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RoomsAdapter extends RecyclerView.Adapter<RoomsAdapter.RoomViewHolder> {

    private final Room[] rooms;

    public RoomsAdapter(Room [] rooms) {
        this.rooms = rooms;
    }

    @Override
    public int getItemCount() {
        return rooms.length;
    }

    @NonNull
    @Override
    public RoomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View roomRowView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_room_row, parent, false);
        return new RoomsAdapter.RoomViewHolder(roomRowView, parent.getContext());
    }

    @Override
    public void onBindViewHolder(@NonNull RoomViewHolder holder, int position) {
        holder.bind(this.rooms[position]);
    }




    static class RoomViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewRoomResourceId;
        private TextView textViewTitleRoom;
        private TextView textViewDescriptioRoom;
        private LinearLayout linearLayoutButtonRentRoom;
        private RatingBar ratingBarRoomRate;
        private TextView textViewTotalNumberOfRates;

        private final Context context;
        private final View itemView;

        public RoomViewHolder(@NonNull View itemView, Context context) {
            super(itemView);
            this.itemView = itemView;
            this.context = context;
            initRowViews();
        }

        private void initRowViews(){
            imageViewRoomResourceId = itemView.findViewById(R.id.image_view_room);
            textViewTitleRoom = itemView.findViewById(R.id.text_view_title_room);
            textViewDescriptioRoom = itemView.findViewById(R.id.text_view_description_room);
            linearLayoutButtonRentRoom = itemView.findViewById(R.id.linear_layout_button_rent_room);
            ratingBarRoomRate = itemView.findViewById(R.id.rating_bar_room_rate);
            textViewTotalNumberOfRates = itemView.findViewById(R.id.text_view_total_number_rates);
        }

        private void bind(Room room){
            imageViewRoomResourceId.setImageResource(room.getImageResourceId());
            textViewTitleRoom.setText(room.getTitle());
            textViewDescriptioRoom.setText(room.getDescription());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent  = new Intent(context, RoomDetailsActivity.class);
                    intent.putExtra("roomId", room.getId());
                    context.startActivity(intent);
                }
            });
            ratingBarRoomRate.setRating(room.getRating());
            textViewTotalNumberOfRates.setText(room.getTotalNumberOfRates() + " avaliações de clientes");

        }
    }
}
