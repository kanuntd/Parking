package buu.informatics.s59161081.parking

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import buu.informatics.s59161081.parking.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val parking1: Parking = Parking("","","")
    private val parking2: Parking = Parking("","","")
    private val parking3: Parking = Parking("","","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.apply {
            nameText.visibility = View.GONE
            brandText.visibility = View.GONE
            licenseText.visibility = View.GONE
            updateButton.visibility = View.GONE
            deleteButton.visibility = View.GONE
        }

        clickParking1()


    }
    private fun clickParking1() {
        binding.apply {
            parking1Text.setOnClickListener {
                manageDetail(1)
            }
            parking2Text.setOnClickListener {
                manageDetail(2)
            }
            parking3Text.setOnClickListener {
                manageDetail(3)
            }


        }

//
//        updateButton.setOnClickListener {
//            parking1Text.setBackgroundResource(R.color.colorBusy)
//            parking1Text.setText(R.string.busy)
//        }

    }

    private fun manageDetail(numberP : Int){
        val updateButton = binding.updateButton
        val deleteButton = binding.deleteButton

        if(numberP == 1){
            binding.apply {
                parking = parking1
                updateButton.setOnClickListener {
                    if(nameText.text.toString() != "" && brandText.text.toString() != "" && licenseText.text.toString() != "") {
                        parking = parking1

                        parking1Text.setBackgroundResource(R.color.colorBusy)
                        parking1Text.setText(R.string.busy)
                        invalidateAll()
                    }

                }
                deleteButton.setOnClickListener {
                    parking1?.name = ""
                    parking1?.brand = ""
                    parking1?.license = ""

                    parking = parking1

                    parking1Text.setBackgroundResource(R.color.colorEmpty)
                    parking1Text.setText(R.string.available)
                    nameText.requestFocus()
                    invalidateAll()
                }


            }
        }
        else if(numberP == 2){
            binding.apply {
                parking = parking2
                updateButton.setOnClickListener {
                    if(nameText.text.toString() != "" && brandText.text.toString() != "" && licenseText.text.toString() != "") {
                        parking = parking2


                        parking2Text.setBackgroundResource(R.color.colorBusy)
                        parking2Text.setText(R.string.busy)
                        invalidateAll()
                    }

                }
                deleteButton.setOnClickListener {
                    parking2?.name = ""
                    parking2?.brand = ""
                    parking2?.license = ""

                    parking = parking2

                    parking2Text.setBackgroundResource(R.color.colorEmpty)
                    parking2Text.setText(R.string.available)
                    nameText.requestFocus()
                    invalidateAll()
                }

            }
        }
        else if(numberP == 3){
            binding.apply {

                parking = parking3
                updateButton.setOnClickListener {
                    if(nameText.text.toString() != "" && brandText.text.toString() != "" && licenseText.text.toString() != "") {
                        parking = parking3

                        parking3Text.setBackgroundResource(R.color.colorBusy)
                        parking3Text.setText(R.string.busy)
                        invalidateAll()
                    }

                }
                deleteButton.setOnClickListener {
                    parking3?.name = ""
                    parking3?.brand = ""
                    parking3?.license = ""

                    parking = parking3

                    parking3Text.setBackgroundResource(R.color.colorEmpty)
                    parking3Text.setText(R.string.available)
                    nameText.requestFocus()
                    invalidateAll()
                }

            }
        }
        binding.apply {
            nameText.visibility = View.VISIBLE
            brandText.visibility = View.VISIBLE
            licenseText.visibility = View.VISIBLE
            updateButton.visibility = View.VISIBLE
            deleteButton.visibility = View.VISIBLE
        }
//        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        inputMethodManager.hideSoftInputFromWindow(View.windowToken, 0)

    }


}
