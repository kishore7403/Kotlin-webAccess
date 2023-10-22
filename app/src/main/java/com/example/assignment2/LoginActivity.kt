package com.example.assignment2
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var editTextUsername: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button
    private val CORRECT_USERNAME = "user1"
    private val CORRECT_PASSWORD = "user1@123"   // Predefined correct username and password
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        editTextUsername = findViewById(R.id.editTextUserName) // Initialize UI elements by finding them in the layout
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.button)
        buttonLogin.setOnClickListener {      // Set a click listener for the login button
            val enteredUsername = editTextUsername.text.toString() // Get the entered username and password from EditText fields
            val enteredPassword = editTextPassword.text.toString()
            if (enteredUsername == CORRECT_USERNAME && enteredPassword == CORRECT_PASSWORD) { // Correct username and password, navigate to SecondActivity
                val intent = Intent(this@LoginActivity, SecondActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this@LoginActivity, "Incorrect username or password", Toast.LENGTH_SHORT).show() // Incorrect login credentials, show a toast message
            }
        }
    }
}
