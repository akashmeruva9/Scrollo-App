package com.example.scrollo


import android.content.Intent
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
                "Cricket",
                "https://instagram.fhyd1-2.fna.fbcdn.net/v/t50.2886-16/280276895_563181258717289_8323975010330784601_n.mp4?_nc_ht=instagram.fhyd1-2.fna.fbcdn.net&_nc_cat=101&_nc_ohc=oX9X5A5fl9gAX-4vJWM&edm=APfKNqwBAAAA&ccb=7-5&oe=628D3ACA&oh=00_AT_4eHaYAt1FtQoBobpLgjnX-_ktsFkA8MBB9EyEe-yXfA&_nc_sid=74f7ba",
                "Longest Sixes....."
            )
        )
        videolist.add(
            Reels(
                "Ocean",
                "https://instagram.fhyd1-2.fna.fbcdn.net/v/t50.2886-16/280241269_445135757613804_5874149708579490507_n.mp4?_nc_ht=instagram.fhyd1-2.fna.fbcdn.net&_nc_cat=100&_nc_ohc=K0UePX6zz7EAX8H6TRU&edm=APfKNqwBAAAA&ccb=7-5&oe=628D7F42&oh=00_AT8scm3ky2qzEir6jRXSqlkubXbft3co43kIyfOITXZtWg&_nc_sid=74f7ba",
                "Waves...."
            )
        )

        videolist.add(
            Reels(
                "Food",
                "https://instagram.fhyd1-3.fna.fbcdn.net/v/t50.2886-16/280238175_348424323938913_8310330240285462069_n.mp4?_nc_ht=instagram.fhyd1-3.fna.fbcdn.net&_nc_cat=109&_nc_ohc=wiR6y2k1CeoAX8NobQH&edm=APfKNqwBAAAA&ccb=7-5&oe=628D8E1A&oh=00_AT_k7cQjQjd8x5iNhWb5Fdpe8NPl55AhLWGKErjP5gLfvQ&_nc_sid=74f7ba",
                "Cut those Mangoes.."
            )
        )
        videolist.add(
            Reels(
                "Nature",
                "https://instagram.fhyd1-2.fna.fbcdn.net/v/t50.2886-16/283165962_134337112533613_172185488365783245_n.mp4?_nc_ht=instagram.fhyd1-2.fna.fbcdn.net&_nc_cat=101&_nc_ohc=wlTxFcEgkB4AX_QGI9p&edm=APfKNqwBAAAA&ccb=7-5&oe=628D5660&oh=00_AT-ua6Yn4ixIRyQh27xM2-yIHwDvFSnPV5N0suvU0LP4Xw&_nc_sid=74f7ba",
                "Maldives..."
            )
        )
        videolist.add(
            Reels(
                "Sunset",
                "https://instagram.fhyd1-4.fna.fbcdn.net/v/t50.2886-16/279319884_717411516098570_1932426227830598780_n.mp4?_nc_ht=instagram.fhyd1-4.fna.fbcdn.net&_nc_cat=102&_nc_ohc=BHPqGDcRPPcAX_p7JBK&edm=APfKNqwBAAAA&ccb=7-5&oe=628D8902&oh=00_AT_333dqT0C20Z0ndmddSbdmC7Nh1DeqqxU6LFPP73fkIw&_nc_sid=74f7ba",
                "Beautiful resort...."
            )
        )
        videolist.add(
            Reels(
                "Adventure",
                "https://instagram.fhyd1-3.fna.fbcdn.net/v/t50.2886-16/279939933_166193772448372_248675554389109286_n.mp4?_nc_ht=instagram.fhyd1-3.fna.fbcdn.net&_nc_cat=104&_nc_ohc=goSiSmLVGjAAX85jBGj&edm=APfKNqwBAAAA&ccb=7-5&oe=628DA8B9&oh=00_AT_bSQUz5rshz6-iXMcwX02NiW7iSwhQVQYDmxEMETYEFQ&_nc_sid=74f7ba",
                "Crazy rides...."
            )
        )
        videolist.add(
            Reels(
                "Adventure",
                "https://instagram.fhyd1-4.fna.fbcdn.net/v/t50.2886-16/281461317_1156128318262306_6775956665258320946_n.mp4?_nc_ht=instagram.fhyd1-4.fna.fbcdn.net&_nc_cat=110&_nc_ohc=raMBzd2wWjwAX9NSbDN&edm=APfKNqwBAAAA&ccb=7-5&oe=628D1868&oh=00_AT8mVn_7PZGud1nA2v5-YYa0GViilravdCoU5ih129Hvfg&_nc_sid=74f7ba",
                "Take adventures seriously......"
            )
        )
        videolist.add(
            Reels(
                "Crciket",
                "https://instagram.fhyd1-4.fna.fbcdn.net/v/t50.2886-16/283281220_966075157420762_6732485465727635728_n.mp4?_nc_ht=instagram.fhyd1-4.fna.fbcdn.net&_nc_cat=110&_nc_ohc=H3bniY6ky_sAX_4kH-F&edm=APfKNqwBAAAA&ccb=7-5&oe=628D1D2A&oh=00_AT-H3Y3eClCElr0mayVRcIO_A2i9vRynC4Mh-KVZuCnGlA&_nc_sid=74f7ba",
                "Jofra god..."
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