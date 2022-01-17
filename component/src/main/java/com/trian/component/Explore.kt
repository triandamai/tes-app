package com.trian.component

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.trian.component.ui.theme.*

@Composable
fun Explore() {
    var value by remember { mutableStateOf("") }
    val items = listOf(
    NavigationItem.Home,
    )
    Scaffold(
        bottomBar = {
            BottomNavigation(
                backgroundColor = Color.LightGray,
                contentColor = Color.Black
            ) {
                items.forEach { item ->
                    BottomNavigationItem(
                        icon = { Icon(painterResource(R.drawable.vector__3_), contentDescription =null, modifier = Modifier.size(20.dp)) },
                        label = { Text(text = "Cart") },
                        selectedContentColor = Color.Black,
                        unselectedContentColor = Color.Black.copy(0.4f),
                        alwaysShowLabel = true,
                        selected = false,
                        onClick = {
                            /* Add code later */
                        }
                    )
                }}}
    ) {

        Column(
            modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 50.dp, bottom = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Text(text = "Find Product", fontWeight = FontWeight.Bold, fontSize = 20.sp)
            Spacer(modifier = Modifier.height(20.dp))
            Row() {

                TextField(


                    value = value,
                    leadingIcon = {
                        Image(
                            painter = painterResource(R.drawable.vector__2_),
                            contentDescription = null,
                            modifier = Modifier.size(20.dp)
                        )

                    },
                    onValueChange = { value = it },
                    label = { Text("Search Store") },
                    maxLines = 2,
                    textStyle = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .fillMaxWidth()

                )

            }
            Spacer(modifier = Modifier.height(20.dp))
            Row() {
                Column(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .border(border=BorderStroke(3.dp, Limegreen), shape = RoundedCornerShape(15.dp))
                        .background(Limegreen.copy(alpha = 0.5f))
                        .clickable {

                        }, horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pngfuel_6),
                        contentDescription = null,
                        Modifier.size(135.dp)
                    )
                    Text(text = "Fresh Fruits", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    Text(text = "& Vegetable", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.width(84.dp))
                Column(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .border(border=BorderStroke(3.dp, Cyanorange), shape = RoundedCornerShape(15.dp))
                        .background(Cyanorange.copy(alpha = 0.5f))
                        .clickable {

                        }, horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.group_6835),
                        contentDescription = null,
                        Modifier.size(135.dp)
                    )
                    Text(text = "Cooking oil", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    Text(text = "& Ghee", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.height(20.dp))
            Row() {
                Column(modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .border(border=BorderStroke(3.dp, Lightorange), shape = RoundedCornerShape(15.dp))
                    .background(Lightorange.copy(alpha = 0.5f))
                    .clickable {

                    }, horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pngfuel_9),
                        contentDescription = null,
                        Modifier.size(135.dp)
                    )
                    Text(text = "Meat & Fish", fontSize = 16.sp, fontWeight = FontWeight.Bold)

                }
                Spacer(modifier = Modifier.width(84.dp))
                Column(modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .border(border=BorderStroke(3.dp, Lightpurple), shape = RoundedCornerShape(15.dp))
                    .background(Lightpurple.copy(alpha = 0.5f))
                    .clickable {

                    }, horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pngfuel_6__1_),
                        contentDescription = null,
                        Modifier.size(135.dp)
                    )
                    Text(text = "Bakery & Snacks", fontSize = 16.sp, fontWeight = FontWeight.Bold)

                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row() {
                Column(modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .border(border=BorderStroke(3.dp, Lightyellow), shape = RoundedCornerShape(15.dp))
                    .background(Lightyellow.copy(alpha = 0.5f))
                    .clickable {

                    }, horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pngfuel),
                        contentDescription = null,
                        Modifier.size(135.dp)
                    )
                    Text(text = "Dairy & Eggs", fontSize = 16.sp, fontWeight = FontWeight.Bold)

                }
                Spacer(modifier = Modifier.width(84.dp))
                Column(modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .border(border=BorderStroke(3.dp, Lightblue), shape = RoundedCornerShape(15.dp))
                    .background(Lightblue.copy(alpha = 0.5f))
                    .clickable {

                    }, horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pngfuel_6__3_),
                        contentDescription = null,
                        Modifier.size(135.dp)
                    )
                    Text(text = "Beverages", fontSize = 16.sp, fontWeight = FontWeight.Bold)

                }

            }

        }
    }
}
sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home",R.drawable.check, "Home")
}
    @Preview(showBackground = true)
    @Composable
    fun PreviewExplore() {
        Explore()
    }
