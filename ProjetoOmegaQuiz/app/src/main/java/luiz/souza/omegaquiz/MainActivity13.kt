package luiz.souza.omegaquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main13.*

class MainActivity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)

        val intent = Intent(this@MainActivity13, MainActivity::class.java)
        val alertNumber = 9


        //incorreta
        buttonQuestion10_Option1.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //incorreta
        buttonQuestion10_Option2.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //incorreta
        buttonQuestion10_Option3.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //correta
        buttonQuestion10_Option4.setOnClickListener {
            val intent = Intent(this@MainActivity13, MainActivityFinal::class.java)
            startActivity(intent)
        }
    }
}