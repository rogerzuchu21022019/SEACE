package team.hacker.seace.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import team.hacker.seace.R
import team.hacker.seace.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var activitiMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activitiMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activitiMainBinding.root)
    }


}