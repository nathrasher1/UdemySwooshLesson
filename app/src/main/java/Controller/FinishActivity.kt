package Controller

import Model.Player
import android.os.Bundle
import app.swoosh.EXTRA_PLAYER
import app.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!
        searchLeaguesText.text = "looking for a ${player.league} ${player.skill} league near you..."
    }
//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        outState.putParcelable(EXTRA_PLAYER, player)
//    }
//
//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//        super.onRestoreInstanceState(savedInstanceState)
//        if (savedInstanceState != null){
//            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
//        }
//    }
}