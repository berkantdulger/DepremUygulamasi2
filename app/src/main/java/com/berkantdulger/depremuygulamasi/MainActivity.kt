package com.berkantdulger.depremuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import com.berkantdulger.depremuygulamasi.databinding.ActivityKayitOlBinding
import com.berkantdulger.depremuygulamasi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        val sayfam= binding.root
        setContentView(sayfam)

       binding.btnKyt.setOnClickListener{
           val sayfaiki=Intent(applicationContext,kayitOl::class.java)
           startActivity(sayfaiki)
       }
        binding.yardMseverGiris.setOnClickListener{
            val yardımseversayfa=Intent(applicationContext,HosgeldinizEkrani::class.java)
            startActivity(yardımseversayfa)
        }

        // Eğer girilen kullanıcı adı,şifre sistemde kayıtlı ve tüm bilgileri doğru girdiye.
        // Bilgileri güncelleme ekranına gidecek.
        //Fakat veritabanında hata aldığımız için bu işlemi gerçekleştiremiyoruz.
        //Veritbanımız çalışıyor olsaydı tüm verileri veri tabanından çekip güncelleme işlemide yapabilicektik.
        binding.btnGiris.setOnClickListener{
            val guncelle=Intent(applicationContext,Duzenle::class.java)
            startActivity(guncelle)
        }

    }
}