package com.example.appupdate.CreateTelas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class mainscreen{

    @Composable
    fun mainscreen(name: String, modifier: Modifier) {
        Column {
            Text(
                text = "Lara\nBem vinda",
                modifier = modifier)

            Button(onClick = { Log.i("Botao funcionado", "botao clicando") }) {
                
            }
        }

}}