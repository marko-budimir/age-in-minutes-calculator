package hr.ferit.markobudimir.ageinminutescalc

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDatePicker : Button = findViewById(R.id.btnDatePicker)

        btnDatePicker.setOnClickListener {
            clickDatePicker()
        }
    }

    fun clickDatePicker(){
        val myCalender = Calendar.getInstance()
        val year = myCalender.get(Calendar.YEAR)
        val month = myCalender.get(Calendar.MONTH)
        val day = myCalender.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, month, day ->
            Toast.makeText(this, "btnDatePciker pressed", Toast.LENGTH_LONG).show()
        }, year, month, day ).show()

    }
}