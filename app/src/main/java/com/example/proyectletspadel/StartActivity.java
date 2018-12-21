package com.example.proyectletspadel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.view.Gravity;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class StartActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Toolbar toolbar = setToolbar();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager FragmentManager = getSupportFragmentManager();
        FragmentManager.beginTransaction().replace(R.id.contenedor,new MenuFragment()).commit();



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        FragmentManager FragmentManager = getSupportFragmentManager();
       // Fragment miFragment= null;
       // boolean fragmentSelecionado = false;

        if (id == R.id.ayuda_usuario) {
            FragmentManager.beginTransaction().replace(R.id.contenedor,new AyudaFragment()).commit();
         //  miFragment =new AyudaFragment();
            //  fragmentSelecionado=true;
            item.setChecked(true);
            getSupportActionBar().setTitle(item.getTitle());

        } else if (id == R.id.menu_inicio) {

            FragmentManager.beginTransaction().replace(R.id.contenedor,new MenuFragment()).commit();
            //  miFragment =new MenuFragment();
            //  fragmentSelecionado=true;
            item.setChecked(true);
            getSupportActionBar().setTitle(item.getTitle());

        } else if (id == R.id.partidas_abiertas) {

            FragmentManager.beginTransaction().replace(R.id.contenedor,new PartidasFragment()).commit();
            //  miFragment =new PartidasFragment();
            //  fragmentSelecionado=true;
            item.setChecked(true);
            getSupportActionBar().setTitle(item.getTitle());

        } else if (id == R.id.partida_nueva) {

            FragmentManager.beginTransaction().replace(R.id.contenedor,new NuevaFragment()).commit();
            // miFragment =new NuevaFragment();
            // fragmentSelecionado=true;
            item.setChecked(true);
            getSupportActionBar().setTitle(item.getTitle());

        } else if (id == R.id.nav_share) {

            FragmentManager.beginTransaction().replace(R.id.contenedor,new CompartirFragment()).commit();
            // miFragment =new CompartirFragment();
            // fragmentSelecionado=true;
            item.setChecked(true);
            getSupportActionBar().setTitle(item.getTitle());

        } else if (id == R.id.cerrar_session) {

            FragmentManager.beginTransaction().replace(R.id.contenedor,new CerrarFragment()).commit();
            // miFragment =new CerrarFragment();
            // fragmentSelecionado=true;
            item.setChecked(true);
            getSupportActionBar().setTitle(item.getTitle());

        }

        // if(fragmentSelecionado==true){
        // getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,miFragment).commit();

        //}

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private Toolbar setToolbar(){

        Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu_slideshow);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        return toolbar;
    }
}
