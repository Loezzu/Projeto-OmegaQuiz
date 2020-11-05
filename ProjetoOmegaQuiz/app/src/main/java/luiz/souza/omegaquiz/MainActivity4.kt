package luiz.souza.omegaquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.about_activity4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_activity4)

        buttonBack.setOnClickListener {
            val intent = Intent(this@MainActivity4, MainActivity::class.java)
            startActivity(intent)
        }
    }
}