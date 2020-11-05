package luiz.souza.omegaquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_final.*

class MainActivityFinal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_final)


        button_main_menu.setOnClickListener {
            val intent = Intent(this@MainActivityFinal, MainActivity::class.java)
            startActivity(intent)
        }

        button_restart.setOnClickListener {
            val intent = Intent(this@MainActivityFinal, MainActivity2::class.java)
            startActivity(intent)
        }


    }
}