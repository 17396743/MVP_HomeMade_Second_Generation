package com.example.myapplication11;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sprout.base.BaseActivity;
import com.sprout.interfaces.home.IMain;
import com.sprout.ui.HomeActivity;
import com.sprout.ui.car.CarFragment;
import com.sprout.ui.home.HomeFragment;
import com.sprout.ui.mine.MineFragment;
import com.sprout.ui.sort.SortFragment;
import com.sprout.ui.topic.TopicFragment;

import butterknife.BindView;

/**
 * 主界面
 */
public class MainActivity extends BaseActivity<IMain.Presenter> implements IMain.View {

    @BindView(R.id.fragmentbox)
    FrameLayout fragmentbox;
    @BindView(R.id.bottomNavigation)
    BottomNavigationView bottomNavigation;

    Fragment homeFragment;
    Fragment topicFragment;
    Fragment sortFragment;
    Fragment carFragment;
    Fragment mineFragment;


    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        initFragments();

        FragmentManager fragmentManager = getSupportFragmentManager();
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction transaction;
                switch (item.getItemId()){
                    case R.id.menu_home:
                        item.setIcon(R.mipmap.ic_menu_choice_pressed);
                        transaction = fragmentManager.beginTransaction();
                        transaction.replace(R.id.fragmentbox,homeFragment).commit();
                        break;
                    case R.id.menu_topic:
                        item.setIcon(R.mipmap.ic_menu_topic_pressed);
                        transaction = fragmentManager.beginTransaction();
                        transaction.replace(R.id.fragmentbox,topicFragment).commit();
                        break;
                    case R.id.menu_sort:
                        item.setIcon(R.mipmap.ic_menu_sort_pressed);
                        transaction = fragmentManager.beginTransaction();
                        transaction.replace(R.id.fragmentbox,sortFragment).commit();
                        break;
                    case R.id.menu_car:
                        item.setIcon(R.mipmap.ic_menu_shoping_pressed);
                        transaction = fragmentManager.beginTransaction();
                        transaction.replace(R.id.fragmentbox,carFragment).commit();
                        break;
                    case R.id.menu_mine:
                        item.setIcon(R.mipmap.ic_menu_me_pressed);
                        transaction = fragmentManager.beginTransaction();
                        transaction.replace(R.id.fragmentbox,mineFragment).commit();
                        break;
                }
                return false;
            }
        });
    }


    private void initFragments(){
        homeFragment = HomeFragment.getInstance();
        topicFragment = TopicFragment.getInstance();
        sortFragment = SortFragment.getInstance();
        carFragment = CarFragment.getInstance();
        mineFragment = MineFragment.getInstance();
    }

    @Override
    protected IMain.Presenter createPersenter() {
        return null;
    }

    @Override
    protected void initData() {

    }
}