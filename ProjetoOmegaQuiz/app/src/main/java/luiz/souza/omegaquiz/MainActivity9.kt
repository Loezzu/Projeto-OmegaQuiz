package luiz.souza.omegaquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main9.*

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

        val intent = Intent(this@MainActivity9, MainActivity::class.java)
        val alertNumber = 6


        //incorreta
        buttonQuestion6_Option1.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //incorreta
        buttonQuestion6_Option2.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //incorreta
        buttonQuestion6_Option3.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //correta
        buttonQuestion6_Option4.setOnClickListener {
            val intent = Intent(this@MainActivity9, MainActivity10::class.java)
            startActivity(intent)
        }

    }
}