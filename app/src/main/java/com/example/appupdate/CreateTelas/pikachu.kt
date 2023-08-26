package com.example.appupdate.createTelas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun pikachu(){
    var pikachuInitialValue by remember {
        mutableStateOf("")
    }

    Column {
        Text(text= "Tarefa")

        TextField(
            value = pikachuInitialValue,
        onValueChange = {
            pikachuInitialValue = it
        },
            maxLines = 2,

            )


        Text(text= pikachuInitialValue)
    }
    }
