package com.example.mentorgram

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mentorgram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvLogin.setOnClickListener {
            val intent = Intent(this, Secondactivity::class.java)
            startActivity(intent)
        }

        binding.btnRegister.setOnClickListener {
            validateRegistration()
        }
    }

        fun validateRegistration(){
            var formErr=false
            clearErrors()
            val firstName=binding.etFirstName.text.toString()
            if(firstName.isBlank()){
                formErr=true
                binding.tilFirstName.error="First name is required"
            }

            val lastName=binding.etLastName.text.toString()
            if(lastName.isBlank()){
                formErr=true
                binding.tilLastName.error="Last name is required"
            }

            val Email=binding.etEmail.text.toString()
            if(firstName.isBlank()){
                formErr=true
                binding.tilEmail.error="Email is required"
            }

            val Codehive=binding.etCodehive.text.toString()
            if(firstName.isBlank()){
                formErr=true
                binding.tilCode.error="Code is required"
            }

            val userName=binding.etUserName.text.toString()
            if(firstName.isBlank()){
                formErr=true
                binding.tillUserName.error="User name is required"
            }

            val password=binding.etPassword.text.toString()
            if(firstName.isBlank()){
                formErr=true
                binding.tillPassword.error="Password is required"
            }

            val confirm=binding.etConPassword.text.toString()
            if(firstName.isBlank()){
                formErr=true
                binding.tillConPassword.error=" Confirm password"
            }
            if(password!=confirm){
                binding.tillConPassword.error="Passwords do not match"
            }
            if(!formErr){
                //proceed to registration
        }
        }

    fun clearErrors(){
        binding.tilFirstName.error=null
        binding.tilLastName.error=null
        binding.tilEmail.error=null
        binding.tilCode.error=null
        binding.tillUserName.error=null
        binding.tillPassword.error=null
        binding.tillConPassword.error=null
    }
}

    //        val textview = findViewById<TextView>(R.id.tvLogin)
//        textview.setOnClickListener {
//            val intent = Intent(this, Secondactivity::class.java)
//            startActivity(intent)
//            }

