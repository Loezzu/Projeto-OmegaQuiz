package luiz.souza.omegaquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main6.*

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val intent = Intent(this@MainActivity6, MainActivity::class.java)
        val alertNumber = 3


        //correta
        buttonQuestion3_Option1.setOnClickListener {
            val intent = Intent(this@MainActivity6, MainActivity7::class.java)
            startActivity(intent)
        }

        //incorreta
        buttonQuestion3_Option2.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //incorreta
        buttonQuestion4_Option3.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //incorreta
        buttonQuestion3_Option4.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

    }
}