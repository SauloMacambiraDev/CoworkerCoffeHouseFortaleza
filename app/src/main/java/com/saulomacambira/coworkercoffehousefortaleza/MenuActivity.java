package com.saulomacambira.coworkercoffehousefortaleza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MenuActivity extends AppCompatActivity {
    private RecyclerView recyclerViewDissertsList;
    private RecyclerView recyclerViewCoffesList;
    private final MenuItem[] menuDissertItems = {
            new MenuItem(1, "Devil's Cake", "Fatia - Massa de chocolate e camadas de ganache chocolate meio amargo.", 19.90, R.drawable.dissert_img),
            new MenuItem(2, "Chocolate Block", "Fatia - Bolo de chocolate com cobertura de brigadeiro e flakes belga.", 19.90, R.drawable.dissert_img),
            new MenuItem(3, "Coco Cake", "Fatia - Bolo de coco com cobertura de beijinho.", 19.90, R.drawable.dissert_img),
    };

    private final MenuItem[] menuCoffeItems = {
            new MenuItem(1, "Hot Coffe", "Café especial da serra do espírito santo.", 19.90, R.drawable.coffe_img_item),
            new MenuItem(2, "Cappuccinos", "Cappuccino quentinho e cremoso no conforto de sua casa.", 8.50, R.drawable.coffe_img_item),
            new MenuItem(3, "Moccaccinos", "Cappuccino quentinho e cremoso no conforto de sua casa.", 13.90, R.drawable.coffe_img_item),
            new MenuItem(3, "Affogatos", "Deliciosa combinação do gelado com o qente para adoçar seus momentos.", 23.90, R.drawable.coffe_img_item),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initViews();
        fillUpLists();
    }

    private void initViews(){
        recyclerViewDissertsList = findViewById(R.id.recyler_view_list_disserts);
        recyclerViewCoffesList = findViewById(R.id.recyler_view_list_coffes);
    }

    private void fillUpLists(){
        MenuAdapter menuDissertsAdapter = new MenuAdapter(menuDissertItems);
        recyclerViewDissertsList.setAdapter(menuDissertsAdapter);

        MenuAdapter menuCoffesAdapter = new MenuAdapter(menuCoffeItems);
        recyclerViewCoffesList.setAdapter(menuCoffesAdapter);

    }
}