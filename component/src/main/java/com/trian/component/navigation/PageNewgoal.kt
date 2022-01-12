package com.trian.component.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.trian.component.R
import com.trian.component.ui.theme.TesMultiModuleTheme
import com.trian.component.ui.theme.background


@Composable
fun PageNewgoal(navController: NavController){
    var text1 by remember { mutableStateOf("Water consumption") }
    var text2 by remember { mutableStateOf("Drink 5 cup water") }
    var text3 by remember { mutableStateOf("Every Day") }
    var text4 by remember { mutableStateOf("12 Months") }
    val items = listOf(
        NavigationItem.Home,
    )


    Scaffold(topBar =  {
        Row {
        Text(
            text = "New goal",
            modifier = Modifier
                .height(35.dp)
                .width(116.dp),
            fontSize = 24.sp
        )
        Spacer(
            modifier = Modifier
                .width(220.dp)

        )
        Button(
            onClick = {navController.navigate("homescreen")},
            // Uses ButtonDefaults.ContentPadding by default
            contentPadding = PaddingValues(
                start = 20.dp,
                top = 12.dp,
                end = 20.dp,
                bottom = 12.dp
            )


        ) {
            // Inner content including an icon and a text label
            Icon(
                Icons.Filled.ArrowBack,
                contentDescription = "",
                modifier = Modifier.size(ButtonDefaults.IconSize)

            )


        }
    }

    },
    bottomBar = {
        BottomNavigation(
        backgroundColor = Color.LightGray,
        contentColor = Color.White
    ) {
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = { Text(text = item.title) },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(0.4f),
                alwaysShowLabel = true,
                selected = false,
                onClick = {
                    /* Add code later */
                }
            )
        }
    }


    }
    ) {
        Column() {
            Spacer(
                modifier = Modifier
                    .height(100.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .fillMaxWidth())
            TextField(
                value = text1,
                onValueChange = { text1 = it },
                label = { Text("Goal title") }
            )
            Spacer(
                modifier = Modifier
                    .height(100.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .fillMaxWidth())
            TextField(
                value = text2,
                onValueChange = { text2 = it },
                label = { Text("Goal Description") }
            )
            Spacer(
                modifier = Modifier
                    .height(100.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .fillMaxWidth())
            TextField(
                value = text3,
                onValueChange = { text3 = it },
                label = { Text("Reminder") }
            )
            Spacer(
                modifier = Modifier
                    .height(100.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .fillMaxWidth())
            TextField(
                value = text4,
                onValueChange = { text4 = it },
                label = { Text("Maturity date") })
            Spacer(
                modifier = Modifier.height(50.dp))
            Text(text = "Goal Preview",
                modifier= Modifier,fontSize = 24.sp)
            Spacer(
                modifier = Modifier.height(1.dp))
            Row(modifier=Modifier.background(background)) {
                Image(painter = painterResource(id = R.drawable.back), contentDescription = null, modifier= Modifier.size(45.dp))
                Column {
                    Text(text = "Water Consumption")
                    Text(text = "Drink 5 cup water")
                }


            }

            Row(modifier=Modifier.background(background)) {
                Image(painter = painterResource(id = R.drawable.icon), contentDescription =null, modifier= Modifier
                    .size(20.dp)
                    .background(background))
                Text(text = "Deadline")
                Text(text = "1 January 2023")
            }
        }
    }
}

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home",R.drawable.check, "Home")
}



        @Preview(showBackground = true)
        @Composable
        fun PreviePage() {
           TesMultiModuleTheme {
               PageNewgoal(navController = rememberNavController())
           }

        }























