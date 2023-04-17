package com.example.androidpermission

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.bumptech.glide.Glide
import com.example.androidpermission.databinding.ActivityNormalPermissionBinding

class NormalPermission : AppCompatActivity() {
        lateinit var binding: ActivityNormalPermissionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNormalPermissionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowImg.setOnClickListener {
            Glide.with(this).load("https://i.ibb.co/zJHYGBP/binarlogo.jpg")
                .circleCrop()
                .into(binding.lgBinar)


        }
    }


}