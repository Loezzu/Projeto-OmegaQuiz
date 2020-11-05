package luiz.souza.omegaquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        buttonStart.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }

        buttonInstructions.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity3::class.java)
            startActivity(intent)
        }

        buttonAbout.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity4::class.java)
            startActivity(intent)
        }


        when (intent.getIntExtra("alertNumber", 0)) {
            1 -> {
                alert(getText(R.string.recommend1))
            }
            2 -> {
                alert(getText(R.string.recommend2))
            }
            3 -> {
                alert(getText(R.string.recommend3))
            }
            4 -> {
                alert(getText(R.string.recommend4))
            }
            5 -> {
                alert(getText(R.string.recommend5))
            }
            6 -> {
                alert(getText(R.string.recommend6))
            }
            7 -> {
                alert(getText(R.string.recommend7))
            }
            8 -> {
                alert(getText(R.string.recommend8))
            }
            9 -> {
                alert(getText(R.string.recommend9))
            }
            10 -> {
                alert(getText(R.string.recommend10))
            }
        }


    }

    private fun alert (message: CharSequence) {
        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setMessage(message)
        alert.setTitle(resources.getText(R.string.alert_Error))
        alert.setIcon(R.mipmap.ic_launcher)
        alert.setNeutralButton("ok",null)
        alert.show()




    }

}