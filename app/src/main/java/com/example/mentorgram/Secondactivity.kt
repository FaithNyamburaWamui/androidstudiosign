package com.example.mentorgram

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mentorgram.databinding.ActivityMainBinding
import com.example.mentorgram.databinding.ActivitySecondactivityBinding

class Secondactivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val textView3= findViewById<TextView>(R.id.textView3)
        textView3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnPrev.setOnClickListener {
            validateRegistration()
        }
    }

    fun validateRegistration() {
        var formErr=false
        clearError()
        val user=binding.etUser.text.toString()
        if(user.isBlank()){
            formErr=true
            binding.tillUser.error="First name is required"
        }

        val password=binding.etPassword2.text.toString()
        if(password.isBlank()){
            formErr=true
            binding.tillPassword2.error="First name is required"
        }
    }

fun clearError(){
    binding.tillUser.error=null
    binding.tillPassword2.error=null
}
}