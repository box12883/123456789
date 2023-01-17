package com.example.calculator_v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var str: String
        var temp: String

        nam1.setOnClickListener {
            temp = "1"
            if (t_dis.text.toString().toInt() == 0) {
                t_dis.setText(temp)
            } else {
                str = t_dis.text.toString().plus(temp)
                t_dis.setText(str)
            }

        }
        clear.setOnClickListener {
            t_dis.setText("0")
        }
        nam2.setOnClickListener {
            temp = "2"
            if (t_dis.text.toString().toInt() == 0) {
                t_dis.setText(temp)
            } else {
                str = t_dis.text.toString().plus(temp)
                t_dis.setText(str)
            }
        }
        nam3.setOnClickListener {
            temp = "3"
            if (t_dis.text.toString().toInt() == 0) {
                t_dis.setText(temp)
            } else {
                str = t_dis.text.toString().plus(temp)
                t_dis.setText(str)
            }
        }
        zero.setOnClickListener {
            temp = "0"
            if (t_dis.text.toString().toInt() == 0) {
                t_dis.setText(temp)
            } else {
                str = t_dis.text.toString().plus(temp)
                t_dis.setText(str)
            }
        }
        nam4.setOnClickListener {
            temp = "4"
            if (t_dis.text.toString().toInt() == 0) {
                t_dis.setText(temp)
            } else {
                str = t_dis.text.toString().plus(temp)
                t_dis.setText(str)
            }
        }
        nam5.setOnClickListener {
            temp = "5"
            if (t_dis.text.toString().toInt() == 0) {
                t_dis.setText(temp)
            } else {
                str = t_dis.text.toString().plus(temp)
                t_dis.setText(str)
            }
        }
        nam6.setOnClickListener {
            temp = "6"
            if (t_dis.text.toString().toInt() == 0) {
                t_dis.setText(temp)
            } else {
                str = t_dis.text.toString().plus(temp)
                t_dis.setText(str)
            }
        }
        nam7.setOnClickListener {
            temp = "7"
            if (t_dis.text.toString().toInt() == 0) {
                t_dis.setText(temp)
            } else {
                str = t_dis.text.toString().plus(temp)
                t_dis.setText(str)
            }
        }
        nam8.setOnClickListener {
            temp = "8"
            if (t_dis.text.toString().toInt() == 0) {
                t_dis.setText(temp)
            } else {
                str = t_dis.text.toString().plus(temp)
                t_dis.setText(str)
            }
        }
        nam9.setOnClickListener {
            temp = "9"
            if (t_dis.text.toString().toInt() == 0) {
                t_dis.setText(temp)
            } else {
                str = t_dis.text.toString().plus(temp)
                t_dis.setText(str)
            }
        }
        nam1.setOnClickListener {
            temp = "1"
            if (t_dis.text.toString().toInt() == 0) {
                t_dis.setText(temp)
            } else {
                str = t_dis.text.toString().plus(temp)
                t_dis.setText(str)
            }
        }
        delete.setOnClickListener{
            if (t_dis.text.length !=1) {
                str = t_dis.text.toString().dropLast(1)
                t_dis.setText(str)
            }
            else{
                str = "0"
                t_dis.setText(str)
            }

        }
    }
}