package com.example.myapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.module.family

@Composable
fun Crad(family: family){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .border(border = BorderStroke(2.dp, Color.Black))
            .background(color = Color.Green)
            .padding(12.dp)){
        Text(text = "name : ${family.name}", fontWeight = FontWeight.ExtraBold)
        Text(text = "age : ${family.age}", fontWeight = FontWeight.ExtraBold)
    }
}
@Preview
@Composable
fun Prev(){
    Crad(family(1,"test",16))
}