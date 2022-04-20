package uz.shox.intentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initView();


    }
    fun initView(){
        val resultTxt = findViewById<TextView>(R.id.resultTxt)

        val name = intent.getStringExtra("name")
        val age = intent.getIntExtra("age",1)
        resultTxt.text = "Name: $name \nAge: ${age.toString()}"
    }
}