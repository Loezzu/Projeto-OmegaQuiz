package luiz.souza.omegaquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main8.*

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        val intent = Intent(this@MainActivity8, MainActivity::class.java)
        val alertNumber = 5


        //incorreta
        buttonQuestion5_Option1.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //incorreta
        buttonQuestion5_Option2.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //correta
        buttonQuestion5_Option3.setOnClickListener {
            val intent = Intent(this@MainActivity8, MainActivity9::class.java)
            startActivity(intent)
        }

        //incorreta
        buttonQuestion5_Option4.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

    }
}