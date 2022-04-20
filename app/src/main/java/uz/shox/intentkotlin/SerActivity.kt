package uz.shox.intentkotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import uz.shox.intentkotlin.model.MyDatas
import uz.shox.intentkotlin.model.Users

class SerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ser)

        val resultSer = findViewById<TextView>(R.id.resultSer)
        val returnObject = findViewById<TextView>(R.id.returnObject)

        val objectSerBtn = findViewById<Button>(R.id.objectSerBtn)

        val users = Users(1,"Shahzod")


        val myDatas = intent.getSerializableExtra("myDatas")
        resultSer.text = myDatas.toString()

        val launcher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK){
                val data: Intent? = result.data
                val members = data!!.getSerializableExtra("result")
                returnObject.text = members.toString()
            }
        }

        objectSerBtn.setOnClickListener {
            val intent = Intent(this,ResultSerActivity::class.java)
            intent.putExtra("users",users)
            launcher.launch(intent)
        }

    }
}