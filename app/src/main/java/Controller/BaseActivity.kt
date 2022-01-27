package Controller

import Model.Player
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import app.swoosh.EXTRA_PLAYER

open class BaseActivity : AppCompatActivity() {
    //var player = Player
    val TAG = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "${javaClass.simpleName} onCreate")
        super.onCreate(savedInstanceState)
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

    override fun onRestart() {
        Log.d(TAG, "${javaClass.simpleName} onRestart")
        super.onRestart()
    }

    override fun onStart() {
        Log.d(TAG, "${javaClass.simpleName} onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "${javaClass.simpleName} onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "${javaClass.simpleName} onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "${javaClass.simpleName} onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "${javaClass.simpleName} onDestroy")
        super.onDestroy()
    }
}