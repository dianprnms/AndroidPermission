package com.example.androidpermission
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.androidpermission.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    fun enableWifi(view: View) {
        binding.button.setOnClickListener {
            Toast.makeText(this, "Wifi enabled", Toast.LENGTH_SHORT).show()
        }
    }
    fun disableWifi(view: View) {
        binding.off.setOnClickListener {
            Toast.makeText(this, "Wifi disabled", Toast.LENGTH_SHORT).show()
        }
    }
}