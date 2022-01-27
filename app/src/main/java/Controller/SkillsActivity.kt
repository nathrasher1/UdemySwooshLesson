package Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import app.swoosh.EXTRA_LEAGUE
import app.swoosh.EXTRA_SKILL
import app.swoosh.R
import kotlinx.android.synthetic.main.activity_skills.*

class SkillsActivity : BaseActivity() {
    var league = ""
    var selectedSkill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)
        league = intent.getStringExtra(EXTRA_LEAGUE)!!
        println(league)
    }

    fun onBeginnerBtnClicked(view: View){
        ballerBtn.isChecked = false
        selectedSkill = "beginner"
    }

    fun onBallerBtnClicked(view: View){
        beginnerBtn.isChecked = false
        selectedSkill = "baller"
    }

    fun onFinishClicked(view: View){
        if(selectedSkill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java )
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, selectedSkill)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Select skill level to continue!", Toast.LENGTH_SHORT).show()
        }
    }
}