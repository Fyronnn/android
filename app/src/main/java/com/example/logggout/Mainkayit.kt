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

class Mainkayit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainkayit)

        var database = FirebaseDatabase.getInstance().reference

        var kaydetad = findViewById<TextView>(R.id.kaydetad)
        var kaydetparolaa = findViewById<TextView>(R.id.kaydetparolaa)
        var btnkaydet = findViewById<Button>(R.id.btnkaydet)
        var idd:Int = (0 until 100).random()



        btnkaydet.setOnClickListener {
            if (kaydetad.text.toString().isNotEmpty() && kaydetparolaa.text.toString().isNotEmpty()) {

                var s_isim = kaydetad.text.toString()
                var s_parola = kaydetparolaa.text.toString()

                database.child(idd.toString()).setValue(Kullanici(s_isim,s_parola))

                Toast.makeText(applicationContext,"Kaydınız Başarıyla Tamamlandı",Toast.LENGTH_LONG).show()

                intent = Intent(applicationContext,MainActivity::class.java)



            }

            else {

                Toast.makeText(applicationContext,"Lütfen Geçerli Bir Değer Giriniz",Toast.LENGTH_LONG).show()


            }













        }













    }
}