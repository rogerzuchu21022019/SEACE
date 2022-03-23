package team.hacker.seace

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import team.hacker.seace.databinding.ActivityMainBinding
import java.lang.Exception


class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)


    }

}