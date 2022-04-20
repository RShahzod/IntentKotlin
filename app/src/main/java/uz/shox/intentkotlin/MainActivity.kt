package uz.shox.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import uz.shox.intentkotlin.model.MyDat
import uz.shox.intentkotlin.model.MyDatas

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()




    }
    fun initView(){
        val firstTaskBtn = findViewById<Button>(R.id.firstTaskBtn)
        val secondTaskBtn = findViewById<Button>(R.id.secondTaskBtn)
        val threeTaskBtn = findViewById<Button>(R.id.threeTaskBtn)

        val myDatas = MyDatas(age = 23, name = "Shahzod")
        val myData = MyDat(age = 24,name = "Shox")


        firstTaskBtn.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("age",23)
            intent.putExtra("name","Shox")
            startActivity(intent)
        }
        secondTaskBtn.setOnClickListener {
            val intent = Intent(this,SerActivity::class.java)
            intent.putExtra("myDatas",myDatas)
            startActivity(intent)
        }
        threeTaskBtn.setOnClickListener {
            val intent = Intent(this,ParActivity::class.java)
            intent.putExtra("myData",myData)
            startActivity(intent)
        }

    }
}