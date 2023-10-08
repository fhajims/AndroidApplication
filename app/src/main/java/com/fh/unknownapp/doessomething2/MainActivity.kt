package com.fh.unknownapp.doessomething2


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {


    val videoURL = "https://www.youtube.com/watch?v=eaFefVzJ2Q8"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val videoView: VideoView = findViewById(R.id.videoview1)
        videoView.setVideoPath("android.resource://"
            +packageName+"/" + R.raw.campanella)


        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        mediaController.setMediaPlayer(videoView)
        videoView.setMediaController(mediaController)
        videoView.start()



    }
}