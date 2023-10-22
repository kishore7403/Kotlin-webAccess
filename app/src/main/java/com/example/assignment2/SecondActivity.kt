package com.example.assignment2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
class SecondActivity : AppCompatActivity() {
    private lateinit var buttonReturnToLogin: Button
    private lateinit var buttonGoToWebActivity: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        buttonReturnToLogin = findViewById(R.id.homebutton)     // Find the "Return to Login" button in the layout and set a click listener
        buttonReturnToLogin.setOnClickListener {         // Create an Intent to navigate back to the LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        buttonGoToWebActivity = findViewById(R.id.webButton)      // Find the "Go to Web Activity" button in the layout and set a click listener
        buttonGoToWebActivity.setOnClickListener {         // Create an Intent to navigate to the WebActivity
            val intent = Intent(this, WebActivity::class.java)
            startActivity(intent)
        }
    }
}
