package com.eslemarik.sehirplakakoduuygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.eslemarik.sehirplakakoduuygulamasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnInput.setOnClickListener {
            if(binding.etNumber.text.isNotEmpty()){
                var plakaKodu = binding.etNumber.text.toString().toInt()
                when(plakaKodu){
                    35 -> binding.textView.text = "İzmir"
                    45 -> binding.textView.text = "Manisa"
                    34 -> binding.textView.text = "İstanbul"
                    3 -> binding.textView.text = "Afyon"
                    9 -> binding.textView.text = "Aydın"
                    else -> {
                        Toast.makeText(this,"Bulunamadı",Toast.LENGTH_SHORT).show()
                    }
                }
            }
            else{
                Toast.makeText(this,"Alan boş",Toast.LENGTH_SHORT).show()
            }
            binding.etNumber.text.clear()
        }

    }
}