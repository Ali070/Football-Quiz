package com.alisamir.footballquiz.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.createGraph
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.alisamir.footballquiz.R
import com.alisamir.footballquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var controller:NavController
    lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        controller = Navigation.findNavController(this,R.id.navfragment)
        NavigationUI.setupWithNavController(binding.drawer,controller)
        //appBarConfiguration = AppBarConfiguration(controller.graph,binding.drawerLayout)
        appBarConfiguration = AppBarConfiguration.Builder(R.id.levelsFragment).setOpenableLayout(binding.drawerLayout).build()
        setupActionBarWithNavController(controller,appBarConfiguration)

    }
    override fun onSupportNavigateUp(): Boolean {
        return controller.navigateUp(appBarConfiguration)||super.onSupportNavigateUp()
    }

}