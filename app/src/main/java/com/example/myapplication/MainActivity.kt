package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val entered_age = findViewById<EditText>(R.id.editTextNumber)
        val history_button = findViewById<Button>(R.id.button)
        findViewById<TextView>(R.id.button2)
        val answer = findViewById<TextView>(R.id.textView)

        history_button?.setOnClickListener {
            val age = entered_age.text.toString().toInt()

            if (age < 20) {
                answer.text = "Error invalid age"}
            else if (entered_age.text.toString().toInt() >=100){
                history_button.text="Error invalid age"

            } else if (age == 39) {
                answer.text = "Brenda Fassie was a famous musician from South Africa"
            } else if (age == 36) {
                answer.text = "Marilyn Monroe was a famous American musician and icon "
            } else if (age == 81) {
                answer.text =
                    "Winnie Madikizela-Mandela was a South African anti-apartheid activist" +
                            " and Politician and the second wife of Nelspn Mandela"
            } else if (age == 43) {
                answer.text =
                    "Chadwick Boseman was an American actor and most famous for his role " +
                            "in Black Panther"
            } else if (age == 25) {
                answer.text =
                    "Augus Cloud was famous actor and is most famous for his role in Euphoria"
            } else if (age == 95) {
                answer.text = "Nelson Mandela was the first black South African president"
            } else if (age == 48) {
                answer.text = "Whitney Houston was a famous award winning American singer"
            } else if (age == 50) {
                answer.text =
                    "Michael Jackson was an American singer, songwriter, and dancer also" +
                            " known as the King of Pop"
            } else if (age == 82) {
                answer.text = "Pele was a Brazilian professional footballer and regarded as one" +
                        " of the greatest footballers in the world"
            } else {
                answer.text = "The age you have put does not match anyone in our database"
            }
            return@setOnClickListener


                entered_age.setText("")
                answer.setText(" ")
                return@setOnClickListener

            }



            }

            


        }

