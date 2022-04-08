package com.example.intent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intent.databinding.ActivityMainBinding
import com.example.intentresultName.User


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)




        binding.button.setOnClickListener {
            navigateToSecondActivity()

        }

    }

    private fun navigateToSecondActivity() {
        val name = binding.editTextTextPersonName.text.toString()
        val surname = binding.editTextTextPersonSurname.text.toString()
        val age = binding.editTextTextPersonAge.text.toString().toInt()
        val email = binding.editTextTextPersonEmail.text.toString()
        val newUser = User(name, surname, age, email)
        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        intent.putExtra("user", newUser)
        startActivity(intent)
    }
}


