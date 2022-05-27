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
        categoryimage.setImageResource(R.drawable.expand)

        refreshnews.setOnRefreshListener {

            fetchData()
            mAdapter = Newsadapter(this)
            newsrecyclerview.adapter = mAdapter
            refreshnews.isRefreshing = false
            categoryhodenview.visibility = View.GONE
            newsrecyclerview.visibility = View.VISIBLE
            click = false

        }


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

                        categoryhodenview.visibility = View.GONE
                        newsrecyclerview.visibility = View.VISIBLE
                        click = false
                        categoryimage.setImageResource(R.drawable.search)
                        textcategory.text = "News for $text"
                    }

                    click = false
                    searchtext.text = null
                }

        categories.setOnClickListener {

            if(click == false ) {
                categoryhodenview.visibility = View.VISIBLE
                newsrecyclerview.visibility = View.GONE
                click = true
            }else if( click == true )
            {
                categoryhodenview.visibility = View.GONE
                newsrecyclerview.visibility = View.VISIBLE
                click = false
            }

        }
        general.setOnClickListener {
            categoryimage.setImageResource(R.drawable.expand)
            textcategory.text = "General News"
            url("general")
        }
        world.setOnClickListener {

            categoryimage.setImageResource(R.drawable.earth)
            textcategory.text = "World News"
            url("world")
        }
        business.setOnClickListener {

            categoryimage.setImageResource(R.drawable.growth)
            textcategory.text = "Business News"
            url("business")
        }
        health.setOnClickListener {

            categoryimage.setImageResource(R.drawable.healthcare)
            textcategory.text = "Health News"
            url("health")
        }
        entertainment.setOnClickListener {
            categoryimage.setImageResource(R.drawable.popcorn)
            textcategory.text = "Entertainment News"
            url("entertainment")
        }
        science.setOnClickListener {
            categoryimage.setImageResource(R.drawable.chemistry)
            textcategory.text = "Science News"
            url("science")
        }
        sports.setOnClickListener {
            categoryimage.setImageResource(R.drawable.sports)
            textcategory.text = "Sports News"
            url("sports")
        }
        technology.setOnClickListener {
            categoryimage.setImageResource(R.drawable.technology)
            textcategory.text = "Technology News"
            url("technology")
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
                        newsJsonObject.getString("urlToImage"),
                        newsJsonObject.getString("publishedAt")

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

    fun url( text: String) {

        categoryhodenview.visibility = View.GONE
        newsrecyclerview.visibility = View.VISIBLE
        click = false

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