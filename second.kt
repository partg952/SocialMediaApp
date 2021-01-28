package com.example.socialmediaapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.auth.FirebaseAuth

class second(context: Context) : Fragment() {
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view =  inflater.inflate(R.layout.fragment_second, container, false)

        var text = view.findViewById<TextView>(R.id.textView3)
        var members = view.findViewById<FloatingActionButton>(R.id.floatingActionButton2)
        var addimage = view.findViewById<FloatingActionButton>(R.id.floatingActionButton)

        var email = FirebaseAuth.getInstance().currentUser?.email.toString()

        text.text = email

        addimage.setOnClickListener {
            var intent = Intent(context,ImageAdd::class.java)
            startActivity(intent)
        }

        members.setOnClickListener {
            var intent2 = Intent(context,Members::class.java)
            startActivity(intent2)
        }



        return view

    }

    }
