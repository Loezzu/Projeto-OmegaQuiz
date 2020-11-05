package luiz.souza.omegaquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = Intent(this@MainActivity2, MainActivity::class.java)
        val alertNumber = 1


        //Correta
        buttonOption1.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity5::class.java)
            startActivity(intent)
        }

        //Incorreta
        buttonOption2.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //Incorreta
        buttonOption3.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //Incorreta
        buttonOption4.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }
    }
}