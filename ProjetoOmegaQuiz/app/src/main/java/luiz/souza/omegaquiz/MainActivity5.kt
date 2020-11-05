package luiz.souza.omegaquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val intent = Intent(this@MainActivity5, MainActivity::class.java)
        val alertNumber = 2


        //Incorreta
        buttonQuestion2_Option1.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //Incorreta
        buttonQuestion2_Option2.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //Correta
        buttonQuestion2_Option3.setOnClickListener {
            val intent = Intent(this@MainActivity5, MainActivity6::class.java)
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //Incorreta
        buttonQuestion2_Option4.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

    }
}