package luiz.souza.omegaquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main12.*

class MainActivity12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)

        val intent = Intent(this@MainActivity12, MainActivity::class.java)
        val alertNumber = 9


        //correta
        buttonQuestion9_Option1.setOnClickListener {
            val intent = Intent(this@MainActivity12, MainActivity13::class.java)
            startActivity(intent)
        }

        //incorreta
        buttonQuestion9_Option2.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //incorreta
        buttonQuestion9_Option3.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

        //incorreta
        buttonQuestion9_Option4.setOnClickListener {
            intent.putExtra("alertNumber", alertNumber)
            startActivity(intent)
        }

    }
}