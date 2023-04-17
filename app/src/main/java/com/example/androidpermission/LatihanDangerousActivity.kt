package com.example.androidpermission

import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.BitmapFactory
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import com.example.androidpermission.databinding.ActivityDangerousBinding
import com.example.androidpermission.databinding.ActivityLatihanDangerousBinding
import java.io.File

class LatihanDangerousActivity : AppCompatActivity() {
//    lateinit var binding: ActivityLatihanDangerousBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityLatihanDangerousBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        binding.btnTakePhoto.setOnClickListener {
//            val takePhotoIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//            filePhoto = getPhotoFile(FILE_NAME)
//            val providerFile =FileProvider.getUriForFile(this,"com.example.androidcamera.fileprovider", filePhoto)
//            takePhotoIntent.putExtra(MediaStore.EXTRA_OUTPUT, providerFile)
//        }
//    }
//    private fun getPhotoFile(fileName: String): File {
//        val directoryStorage = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
//        return File.createTempFile(fileName, ".jpg", directoryStorage)
//    }
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        if(requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK){
//            val takenPhoto = BitmapFactory.decodeFile(filePhoto.absolutePath)
//            binding.foto.setImageBitmap(takenPhoto)
//        }else {
//            super.onActivityResult(requestCode, resultCode, data)
//        }
//    }
//// private const val REQUEST_CODE = 13
////you can type a random number, this is not important
//
//    btnChoosePhoto.setOnClickListener {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
//            if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)== PackageManager.PERMISSION_DENIED){
//                val permissions = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE)
//                requestPermissions(permissions, PERMISSION_CODE)
//            } else{
//                chooseImageGallery();
//            }
//        }else{
//            chooseImageGallery();
//        }
//    }
//    // companion object
//    companion object {
//        private val IMAGE_CHOOSE = 1000;
//        private val PERMISSION_CODE = 1001;
//    }
}