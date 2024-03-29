package buu.informatics.s59160090.parkingv2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160090.parkingv2.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private  var myPark1: Park = Park("","","")
    private  var myPark2: Park = Park("","","")
    private  var myPark3: Park = Park("","","")
    var park = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        hide();
        binding.buttonPark1.setOnClickListener {
            binding.myPark = myPark1
            park = 1
            show()
            setColor()
        }

        binding.buttonPark2.setOnClickListener {
            binding.myPark = myPark2
            park = 2
            show()
            setColor()
        }

        binding.buttonPark3.setOnClickListener {
            binding.myPark = myPark3
            park = 3
            show()
            setColor()
        }
        binding.buttonUpdate.setOnClickListener{
            update(it)
            setColor()
        }

        binding.buttonDel.setOnClickListener {
            del(it)
            setColor()
        }
    }
    private fun update(view: View){
        binding.apply {
            if (park==1){
                myPark1.no = editText1.text.toString()
                myPark1.owner = editText2.text.toString()
                myPark1.tel = editText3.text.toString()
                myPark = myPark1
                if (!editText1.text.toString().equals("")){
                    buttonPark1.setText("ไม่ว่าง")
                }
            }else if (park==2){
                myPark2.no = editText1.text.toString()
                myPark2.owner = editText2.text.toString()
                myPark2.tel = editText3.text.toString()
                myPark = myPark2
                if (!editText1.text.toString().equals("")){
                    buttonPark2.setText("ไม่ว่าง")
                }


            }else{
                myPark3.no = editText1.text.toString()
                myPark3.owner = editText2.text.toString()
                myPark3.tel = editText3.text.toString()
                myPark = myPark3
                if (!editText1.text.toString().equals("")){
                    buttonPark3.setText("ไม่ว่าง")
                }

            }
        }
    }

    private fun del(view: View){
        binding.apply {
            if (park==1){
                myPark1.no = ""
                myPark1.owner = ""
                myPark1.tel = ""
                myPark = myPark1
                buttonPark1.setText("ว่าง")
            }else if (park==2){
                myPark2.no = ""
                myPark2.owner = ""
                myPark2.tel = ""
                myPark = myPark2
                buttonPark2.setText("ว่าง")
            }else{
                myPark3.no = ""
                myPark3.owner = ""
                myPark3.tel = ""
                myPark = myPark3
                buttonPark3.setText("ว่าง")
            }
        }
    }

    private fun hide(){
        binding.apply {
            textView.visibility = View.GONE
            textView2.visibility = View.GONE
            textView3.visibility = View.GONE
            editText1.visibility = View.GONE
            editText2.visibility = View.GONE
            editText3.visibility = View.GONE
            buttonUpdate.visibility = View.GONE
            buttonDel.visibility = View.GONE
        }

    }

    private fun show(){
        binding.apply {
            textView.visibility = View.VISIBLE
            textView2.visibility = View.VISIBLE
            textView3.visibility = View.VISIBLE
            editText1.visibility = View.VISIBLE
            editText2.visibility = View.VISIBLE
            editText3.visibility = View.VISIBLE
            buttonUpdate.visibility = View.VISIBLE
            buttonDel.visibility = View.VISIBLE
        }
    }
    private fun setColor(){
        binding.apply {
            if (myPark1.no.equals("")){
                buttonPark1.setBackgroundColor(Color.parseColor("#ff99cc00"))
            }else{
                buttonPark1.setBackgroundColor(Color.parseColor("#a9251d"))
            }

            if (myPark2.no.equals("")){
                buttonPark2.setBackgroundColor(Color.parseColor("#ff99cc00"))
            }else {

                buttonPark2.setBackgroundColor(Color.parseColor("#a9251d"))
            }
            if (myPark3.no.equals("")){
                buttonPark3.setBackgroundColor(Color.parseColor("#ff99cc00"))
            }else{

                buttonPark3.setBackgroundColor(Color.parseColor("#a9251d"))
            }

            if (park ==1 ){
                buttonPark1.setBackgroundColor(Color.parseColor("#673fff"))
            }else if (park == 2){
                buttonPark2.setBackgroundColor(Color.parseColor("#673fff"))
            }else{
                buttonPark3.setBackgroundColor(Color.parseColor("#673fff"))
            }
        }
    }
}