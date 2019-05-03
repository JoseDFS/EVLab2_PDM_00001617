package tech.visuallatam.evlab2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity(),ButtonFragment.ChangeImgListener {
     var imgs : Int =1
    private lateinit var mainFragment: ImgFragment
    private lateinit var mainContentFragment: ButtonFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainContentFragment = ButtonFragment()

        initMainFragment(imgs)

    }

    fun initMainFragment(imgs:Int) {
        mainFragment = ImgFragment.newInstance(imgs)
    }


}
