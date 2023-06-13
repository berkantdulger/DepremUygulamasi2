package com.berkantdulger.depremuygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView



class HosgeldinizEkrani : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hosgeldiniz_ekrani)
        val button9 = findViewById<Button>(R.id.button9)
        val button7 = findViewById<Button>(R.id.button7)
        val button10 = findViewById<Button>(R.id.button10)
        val button11 = findViewById<Button>(R.id.button11)
        val button5 = findViewById<Button>(R.id.button5)


        button5.setOnClickListener{
            finish()
            System.exit(0)

        }
        //1. KİŞİ
        button9.setOnClickListener {
            val textView3 = findViewById<TextView>(R.id.textView3)
            val textView11 = findViewById<TextView>(R.id.textView11)
            val textView12 = findViewById<TextView>(R.id.textView12)
            val textView13 = findViewById<TextView>(R.id.textView13)

            if (textView3.visibility == View.VISIBLE) {

                textView3.visibility = View.GONE
            } else {

                textView3.visibility = View.VISIBLE
            }

            if (textView11.visibility == View.VISIBLE) {

                textView11.visibility = View.GONE
            } else {

                textView11.visibility = View.VISIBLE
            }

            if (textView12.visibility == View.VISIBLE) {

                textView12.visibility = View.GONE
            } else {

                textView12.visibility = View.VISIBLE
            }

            if (textView13.visibility == View.VISIBLE) {

                textView13.visibility = View.GONE
            } else {

                textView13.visibility = View.VISIBLE
            }

        }

        //2. KİŞİ
        button7.setOnClickListener {
            val textView15 = findViewById<TextView>(R.id.textView15)
            val textView16 = findViewById<TextView>(R.id.textView16)
            val textView17 = findViewById<TextView>(R.id.textView17)
            val textView18 = findViewById<TextView>(R.id.textView18)

            if (textView15.visibility == View.VISIBLE) {

                textView15.visibility = View.GONE
            } else {

                textView15.visibility = View.VISIBLE
            }

            if (textView16.visibility == View.VISIBLE) {

                textView16.visibility = View.GONE
            } else {

                textView16.visibility = View.VISIBLE
            }

            if (textView17.visibility == View.VISIBLE) {

                textView17.visibility = View.GONE
            } else {

                textView17.visibility = View.VISIBLE
            }

            if (textView18.visibility == View.VISIBLE) {

                textView18.visibility = View.GONE
            } else {

                textView18.visibility = View.VISIBLE
            }

        }

        //  3. KİŞİ
        button10.setOnClickListener {
            val textView19 = findViewById<TextView>(R.id.textView19)
            val textView24 = findViewById<TextView>(R.id.textView24)
            val textView25 = findViewById<TextView>(R.id.textView25)
            val textView26 = findViewById<TextView>(R.id.textView26)

            if (textView19.visibility == View.VISIBLE) {

                textView19.visibility = View.GONE
            } else {

                textView19.visibility = View.VISIBLE
            }

            if (textView24.visibility == View.VISIBLE) {

                textView24.visibility = View.GONE
            } else {

                textView24.visibility = View.VISIBLE
            }

            if (textView25.visibility == View.VISIBLE) {

                textView25.visibility = View.GONE
            } else {

                textView25.visibility = View.VISIBLE
            }

            if (textView26.visibility == View.VISIBLE) {

                textView26.visibility = View.GONE
            } else {

                textView26.visibility = View.VISIBLE
            }


        }

        //4. KİŞİ

        button11.setOnClickListener {
            val textView27 = findViewById<TextView>(R.id.textView27)
            val textView28 = findViewById<TextView>(R.id.textView28)
            val textView29 = findViewById<TextView>(R.id.textView29)
            val textView30 = findViewById<TextView>(R.id.textView30)

            if (textView27.visibility == View.VISIBLE) {

                textView27.visibility = View.GONE
            } else {

                textView27.visibility = View.VISIBLE
            }

            if (textView28.visibility == View.VISIBLE) {

                textView28.visibility = View.GONE
            } else {

                textView28.visibility = View.VISIBLE
            }

            if (textView29.visibility == View.VISIBLE) {

                textView29.visibility = View.GONE
            } else {

                textView29.visibility = View.VISIBLE
            }

            if (textView30.visibility == View.VISIBLE) {

                textView30.visibility = View.GONE
            } else {

                textView30.visibility = View.VISIBLE
            }

        }
    }
}