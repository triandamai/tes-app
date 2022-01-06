package com.trian.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Header (){
    Column (modifier= Modifier
        .fillMaxWidth()
        .padding(start = 16.dp, end = 16.dp)){
    Text(
        text = "March 9,2020",
        modifier = Modifier
            .height(36.dp)
            .width(228.dp),
        fontSize = 32.sp,
    )


    Text(text = "5 incomplete, 5 complete",
        modifier = Modifier
            .height(17.dp)
            .width(180.dp),
        fontSize = 14.sp,)
}

}

@Preview
@Composable
fun PreviewHeader(){
    Header()
}






