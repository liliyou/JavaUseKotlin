package lili.com.javausekotlin.KotlinModel

import android.util.Log
import lili.com.javausekotlin.JModel.Memento

/**
 * Created by xuyating on 2017/5/18.
 */

class Originator {
    var state: String? = null

    fun createMemento(): Memento {
        return Memento(state)
    }

    fun setMemento(memento: Memento) {
        state = memento.state
    }

    fun printState() {
        Log.i("state", "" + state!!)
    }
}
