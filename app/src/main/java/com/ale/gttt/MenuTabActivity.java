package com.ale.gttt;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.ale.gttt.fragments.EventFragment;
import com.ale.gttt.fragments.SubjetFragment;
import com.ale.gttt.fragments.TeacherFragment;
import com.ale.gttt.fragments.UserFragment;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;


import com.ale.gttt.ui.main.SectionsPagerAdapter;

public class MenuTabActivity extends AppCompatActivity
        implements EventFragment.OnFragmentInteractionListener,
        SubjetFragment.OnFragmentInteractionListener,
        TeacherFragment.OnFragmentInteractionListener,
        UserFragment.OnFragmentInteractionListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_tab);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.mainmenu, menu);
//        return true;
//    }
//    public  boolean onOptionsItemSelected(MenuItem item){
//        int id= item.getItemId();
//        if(id==R.id.iuser){
//            Intent i= new Intent(this, Main2Activity.class);
//            startActivity(i);
//        }
//        if(id==R.id.ilogout){
//
//        }
//        return super.onOptionsItemSelected(item) ;
//    }
}