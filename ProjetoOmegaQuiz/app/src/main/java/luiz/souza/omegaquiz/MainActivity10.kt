package luiz.souza.omegaquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main10.*

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        val intent = Intent(this@MainActivity10, MainActivity::class.java)
        val alertNumber = 7


        //correta
        buttonQuestion7_Option1.setOnClickListener {
            val intent = Intent(this@MainActivity10, MainActivity11::class.java)
            startActivity(intent)
        }

        //incorreta
        buttonQuestion7_Option2.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //incorreta
        buttonQuestion7_Option3.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //incorreta
        buttonQuestion7_Option4.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }
    }
}