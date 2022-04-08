package com.example.intent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intent.databinding.ActivitySecondBinding
import com.example.intentresultName.User

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySecondBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val result = intent.getSerializableExtra("user") as User
        println(result)

        binding.resultName.text = result.name
        binding.resultSurname.text = result.surname
        binding.resultAge.text = result.age
        binding.resultEmail.text = result.email
    }
}