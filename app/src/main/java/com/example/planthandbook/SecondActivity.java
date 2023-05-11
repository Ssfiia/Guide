package com.example.planthandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class SecondActivity extends AppCompatActivity {

    List<Plant> plants = new ArrayList<Plant>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list_plant);

        PlantAdapter adapter = new PlantAdapter(this, plants);

        recyclerView.setAdapter(adapter);

    }

    private void setInitialData() {

        plants.add(new Plant("Папоротник","Папоротник — многолетнее травянистое растение из семейства настоящих папоротников", R.drawable.fern, "Количество: более 10 тыс. видов."));
        plants.add(new Plant("Мох", "Мхи - это высшие споровые растения.",R.drawable.moss, "Количество: 300 видов."));
        plants.add(new Plant("Берёза", "Род листопадных деревьев и кустарников семейства Берёзовые.",R.drawable.birch, "Количество: 150 видов."));
        plants.add(new Plant("Ель", "Род хвойных вечнозелёных деревьев семейства Сосновые.",R.drawable.fir, "Количество: 50 видов."));
        plants.add(new Plant("Сосна","Сосны-вечнозеленые, хвойные смолистые деревья высотой 3-80 м.",R.drawable.pine_tree, "Количестао: 130 видов."));
        plants.add(new Plant("Подорожник", "Род растений семейства подорожниковых. Многолетние или однолетние травы.",R.drawable.plantain, "Количество: 150 видов."));
        plants.add(new Plant("Одуванчик", "Род многолетних травянистых растений семейства Астровые, или Сложноцветные.",R.drawable.dandelion, "Количество: около 2 тыс. видов. "));
        plants.add(new Plant("Липа", "Дерево липа относится к лиственным деревьям, крона широкая, зачастую имеет овальную форму, высота превышает 28 метров.",R.drawable.linden_tree, "Количество: 45 видов."));
        plants.add(new Plant("Яблоня", "Род листопадных деревьев и кустарников семейства Розовые с шаровидными сладкими или кисло-сладкими плодами.",R.drawable.apple_tree,"Количество: около 7500 видов."));
        plants.add(new Plant("Дуб", "Род деревьев и кустарников семейства Буковые.", R.drawable.oak, "Количество: 600 видов."));

    }
}