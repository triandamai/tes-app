package com.trian.component.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowRight
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.trian.component.R

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(topBar = {
        Row {
            Button(onClick = { /*....*/ }) {
                Image(
                    painter = painterResource(R.drawable.icon_box),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
            }


            Spacer(modifier = Modifier.width(55.dp))
            Text(
                text = "DON'T GIVE UP",
                fontSize = 24.sp,
                color = Color.Blue,
                modifier = Modifier.padding(0.dp, 10.dp)
            )

            Spacer(modifier = Modifier.width(35.dp))

            Button(onClick = {navController.navigate("pagenewgoal") }) {
                Icon(
                    Icons.Filled.ArrowRight,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
            }

        }


    }, bottomBar = {
        BottomNavigation(
            backgroundColor = Color.Blue,
            contentColor = Color.White
        ) {
            Icon(
                Icons.Filled.Home,
                contentDescription = null,
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp)
            )

            Icon(
                Icons.Filled.Notifications,
                contentDescription = null,
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp)
            )

        }

    }
    ) {
        Column {
            Spacer(modifier = Modifier.height(50.dp))
            Text(text = "2 Big Challenges", fontWeight = FontWeight.Bold, fontSize = 24.sp)
            Text(text = "ambitious person aren't you?", fontSize = 16.sp)

            Spacer(modifier = Modifier.height(50.dp))

            Row {
                Life()
                Spacer(modifier = Modifier.width(60.dp))
                Health()
            }
            Spacer(modifier = Modifier.height(30.dp))
            Column {
                Text(text = "Today's Planning", fontSize = 24.sp, fontWeight = FontWeight.ExtraBold)
                Text(text = "You have 3 actions to do", fontSize = 16.sp)
            }
            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier
                    .background(Color.LightGray)
                    .width(360.dp)
            ) {

                Image(
                    painter = painterResource(R.drawable.icon_lamp2),
                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                )
                Column {
                    Text(text = "Learn new skill", fontSize = 30.sp)
                    Text(
                        text = "Complete prototyping course ",
                        fontSize = 20.sp,
                        color = Color.DarkGray
                    )
                }
            }
            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier
                    .background(Color.LightGray)
                    .width(360.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.icon_bag),
                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                )
                Column {
                    Text(text = "New Design", fontSize = 30.sp)
                    Text(
                        text = "Create new app or web design",
                        fontSize = 20.sp,
                        color = Color.DarkGray
                    )

                }
            }
            Divider(
                color = Color.Black,
                thickness = 2.dp,
                modifier = Modifier.width(360.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .background(Color.LightGray)
                    .width(360.dp)
            ) {
                Spacer(modifier = Modifier.width(10.dp))
                Icon(
                    painter = painterResource(R.drawable.icon_timer),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Deadline", fontSize = 20.sp)
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "06 January 2022", fontSize = 20.sp)
                Spacer(modifier = Modifier.width(20.dp))
                Icon(
                    Icons.Filled.ArrowDropDown,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )

            }
        }


    }


}

@Composable
fun Life() {
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .width(150.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.icon_clock),
            contentDescription = null,
            modifier = Modifier
                .height(50.dp)
                .width(50.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Life Style", fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Become a morning", fontSize = 12.sp)
        Text(text = "person", fontSize = 12.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Reminder", fontSize = 10.sp, color = Color.DarkGray)
        Text(
            text = "Every Day",
            fontSize = 10.sp,
            color = Color.DarkGray,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Health() {
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .width(170.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.icon_heart),
            contentDescription = null,
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Healthy Life", fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Because your health", fontSize = 12.sp)
        Text(text = "is the most important", fontSize = 12.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Reminder", fontSize = 10.sp, color = Color.DarkGray)
        Text(
            text = "Every Day",
            fontSize = 10.sp,
            color = Color.DarkGray,
            fontWeight = FontWeight.Bold
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    HomeScreen(navController = rememberNavController())


}
