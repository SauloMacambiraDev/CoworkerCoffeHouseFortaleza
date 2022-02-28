package com.saulomacambira.coworkercoffehousefortaleza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RoomsActivity extends AppCompatActivity {
    RecyclerView recyclerViewListRooms;
    private Room[] rooms = {
        new Room(1, "Coffe Dev Room", "Suspendisse ultrices at diam lectus nullam. Nisl, sagittis viverra enim erat tortor ultricies massa turpis. Arcu pulvinar aenean nam laoreet nulla.", R.drawable.room_img, 49.99, 8),
        new Room(2, "Business Room", "Suspendisse ultrices at diam lectus nullam. Nisl, sagittis viverra enim erat tortor ultricies massa turpis. Arcu pulvinar aenean nam laoreet nulla.", R.drawable.business_room, 89.99, 8),
        new Room(3, "Brainstorm Room", "Suspendisse ultrices at diam lectus nullam. Nisl, sagittis viverra enim erat tortor ultricies massa turpis. Arcu pulvinar aenean nam laoreet nulla.", R.drawable.brainstorm_room, 110.00, 8),
        new Room(4, "Dynamic Stakeholders Room", "Suspendisse ultrices at diam lectus nullam. Nisl, sagittis viverra enim erat tortor ultricies massa turpis. Arcu pulvinar aenean nam laoreet nulla.", R.drawable.dynamic_room, 49.99, 8),
        new Room(5, "UX UI Design Room", "Suspendisse ultrices at diam lectus nullam. Nisl, sagittis viverra enim erat tortor ultricies massa turpis. Arcu pulvinar aenean nam laoreet nulla.", R.drawable.ux_ui_room, 59.99, 8)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rooms);
        initViews();
        initializeRoomList();
    }
    private void initViews(){
        recyclerViewListRooms = findViewById(R.id.recycler_view_list_rooms);
    }

    private void initializeRoomList(){
        RoomsAdapter adapter = new RoomsAdapter(rooms);
        recyclerViewListRooms.setAdapter(adapter);
    }
}