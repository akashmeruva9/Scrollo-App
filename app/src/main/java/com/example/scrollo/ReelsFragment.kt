package com.example.scrollo


import android.content.ContentResolver
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_reels.*


class ReelsFragment : Fragment(R.layout.fragment_reels) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_reels, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var videolist: ArrayList<Reels> = ArrayList()


        videolist.add(
            Reels(
                "Nature",
                Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + resources.getResourcePackageName(R.raw.video1) + '/' + resources.getResourceTypeName(R.raw.video1) + '/' + resources.getResourceEntryName(R.raw.video1)) ,
                "Silence....."
            )
        )
        videolist.add(
            Reels(
                "Adventure",
                Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + resources.getResourcePackageName(R.raw.video2) + '/' + resources.getResourceTypeName(R.raw.video2) + '/' + resources.getResourceEntryName(R.raw.video2)) ,
                "Mind Blowing..."
            )
        )

        videolist.add(
            Reels(
                "Food",
                Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + resources.getResourcePackageName(R.raw.video3) + '/' + resources.getResourceTypeName(R.raw.video3) + '/' + resources.getResourceEntryName(R.raw.video3)) ,
                 "Ripe Mangoes..."
            )
        )
        videolist.add(
            Reels(
                "Nature",
                Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + resources.getResourcePackageName(R.raw.video4) + '/' + resources.getResourceTypeName(R.raw.video4) + '/' + resources.getResourceEntryName(R.raw.video4)) ,
                "Maldives..."
            )
        )
        videolist.add(
            Reels(
                "Adventure",
                Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + resources.getResourcePackageName(R.raw.video5) + '/' + resources.getResourceTypeName(R.raw.video5) + '/' + resources.getResourceEntryName(R.raw.video5)) ,
                "Crazy rides...."
            )
        )
        videolist.add(
            Reels(
                "Nature",
                Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + resources.getResourcePackageName(R.raw.video6) + '/' + resources.getResourceTypeName(R.raw.video6) + '/' + resources.getResourceEntryName(R.raw.video6)) ,
                "Maldives , beauty.."
            )
        )
        videolist.add(
            Reels(
                "Cricket",
                Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + resources.getResourcePackageName(R.raw.video7) + '/' + resources.getResourceTypeName(R.raw.video7) + '/' + resources.getResourceEntryName(R.raw.video7)) ,
                "Jofra god..."
            )
        )
        videolist.add(
            Reels(
                "Oceans",
                Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + resources.getResourcePackageName(R.raw.video8) + '/' + resources.getResourceTypeName(R.raw.video8) + '/' + resources.getResourceEntryName(R.raw.video8)) ,
                "Waves...."
            )
        )
        videolist.add(
            Reels(
                "Crciket",
                Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + resources.getResourcePackageName(R.raw.video9) + '/' + resources.getResourceTypeName(R.raw.video9) + '/' + resources.getResourceEntryName(R.raw.video9)) ,
                "Longest Sixes....."
            )
        )

        var adapter = reelsadapter( this , videolist)
        reelsviewpager.adapter = adapter


    }


    fun shareReel(view: String) {
        val memeIntent = Intent(Intent.ACTION_SEND)
        memeIntent.type = "text/plain"
        memeIntent.putExtra(Intent.EXTRA_TEXT, view)
        startActivity(Intent.createChooser(memeIntent, "Share this meme with"))
    }
}