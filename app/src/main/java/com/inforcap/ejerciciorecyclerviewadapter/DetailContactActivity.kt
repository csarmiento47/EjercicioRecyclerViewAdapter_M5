package com.inforcap.ejerciciorecyclerviewadapter

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.inforcap.ejerciciorecyclerviewadapter.databinding.ActivityDetailContactBinding
import com.inforcap.ejerciciorecyclerviewadapter.model.Contact

class DetailContactActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle : Bundle? = intent.extras?.getBundle("BUNDLE")
        val contact = bundle?.getParcelable<Contact>("CONTACT")

        if (contact != null){
            binding.tvContactName.text = contact.name + " (" + contact.id + ")"
            binding.tvContactPhoneNumber.text = contact.phoneNumber
        }

    }
}