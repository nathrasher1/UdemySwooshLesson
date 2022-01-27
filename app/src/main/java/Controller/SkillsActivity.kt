package Controller

import Model.Player
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import app.swoosh.EXTRA_PLAYER
import app.swoosh.R
import kotlinx.android.synthetic.main.activity_skills.*

class SkillsActivity : BaseActivity() {
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)
        player = intent.getParcelableExtra(EXTRA_PLAYER)!!
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }

    fun onBeginnerBtnClicked(view: View){
        ballerBtn.isChecked = false
        player.skill = "beginner"
    }

    fun onBallerBtnClicked(view: View){
        beginnerBtn.isChecked = false
        player.skill= "baller"
    }

    fun onFinishClicked(view: View){
        if(beginnerBtn.isChecked || ballerBtn.isChecked && player.skill != null){
            val finishActivity = Intent(this, FinishActivity::class.java )
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Select skill level to continue!", Toast.LENGTH_SHORT).show()
        }
    }
}