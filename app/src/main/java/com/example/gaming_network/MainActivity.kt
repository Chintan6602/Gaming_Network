package com.example.gaming_network

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.gaming_network.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root

        setContentView(view)

        mainBinding.spinnerGame.onItemSelectedListener = this

        val arrayAdapter = ArrayAdapter.createFromResource(
            this,
            R.array.Games,
            android.R.layout.simple_spinner_item
        )

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        mainBinding.spinnerGame.adapter = arrayAdapter

        mainBinding.aboutUs.setOnClickListener {
            val intent = Intent(this@MainActivity, AboutUsActivity::class.java)
            startActivity(intent)
        }
        mainBinding.privacyPolicy.setOnClickListener {
            val intent = Intent(this@MainActivity, PrivacyPolicyActivity::class.java)
            startActivity(intent)
        }
        mainBinding.contactUs.setOnClickListener {
            val intent = Intent(this@MainActivity, ContactUsActivity::class.java)
            startActivity(intent)
        }
        mainBinding.terms.setOnClickListener {
            val intent = Intent(this@MainActivity, TermsOfUseActivity::class.java)
            startActivity(intent)
        }
        mainBinding.faq.setOnClickListener {
            val intent = Intent(this@MainActivity, FAQActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onItemSelected(p0: AdapterView<*>?, view: View?, p2: Int, p3: Long) {
        (view as TextView).setTextColor(Color.WHITE)
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}