package com.example.scrollo

import com.example.scrollo.databinding.ActivityMainBinding
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate( layoutInflater )
        setContentView( binding.root)

        replacefragment(newsfragment())
        NewsButton.performClick()
        binding.NewsButton.setOnClickListener {

           replacefragment(newsfragment())

        }

        binding.MemesButton.setOnClickListener {

            replacefragment(memefragment())
        }

        binding.ReelsButton.setOnClickListener {
            replacefragment(ReelsFragment())
        }

    }

    private fun replacefragment( fragment : Fragment)
    {

        val fragmentmanager = supportFragmentManager
        val fragmentTransaction = fragmentmanager.beginTransaction()
        fragmentTransaction.replace( R.id.fragmentcontainer123 , fragment)
        fragmentTransaction.commit()

    }

}



