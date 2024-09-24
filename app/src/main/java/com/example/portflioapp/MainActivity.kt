package com.example.portflioapp



import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize buttons
        val aboutMyselfButton = findViewById<Button>(R.id.button_about_myself)
        val educationButton = findViewById<Button>(R.id.button_education)
        val hardSkillButton = findViewById<Button>(R.id.button_hard_skill)
        val softSkillButton = findViewById<Button>(R.id.button_soft_skill)
        val professionalCertificateButton = findViewById<Button>(R.id.button_professional_certificate)
        val onlineInternshipButton = findViewById<Button>(R.id.button_online_internship)
        val projectButton = findViewById<Button>(R.id.button_project)
        val getInTouchButton = findViewById<Button>(R.id.button_get_in_touch)

        // Set onClick listeners for each button to navigate to the respective activity
        aboutMyselfButton.setOnClickListener {
            startActivity(Intent(this, About::class.java))
        }

        educationButton.setOnClickListener {
            startActivity(Intent(this, Education::class.java))
        }

        hardSkillButton.setOnClickListener {
            startActivity(Intent(this, Hard_Skill::class.java))
        }

        softSkillButton.setOnClickListener {
            startActivity(Intent(this, Soft_Skill::class.java))
        }

        professionalCertificateButton.setOnClickListener {
            startActivity(Intent(this, profesionalCertificate::class.java))
        }

        onlineInternshipButton.setOnClickListener {
            startActivity(Intent(this, onlineInternship::class.java))
        }

        projectButton.setOnClickListener {
            startActivity(Intent(this, Project::class.java))
        }

        getInTouchButton.setOnClickListener {
            startActivity(Intent(this, Get_in_Touch::class.java))
        }
    }
}






