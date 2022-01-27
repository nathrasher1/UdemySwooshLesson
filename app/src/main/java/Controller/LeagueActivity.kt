package Controller

import Model.Player
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import app.swoosh.EXTRA_PLAYER
import app.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var player = Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
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

    fun leagueNextClicked(view: View){
        if(mensLeagueBtn.isChecked || womensLeagueBtn.isChecked || coedLeagueBtn.isChecked && player.league != null){
            val skillActivity = Intent(this, SkillsActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Select league to continue!", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMensClicked(view: View){
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "mens"

    }

    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "womens"
    }

    fun onCoedClicked(view: View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        player.league = "co-ed"
    }
}