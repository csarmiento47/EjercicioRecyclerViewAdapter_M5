package com.inforcap.ejerciciorecyclerviewadapter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.inforcap.ejerciciorecyclerviewadapter.databinding.ItemContactBinding
import com.inforcap.ejerciciorecyclerviewadapter.model.Contact

class ContactAdapter(
    private val contacts: List<Contact>
) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    var onClick: ((Contact) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapter.ContactViewHolder {
        val binding = ItemContactBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactAdapter.ContactViewHolder, position: Int) {
        holder.onBind(contacts[position])
    }

    override fun getItemCount(): Int = contacts.size

    inner class ContactViewHolder(private val binding: ItemContactBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(contact: Contact) {
            with(binding) {
                contact.run {
                    tvContactName.text = name
                    tvContactPhoneNumber.text = phoneNumber
                }
            }
            binding.itemContact.setOnClickListener {
                onClick?.invoke(contact)
            }

        }
    }
}