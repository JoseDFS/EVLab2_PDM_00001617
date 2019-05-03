package tech.visuallatam.evlab2

import android.media.Image
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tech.visuallatam.evlab2.R
import kotlinx.android.synthetic.main.fragment_img.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class ImgFragment : Fragment() {
    var img: Int = 0

    companion object {
        fun newInstance(img:Int): ImgFragment{
            val newFragment = ImgFragment()
            newFragment.img = img
            return newFragment
        }
    }

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_img, container, false)

        bindData(view)

        return view
    }

    fun bindData(view: View){

        //if (img ==1 ) view.imagen.setImageResource(R.drawable.2046971)
    }
}
