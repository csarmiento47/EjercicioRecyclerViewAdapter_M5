package com.inforcap.ejerciciorecyclerviewadapter

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.inforcap.ejerciciorecyclerviewadapter.adapter.ContactAdapter
import com.inforcap.ejerciciorecyclerviewadapter.databinding.ActivityMainBinding
import com.inforcap.ejerciciorecyclerviewadapter.model.Contact

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: ContactAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ContactAdapter(dummyData())
        binding.rvContact.layoutManager = LinearLayoutManager(this)
        binding.rvContact.adapter = adapter

        adapter.onClick = {
            Log.d("ContactsFragment", "adapter.onClick: $it")
            onItemSelected(it)
        }

    }

    fun onItemSelected(contact: Contact) {
        startActivity(Intent(applicationContext,DetailContactActivity::class.java).apply {
            putExtra("BUNDLE", Bundle().apply {
                putParcelable("CONTACT",contact)
            })
        })
    }

    fun dummyData(): List<Contact> = listOf(
        Contact(
            id = 1,
            name = "Samuel Taylor Coleridge",
            phoneNumber = "+56 234 1231"
        ),
        Contact(
            id = 2,
            name = "Edgar Alan Poe",
            phoneNumber = "+56 234 1134"
        ),
        Contact(
            id = 3,
            name = "H.P. Lovecraft",
            phoneNumber = "+46 264 1134"
        ),
        Contact(
            id = 4,
            name = "Samuel Taylor Coleridge",
            phoneNumber = "+56 234 1231"
        ),
        Contact(
            id = 5,
            name = "Edgar Alan Poe",
            phoneNumber = "+56 234 1134"
        ),
        Contact(
            id = 6,
            name = "H.P. Lovecraft",
            phoneNumber = "+46 264 1134"
        ),
        Contact(
            id = 7,
            name = "Samuel Taylor Coleridge",
            phoneNumber = "+56 234 1231"
        ),
        Contact(
            id = 8,
            name = "Edgar Alan Poe",
            phoneNumber = "+56 234 1134"
        ),
        Contact(
            id = 9,
            name = "H.P. Lovecraft",
            phoneNumber = "+46 264 1134"
        ),
        Contact(
            id = 10,
            name = "Samuel Taylor Coleridge",
            phoneNumber = "+56 234 1231"
        ),
        Contact(
            id =11,
            name = "Edgar Alan Poe",
            phoneNumber = "+56 234 1134"
        ),
        Contact(
            id = 12,
            name = "H.P. Lovecraft",
            phoneNumber = "+46 264 1134"
        ),
        Contact(
            id = 13,
            name = "Samuel Taylor Coleridge",
            phoneNumber = "+56 234 1231"
        ),
        Contact(
            id = 14,
            name = "Edgar Alan Poe",
            phoneNumber = "+56 234 1134"
        ),
        Contact(
            id = 15,
            name = "H.P. Lovecraft",
            phoneNumber = "+46 264 1134"
        ),
        Contact(
            id = 16,
            name = "Samuel Taylor Coleridge",
            phoneNumber = "+56 234 1231"
        ),
        Contact(
            id = 17,
            name = "Edgar Alan Poe",
            phoneNumber = "+56 234 1134"
        ),
        Contact(
            id = 18,
            name = "H.P. Lovecraft",
            phoneNumber = "+46 264 1134"
        ),
        Contact(
            id = 19,
            name = "Samuel Taylor Coleridge",
            phoneNumber = "+56 234 1231"
        ),
        Contact(
            id = 20,
            name = "Edgar Alan Poe",
            phoneNumber = "+56 234 1134"
        ),
        Contact(
            id = 21,
            name = "H.P. Lovecraft",
            phoneNumber = "+46 264 1134"
        ),
        Contact(
            id = 22,
            name = "Samuel Taylor Coleridge",
            phoneNumber = "+56 234 1231"
        ),
        Contact(
            id =23,
            name = "Edgar Alan Poe",
            phoneNumber = "+56 234 1134"
        ),
        Contact(
            id = 24,
            name = "H.P. Lovecraft",
            phoneNumber = "+46 264 1134"
        ),
    )

}