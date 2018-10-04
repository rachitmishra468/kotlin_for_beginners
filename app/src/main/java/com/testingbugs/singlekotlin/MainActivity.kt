package com.testingbugs.singlekotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var n1=String;
    var n2 = String
    var to = String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var first_number = findViewById(R.id.first_number) as EditText
        var second_number = findViewById(R.id.second_number) as EditText
        var result = findViewById(R.id.editText3) as EditText

        var adding = findViewById(R.id.addtion) as Button
        var subtraction = findViewById(R.id.button4) as Button
        var multiply = findViewById(R.id.multiply) as Button
        var result_number = findViewById(R.id.result_number) as Button
        var restest = findViewById(R.id.restest) as Button
        result.setText("")
        first_number.setText("")
        second_number.setText("")

        adding.setOnClickListener {
            val  n1=first_number.text.toString()
            val  n2=second_number.text.toString()
            var resu = (n1.toInt() + n2.toInt()).toString()
            result.setText(resu)


        }

        subtraction.setOnClickListener {
            val  n1=first_number.text.toString()
            val  n2=second_number.text.toString()
            var resu = (n1.toInt() - n2.toInt()).toString()
            result.setText(resu.toString())
        }

        multiply.setOnClickListener {
            val  n1=first_number.text.toString()
            val  n2=second_number.text.toString()
            var resu = (n1.toInt() * n2.toInt()).toString()
            result.setText(resu)
        }

        restest.setOnClickListener {

            result.setText("0")
            first_number.setText("0")
            second_number.setText("0")

        }
        result_number.setOnClickListener {
val intent = Intent(this,ScrollingActivity::class.java)
            startActivity(intent)
        }
    }
}
