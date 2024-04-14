package com.example.tuan11_recycleview_indicator_search;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcIcon;
    ArrayList<IconModel> arrayList1;
    IconAdapter iconAdapter;
//    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

//        rcIcon = findViewById(R.id.rcIcon);
//        arrayList1 = new ArrayList<>();
//        arrayList1.add(new IconModel(R.drawable.icon1, "jfdjfdjf djfdh"));
//        arrayList1.add(new IconModel(R.drawable.icon1, "sdfdf sfdsf"));
//        arrayList1.add(new IconModel(R.drawable.icon1, "sdfdf sfds"));
//        arrayList1.add(new IconModel(R.drawable.icon1, "dfgfhyh sxdff"));
//        arrayList1.add(new IconModel(R.drawable.icon1, "jfdjfdjf djfdh"));
//        arrayList1.add(new IconModel(R.drawable.icon1, "sdfdf sfdsf"));
//        arrayList1.add(new IconModel(R.drawable.icon1, "sdfdf sfds"));
//        arrayList1.add(new IconModel(R.drawable.icon1, "dfgfhyh sxdff"));
//        arrayList1.add(new IconModel(R.drawable.icon1, "dfgfhyh sxdff"));
//        arrayList1.add(new IconModel(R.drawable.icon1, "jfdjfdjf djfdh"));
//        arrayList1.add(new IconModel(R.drawable.icon1, "sdfdf sfdsf"));
//        arrayList1.add(new IconModel(R.drawable.icon1, "sdfdf sfds"));
//        arrayList1.add(new IconModel(R.drawable.icon1, "dfgfhyh sxdff"));
//        arrayList1.add(new IconModel(R.drawable.icon1, "jfdjfdjf djfdh"));
//        arrayList1.add(new IconModel(R.drawable.icon1, "sdfdf sfdsf"));
//        arrayList1.add(new IconModel(R.drawable.icon1, "sdfdf sfds"));
//        arrayList1.add(new IconModel(R.drawable.icon1, "dfgfhyh sxdff"));
//        arrayList1.add(new IconModel(R.drawable.icon1, "dfgfhyh sxdff"));
//
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 2, GridLayoutManager.HORIZONTAL, false);
//        rcIcon.setLayoutManager(gridLayoutManager);
//        iconAdapter = new IconAdapter(getApplicationContext(), arrayList1);
//        rcIcon.setAdapter(iconAdapter);
////        //rcIcon.addItemDecoration(new LinePagerIndicatorDecoration());
////
////
        SearchView searchView = findViewById(R.id.searchView);
        if (searchView != null) {
            // Nếu searchView tồn tại, làm gì đó ở đây
            searchView.clearFocus();
            rcIcon = findViewById(R.id.rcIcon);
            arrayList1 = new ArrayList<>();
            arrayList1.add(new IconModel(R.drawable.icon1, "jfdjfdjf djfdh"));
            arrayList1.add(new IconModel(R.drawable.icon1, "sdfdf sfdsf"));
            arrayList1.add(new IconModel(R.drawable.icon1, "sdfdf sfds"));
            arrayList1.add(new IconModel(R.drawable.icon1, "dfgfhyh sxdff"));
            arrayList1.add(new IconModel(R.drawable.icon1, "jfdjfdjf djfdh"));
            arrayList1.add(new IconModel(R.drawable.icon1, "sdfdf sfdsf"));
            arrayList1.add(new IconModel(R.drawable.icon1, "sdfdf sfds"));
            arrayList1.add(new IconModel(R.drawable.icon1, "dfgfhyh sxdff"));
            arrayList1.add(new IconModel(R.drawable.icon1, "dfgfhyh sxdff"));
            arrayList1.add(new IconModel(R.drawable.icon1, "jfdjfdjf djfdh"));
            arrayList1.add(new IconModel(R.drawable.icon1, "sdfdf sfdsf"));
            arrayList1.add(new IconModel(R.drawable.icon1, "sdfdf sfds"));
            arrayList1.add(new IconModel(R.drawable.icon1, "dfgfhyh sxdff"));
            arrayList1.add(new IconModel(R.drawable.icon1, "jfdjfdjf djfdh"));
            arrayList1.add(new IconModel(R.drawable.icon1, "sdfdf sfdsf"));
            arrayList1.add(new IconModel(R.drawable.icon1, "sdfdf sfds"));
            arrayList1.add(new IconModel(R.drawable.icon1, "dfgfhyh sxdff"));
            arrayList1.add(new IconModel(R.drawable.icon1, "dfgfhyh sxdff"));

            GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 2, GridLayoutManager.HORIZONTAL, false);
            rcIcon.setLayoutManager(gridLayoutManager);
            iconAdapter = new IconAdapter(getApplicationContext(), arrayList1);
            rcIcon.setAdapter(iconAdapter);
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }
                @Override
                public boolean onQueryTextChange (String newText) {
                    filterListener(newText);
                    return true;
                }
            });
            Log.e("MainActivity", "FOUND FOUND FOUND");
        } else {
            // Nếu searchView không tồn tại, in ra một thông báo hoặc xử lý khác
            Log.e("MainActivity", "SearchView not found in layout");
        }
    }
    private void filterListener(String text) {
        List<IconModel> list = new ArrayList<>();
        for (IconModel iconModel: arrayList1){
            if(iconModel.getDesc().toLowerCase().contains(text.toLowerCase())){
                list.add(iconModel);
            }
        }
        if(list.isEmpty()){
            Toast.makeText( this,  "Không có dữ liệu", Toast.LENGTH_SHORT).show();
        }else{
            iconAdapter.setListenerList(list);
        }

    }
}