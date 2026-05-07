package com.example.classwork1

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.classwork1.ui.theme.Classwork1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginlayout)

        val usernameInput = findViewById<EditText>(R.id.username)
        val passwordInput = findViewById<EditText>(R.id.password)
        val logiBtn = findViewById<Button>(R.id.loginBtn)

        logiBtn.setOnClickListener{

            val username = usernameInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()


            // let check the username and password.

            if (username == "Mason" && password == "admin"){
                Toast.makeText(this,"Welcome  $username ", Toast.LENGTH_SHORT).show()


                //Navigate to the dashbaord page

                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)
                finish()



            }

        }


    }



}