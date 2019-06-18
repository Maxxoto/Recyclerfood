package com.hamlet.dicoding_beginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
//    private ArrayList<Makanan> list = new ArrayList<>();
    private ArrayList<Makanan> list ;
    final String STATE_TITLE = "state_string";
    final String STATE_LIST = "state_list";
    final String STATE_MODE = "state_mode";
    int mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();

        if(savedInstanceState == null){
            setActionBarTitle("Mode List");
            list.addAll(MakananData.getListData());
            showRecyclerList();
            mode = R.id.action_list;
        }else {
            String stateTitle = savedInstanceState.getString(STATE_TITLE);
            ArrayList<Makanan> stateList = savedInstanceState.getParcelableArrayList(STATE_LIST);
            int stateMode = savedInstanceState.getInt(STATE_MODE);
            setActionBarTitle(stateTitle);
            list.addAll(stateList);
            setMode(stateMode);
        }
    }

    private void showSelectedMakanan(Makanan makanan) {
        //Toast.makeText(this, "Kamu memilih " + makanan.getName(), Toast.LENGTH_SHORT).show();


        Intent intent = new Intent(MainActivity.this, MainDetail.class);
        intent.putParcelableArrayListExtra("Food",makanan);
        startActivity(intent);
    }

    private void showRecyclerList() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListMakananAdapter listMakananAdapter = new ListMakananAdapter(this);
        listMakananAdapter.setListMakanan(list);
        rvCategory.setAdapter(listMakananAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedMakanan(list.get(position));
            }
        });
    }

    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardMakananAdapter cardMakananAdapter = new CardMakananAdapter(this);
        cardMakananAdapter.setListMakanan(list);
        rvCategory.setAdapter(cardMakananAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedMakanan(list.get(position));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode){
        String title = null;
        switch(selectedMode){
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;
            case R.id.action_grid:
                title = "Mode Grid";
                break;
            case R.id.action_card:
                title = "Mode Card";
                showRecyclerCardView();
                break;
        }
        mode = selectedMode;
        setActionBarTitle(title);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString(STATE_TITLE,getSupportActionBar().getTitle().toString());
        outState.putParcelableArrayList(STATE_LIST,list);
        outState.putInt(STATE_MODE,mode);
    }

}
