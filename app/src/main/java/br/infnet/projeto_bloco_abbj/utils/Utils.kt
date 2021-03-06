package br.infnet.projeto_bloco_abbj.utils

import android.content.Context
import android.net.ConnectivityManager
import android.widget.Toast

object Utils {

    fun isNetworkConnected(context: Context): Boolean {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = cm.activeNetworkInfo
        return activeNetwork != null && activeNetwork.isConnected
    }

}