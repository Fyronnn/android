package com.example.logggout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var database = FirebaseDatabase.getInstance().reference

        var girisad = findViewById<TextView>(R.id.girisad)
        var girisparola = findViewById<TextView>(R.id.girisparola)
        var btngiris = findViewById<Button>(R.id.btngiris)
        var btnkayitol = findViewById<Button>(R.id.btnkayitol)


        btnkayitol.setOnClickListener {

            intent = Intent(applicationContext,Mainkayit::class.java)
            startActivity(intent)



        }


        btngiris.setOnClickListener {


            if (girisad.text.toString().isNotEmpty() && girisparola.text.toString().isNotEmpty()) {

                var arayuz_isim =  girisad.text.toString()
                var arayuz_parola = girisparola.text.toString()


                val getdata = object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {

                        for (i in snapshot.children) {

                            var kayitli_isim = i.child("isim").getValue()
                            var kayitli_parola = i.child("parola").getValue()






                        }








                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }

                }












            }

















        }













    }
}