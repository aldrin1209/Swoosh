package com.aldrin.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aldrin.swoosh.Library.EXTRA_LEAGUE
import com.aldrin.swoosh.Library.EXTRA_SKILL
import com.aldrin.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill near you..."
    }
}
