package jp.techacademy.kentaro.kawamura.aisatsuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.TimePickerDialog
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        showTPD()

    }

    private fun showTPD() {
        val TPD = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                if (2<=hour&&hour<=9){text1.text="おはよう"}
                else if (10<=hour&&hour<=17){text1.text="こんにちは"}
                else if (18<=hour&&hour<=23){text1.text="こんばんは"}
                else if (0<=hour&&hour<=1){text1.text="こんばんは"}
            },
            13,
            0,
            true
        )
        TPD.show()
    }
}