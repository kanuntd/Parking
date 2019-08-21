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
        binding.parking = parking1
        binding.parking = parking2
        binding.parking = parking3

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
                nameText.setText(parking1.name)
                brandText.setText(parking1.brand)
                licenseText.setText(parking1.license)

                updateButton.setOnClickListener {
                    if(nameText.text.toString() != "" && brandText.text.toString() != "" && licenseText.text.toString() != "") {
                        parking1?.name = nameText.text.toString()
                        parking1?.brand = brandText.text.toString()
                        parking1?.license = licenseText.text.toString()


                        parking1Text.setBackgroundResource(R.color.colorBusy)
                        parking1Text.setText(R.string.busy)
                        invalidateAll()
                    }

                }


            }
        }
        else if(numberP == 2){
            binding.apply {
                nameText.setText(parking2.name)
                brandText.setText(parking2.brand)
                licenseText.setText(parking2.license)

                updateButton.setOnClickListener {
                    parking2?.name = nameText.text.toString()
                    parking2?.brand = brandText.text.toString()
                    parking2?.license = licenseText.text.toString()

                    parking2Text.setBackgroundResource(R.color.colorBusy)
                    parking2Text.setText(R.string.busy)

                }

            }
        }
        else if(numberP == 3){
            binding.apply {
                nameText.setText(parking3.name)
                brandText.setText(parking3.brand)
                licenseText.setText(parking3.license)

                updateButton.setOnClickListener {
                    parking3?.name = nameText.text.toString()
                    parking3?.brand = brandText.text.toString()
                    parking3?.license = licenseText.text.toString()

                    parking3Text.setBackgroundResource(R.color.colorBusy)
                    parking3Text.setText(R.string.busy)

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
