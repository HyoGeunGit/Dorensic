package kr.co.highton.slacks.sim

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.chrisbanes.photoview.PhotoView

/**
 * Created by Kinetic on 2018-06-02.
 */

class VideoFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_video, container, false)

        val photoView = (R.id.map) as PhotoView
        photoView.setImageResource(R.drawable.cam)
    }
}