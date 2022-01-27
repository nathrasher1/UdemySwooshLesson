package Controller

import android.os.Bundle
import app.swoosh.EXTRA_LEAGUE
import app.swoosh.EXTRA_SKILL
import app.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {
    var skill = ""
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        skill = intent.getStringExtra(EXTRA_SKILL)!!
        league = intent.getStringExtra(EXTRA_LEAGUE)!!
        println(skill)
        println(league)
        searchLeaguesText.text = "looking for a $league $skill near you..."
    }
}