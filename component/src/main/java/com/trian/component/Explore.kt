package com.trian.component

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.trian.component.ui.theme.*

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Explore() {
    var value by remember { mutableStateOf("") }
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Shop,
        NavigationItem.Cart,
        NavigationItem.Account

    )
    Scaffold(
        bottomBar = {
            BottomNavigation(
                backgroundColor = Color.LightGray,
                contentColor = Color.Black
            ) {
                items.forEach { item ->
                    BottomNavigationItem(
                        icon = {
                            Icon(
                                painterResource(item.icon),
                                contentDescription = item.title,
                                modifier = Modifier.size(20.dp)
                            )
                        },
                        label = { Text(text = item.title) },
                        selectedContentColor = Color.Black,
                        unselectedContentColor = Color.Black.copy(0.4f),
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

            LazyColumn(
                contentPadding = PaddingValues(8.dp)
            )
            {

                gridItems(count = dataExplore.size, columnCount = 2) { index ->
                    Card(
                        modifier = Modifier
                            .height(230.dp)
                            .width(200.dp)
                            .padding(4.dp)
                            .border(BorderStroke(5.dp, Lightblue), RoundedCornerShape(10.dp))
                            .clickable {  },
                        backgroundColor = Color.Transparent

                    ) {
                        Column() {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Image(
                                    painter = painterResource(id = dataExplore[index].image),
                                    contentDescription = null,
                                    modifier = Modifier.size(100.dp)

                                )
                            }
                            Text(
                                text = dataExplore[index].name,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.SemiBold,
                                modifier = Modifier.padding(10.dp)
                            )

                            Text(
                                text = dataExplore[index].price.toString(),
                                fontSize = 12.sp,
                                modifier = Modifier.padding(10.dp)
                            )

                        }

                    }
                }
                item {
                    Spacer(modifier = Modifier.height(50.dp))
                }
            }

        }

    }

}


@OptIn(ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
fun PreviewExplore() {
    Explore()
}