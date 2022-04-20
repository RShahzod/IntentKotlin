package uz.shox.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import uz.shox.intentkotlin.model.Members

class ResultSerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_ser)
        val serResult = findViewById<TextView>(R.id.serResult)
        val exitSer = findViewById<Button>(R.id.exitSer)

        val users = intent.getSerializableExtra("users")
        serResult.text = users.toString()

        exitSer.setOnClickListener {
            backToFinish()
        }

    }

    fun backToFinish(){
        val members = Members("Shahzod","Ro'zimboyev")
        val intent = Intent()
        intent.putExtra("result",members)
        setResult(RESULT_OK,intent)
        finish()
    }
}