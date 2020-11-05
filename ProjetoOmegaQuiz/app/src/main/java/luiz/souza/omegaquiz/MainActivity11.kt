package luiz.souza.omegaquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main11.*

class MainActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)

        val intent = Intent(this@MainActivity11, MainActivity::class.java)
        val alertNumber = 8


        //incorreta
        buttonQuestion8_Option1.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //incorreta
        buttonQuestion8_Option2.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //correta
        buttonQuestion8_Option3.setOnClickListener {
            val intent = Intent(this@MainActivity11, MainActivity12::class.java)
            startActivity(intent)
        }

        //incorreta
        buttonQuestion8_Option4.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

    }
}