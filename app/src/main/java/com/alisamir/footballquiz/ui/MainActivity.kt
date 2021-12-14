package com.alisamir.footballquiz.ui

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.core.view.GravityCompat
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
import com.google.android.material.snackbar.Snackbar

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
        binding.drawer.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.settings->{
                    Snackbar.make(binding.root,"Settings opened", Snackbar.LENGTH_SHORT).show()
                    binding.drawerLayout.closeDrawer(GravityCompat.START)}
                R.id.info->{
                    val alertDialog = AlertDialog.Builder(this)
                        .setIcon(R.drawable.ic_launcher_foreground)
                        .setMessage("Ali Samir, from Egypt have a good experience in android development and made good apps")
                        .setPositiveButton("Ok",object : DialogInterface.OnClickListener{
                            override fun onClick(p0: DialogInterface?, p1: Int) {
                            }

                        })
                        .show()
                    binding.drawerLayout.closeDrawer(GravityCompat.START)
                }
                R.id.rate->{
                    val rateIntent = Intent(Intent.ACTION_VIEW)
                    rateIntent.data = Uri.parse("https://play.google.com/store/apps/details?id=com.twitter.android")
                    startActivity(rateIntent)
                    binding.drawerLayout.closeDrawer(GravityCompat.START)
                }
                R.id.share->{
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.putExtra(Intent.EXTRA_TEXT,"Check out my app from this link:https://play.google.com/store/apps/details?id=com.twitter.android")
                    shareIntent.type = "text/plain"
                    startActivity(Intent.createChooser(shareIntent,"Choose the app you want:"))
                    binding.drawerLayout.closeDrawer(GravityCompat.START)
                }
            }
            true
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        return controller.navigateUp(appBarConfiguration)||super.onSupportNavigateUp()
    }

}