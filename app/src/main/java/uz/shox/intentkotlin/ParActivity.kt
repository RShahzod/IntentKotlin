package uz.shox.intentkotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import uz.shox.intentkotlin.model.Member
import uz.shox.intentkotlin.model.MyDat
import uz.shox.intentkotlin.model.User
import uz.shox.intentkotlin.model.Users

class ParActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_par)

        val resultPar = findViewById<TextView>(R.id.resultPar)
        val returnObject = findViewById<TextView>(R.id.returnObject)

        val objectParBtn = findViewById<Button>(R.id.objectParBtn)

        val user = User(2,"Shahzod")


        val myData = intent.getParcelableExtra<MyDat>("myData")
        resultPar.text = myData.toString()

        val launcher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK){
                val data: Intent? = result.data
                val member = data!!.getParcelableExtra<Member>("member")
                returnObject.text = member.toString()
            }
        }

        objectParBtn.setOnClickListener {
            val intent = Intent(this,ResultParActivity::class.java)
            intent.putExtra("user",user)
            launcher.launch(intent)
        }

    }
}