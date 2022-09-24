package com.example.viewpagerhome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpagerhome.adapters.MyViewPagerAdapter
import com.example.viewpagerhome.databinding.ActivityMainBinding

import com.example.viewpagerhome.models.User

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var list: ArrayList<User>
    private lateinit var myViewPagerAdapter: MyViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()
        myViewPagerAdapter = MyViewPagerAdapter(list , supportFragmentManager)
        binding.myViewPager.adapter = myViewPagerAdapter

    }

    private fun loadData() {
        list = ArrayList()

        list.add(User(R.drawable.rasm_4 , "Xush kelibsiz" , "Kim ko‘rubdur, ey ko‘ngul, ahli jahondin yaxshilig‘, \n" +
                "Kimki, ondin yaxshi yo‘q, ko‘z tutma ondin yaxshilig‘"))

        list.add(User(R.drawable.rasm_3 , "Hikoyalar dunyosi" , "Gar zamonni nayf qilsam ayb qilma, ey rafiq, \n" +
                "Ko‘rmadim hargiz, netoyin, bu zamondin yaxshilig‘ ! "))
        list.add(User(R.drawable.rasm_2 , "Kitob ortidan.." , "Dilrabolardin yomonliq keldi mahzun ko‘ngluma,\n" +
                " Kelmadi jonimg'a hech oromi jondin yaxshilig'."))
        list.add(User(R.drawable.rasm_1 , "Bizga qo`shiling" , "Ey ko‘ngul, chun yaxshidin ko‘rdung yamonliq asru ko‘p,\n" +
                " Emdi ko‘z tutmoq ne ma’ni har yamondin yaxshilig'?"))
    }
}