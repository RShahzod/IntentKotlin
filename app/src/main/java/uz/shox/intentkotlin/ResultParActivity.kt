package uz.shox.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import uz.shox.intentkotlin.model.Member
import uz.shox.intentkotlin.model.Members
import uz.shox.intentkotlin.model.User

class ResultParActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_par)
        val parResult = findViewById<TextView>(R.id.parResult)
        val exitPar = findViewById<Button>(R.id.exitPar)

        val user = intent.getParcelableExtra<User>("user")
        parResult.text = user.toString()

        exitPar.setOnClickListener {
            backToFinish()
        }

    }

    fun backToFinish(){
        val member = Member("Shahzod","Ruzimboyev")
        val intent = Intent()
        intent.putExtra("member",member)
        setResult(RESULT_OK,intent)
        finish()
    }
}