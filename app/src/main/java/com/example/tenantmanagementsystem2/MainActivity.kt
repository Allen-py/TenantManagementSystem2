package com.example.tenantmanagementsystem2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tenantmanagementsystem2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // "binding" gives us access to every view in activity_main.xml.
    // lateinit = we promise to give it a value before we use it (in onCreate).
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Connect this Activity to activity_main.xml using binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // This code runs when the SAVE button is tapped
        binding.saveButton.setOnClickListener {

            // 1. Read what the user typed
            val name = binding.tenantNameEditText.text.toString()
            val phone = binding.phoneEditText.text.toString()
            val rent = binding.rentEditText.text.toString()

            // 2. Put the details into a Tenant object
            val tenant = Tenant(name, phone, rent)

            // 3. Give the Tenant to the layout.
            //    The XML then shows it using @{tenant.summary()}
            binding.tenant = tenant
        }
    }
}