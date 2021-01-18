package com.epam.navigationproject.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.navArgs
import com.epam.navigationproject.R
import com.epam.navigationproject.auth.CreateProfileFragmentArgs
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Profile"

        val args by navArgs<MainActivityArgs>()

        firstName.text = args.firstName
        lastName.text = args.lastName
        phone.text = args.phoneNumber
    }
}