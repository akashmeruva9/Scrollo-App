package com.example.scrollo

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.browser.customtabs.CustomTabsIntent
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.AuthFailureError
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import kotlinx.android.synthetic.main.fragment_newsfragment.*


class newsfragment : Fragment(R.layout.fragment_newsfragment) {

    private lateinit var mAdapter: Newsadapter
    var url = "https://newsapi.org/v2/top-headlines?country=in&apiKey=201256b3bb1a41689dd3627e24015b06"
    var click = false
    lateinit var currentMemeUrl: String
    lateinit var myadapter: Memeadapter

    @SuppressLint("InflateParams")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v = inflater.inflate(R.layout.fragment_newsfragment , null)
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        newsrecyclerview.layoutManager =  LinearLayoutManager(activity)
        fetchData()
        mAdapter = Newsadapter(this)
        newsrecyclerview.adapter = mAdapter

        refreshnews.setOnRefreshListener {

            fetchData()
            mAdapter = Newsadapter(this)
            newsrecyclerview.adapter = mAdapter
            refreshnews.isRefreshing = false
        }

        searchbutton.setOnClickListener {

            if (click == false) {
                click = true
            }else if (click == true )
            {
                searchbox.visibility = View.INVISIBLE
                click = false
            }

            if (click == true) {
                searchbox.visibility = View.VISIBLE

                evaluate.setOnClickListener {

                    val text: String = searchtext.text.toString()
                    val size = text.length

                    if (text.trim().isNullOrEmpty()) {
                        searchtext.error = "Invalid"
                    }else if (text != null)
                    {
                        url = "https://newsapi.org/v2/everything?q=$text&sortBy=publishedAt&apiKey=201256b3bb1a41689dd3627e24015b06"
                        fetchData()
                        mAdapter = Newsadapter(this)
                        newsrecyclerview.adapter = mAdapter
                        searchbox.visibility = View.GONE
                    }

                    url = "https://newsapi.org/v2/top-headlines?country=in&apiKey=201256b3bb1a41689dd3627e24015b06"
                    click = false
                    searchtext.text = null
                }

            }
        }

        general.setOnClickListener {
            url(general)
        }
        world.setOnClickListener {
            url(world)
        }
        business.setOnClickListener {
            url(business)
        }
        health.setOnClickListener {
            url(health)
        }
        entertainment.setOnClickListener {
            url(entertainment)
        }
        science.setOnClickListener {
            url(science)
        }
        sports.setOnClickListener {
            url(sports)
        }
        technology.setOnClickListener {
            url(technology)
        }
    }

    fun shareNews(view: String) {
        val memeIntent = Intent(Intent.ACTION_SEND)
        memeIntent.type = "text/plain"
        memeIntent.putExtra(Intent.EXTRA_TEXT, "$view")
        startActivity(Intent.createChooser(memeIntent, "Share this meme with"))
    }

    private fun fetchData() {

        val jsonObjectRequest = object : JsonObjectRequest(
            Request.Method.GET, url, null,

            { response ->
                val newsJsonArray = response.getJSONArray("articles")
                val newsArray = ArrayList<News>()
                for (i in 0 until newsJsonArray.length()) {
                    val newsJsonObject = newsJsonArray.getJSONObject(i)
                    val news = News(
                        newsJsonObject.getString("title"),
                        newsJsonObject.getString("author"),
                        newsJsonObject.getString("url"),
                        newsJsonObject.getString("urlToImage")
                    )
                    newsArray.add(news)
                }

                mAdapter.update(newsArray)

            },
            {
                Toast.makeText(activity, "InvalidSearch", Toast.LENGTH_SHORT).show()
                url = "https://newsapi.org/v2/top-headlines?sources=google-news&apiKey=201256b3bb1a41689dd3627e24015b06"

            }) {
            @Throws(AuthFailureError::class)
            override fun getHeaders(): Map<String, String>? {
                val headers = HashMap<String, String>()
                headers["User-Agent"] = "Mozilla/5.0"
                return headers
            }
        }
        activity?.let { MySingleton.getInstance(it).addToRequestQueue(jsonObjectRequest) }
    }

    fun onItemClicked(item: News) {
        val builder = CustomTabsIntent.Builder()
        val customTabsIntent = builder.build()
        activity?.let { customTabsIntent.launchUrl(it, Uri.parse(item.url)) }
    }

    fun url(view: View) {


        val text: String = (view as Button).text as String
        if (text != "world") {
            url = "https://newsapi.org/v2/top-headlines?country=in&category=$text&apiKey=201256b3bb1a41689dd3627e24015b06"
        } else {
            url = "https://newsapi.org/v2/top-headlines?sources=google-news&apiKey=201256b3bb1a41689dd3627e24015b06"
        }
        fetchData()
        mAdapter = Newsadapter(this)
        newsrecyclerview.adapter = mAdapter

        refreshnews.isRefreshing = false

    }

}