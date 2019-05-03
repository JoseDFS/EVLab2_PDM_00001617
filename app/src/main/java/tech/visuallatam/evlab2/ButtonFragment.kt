package tech.visuallatam.evlab2

import android.content.Context

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.view.*


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class ButtonFragment : Fragment() {

    fun initButton(container:View) {
        container.adelante.setOnClickListener {
            listenerTool?.adelante()
        }
        container.atras.setOnClickListener {
            listenerTool?.atras()
        }
    }

    var listenerTool : ChangeImgListener? = null

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_main, container, false)
    }



    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is ChangeImgListener) {
            listenerTool = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listenerTool = null
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                ButtonFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }

    interface ChangeImgListener {
        fun adelante(){}
        fun atras(){}
    }
}


