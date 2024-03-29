package com.aldrin.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.aldrin.swoosh.Library.EXTRA_LEAGUE
import com.aldrin.swoosh.Library.EXTRA_SKILL
import com.aldrin.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false
        skill = "beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        skill = "baller"
    }

    fun onSkillFinishClicked(view: View) {
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a Skill.", Toast.LENGTH_SHORT).show()
        }
    }
}
