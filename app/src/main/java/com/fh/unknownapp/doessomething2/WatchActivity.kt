package com.fh.unknownapp.doessomething2

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.media3.common.MediaItem
import androidx.media3.common.MimeTypes
import androidx.media3.datasource.DefaultDataSource
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.source.ProgressiveMediaSource
import androidx.media3.ui.PlayerView

//import com.google.android.exoplayer2.ExoPlayer
//import com.google.android.exoplayer2.SimpleExoPlayer
//import com.google.android.exoplayer2.ui.PlayerView


class WatchActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_watch)
        val playerView= findViewById<PlayerView>(R.id.player)
        val progressBar= findViewById<ProgressBar>(R.id.progress_bar)
        val bt_fullscreen = findViewById<ImageView>(R.id.bt_fullscreen)
        val bt_lockscreen = findViewById<ImageView>(R.id.exo_lock)

        val player= ExoPlayer.Builder(this)
            .build()
        playerView.player = player

        val mediaItem = MediaItem.Builder()
            .setUri("https://www.youtube.com/watch?v=eaFefVzJ2Q8")
            .setMimeType(MimeTypes.APPLICATION_MP4)

       
/*
        val dataSource = DefaultDataSource.Factory(this)
        val mediaSource = ProgressiveMediaSource.Factory(dataSource).createMediaSource(MediaItem.fromUri(
            Uri.parse("asset:///$//www.youtube.com/watch?v=eaFefVzJ2Q8")))
        player.setMediaItem(mediaItem)
        player.prepare()
        player.play()
*/

       /* playerView.keepScreenOn = true
        simpleExoPlayer.addListener(object: Player.Listener {
            override fun onPlayerStateChanged(playWhenReady: Boolean, playbackState: Int) {
                super.onPlayerStateChanged(playWhenReady, playbackState)
                {if(playbackState == Player.STATE_BUFFERING)
                {progress}
                }
            }
        } */
    }
}