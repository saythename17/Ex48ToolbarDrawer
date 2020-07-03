package com.icandothisallday2020.ex48toolbardrawer;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;
public class MainActivity extends AppCompatActivity {
    DrawerLayout dl;
    NavigationView nv;
    //Drawer 를 열고 닫는 아이콘
    ActionBarDrawerToggle drawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        dl=findViewById(R.id.layout_drawer);
        nv=findViewById(R.id.nav);
        drawerToggle=new ActionBarDrawerToggle(this,dl,toolbar,R.string.app_name,R.string.app_name);
        dl.addDrawerListener(drawerToggle);//아이콘이 회전하며 돌아옴
        drawerToggle.syncState();
    }
}
