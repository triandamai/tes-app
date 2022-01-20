package com.trian.component

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreenUI(navController: NavController) {
    var search by remember {
        mutableStateOf("")
    }
    val items = listOf(
        NavigationItem.Shop,
        NavigationItem.Explore,
        NavigationItem.Cart,
        NavigationItem.Home,
        NavigationItem.Account

    )

    Scaffold(bottomBar = {
        BottomNavigation(
            backgroundColor = Black,
            contentColor = Black
        ) {
            items.forEach { item ->
                BottomNavigationItem(icon = {
                    Icon(
                        painterResource(id = item.icon),
                        contentDescription = item.title,
                        modifier = Modifier.size(20.dp),
                    )
                },
                    label = { Text(text = item.title) },
                    selectedContentColor = Color.White,
                    unselectedContentColor = Color.White.copy(0.4f),
                    alwaysShowLabel = true,
                    selected = false,
                    onClick = {
                        navController.navigate(item.route)
                    })


            }

        }

    }) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.dp, top = 40.dp, end = 20.dp, bottom = 20.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.carrot),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )

                Row {
                    Image(
                        painter = painterResource(id = R.drawable.exclude),
                        contentDescription = null,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))

                    Text(text = "Dhaka, Banassre")
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                TextField(
                    value = search,
                    onValueChange = { search = it },
                    label = { Text("Search Store") },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.magnifier),
                            contentDescription = null,
                            modifier = Modifier.size(15.dp)
                        )

                    },
                    textStyle = TextStyle(color = Black),
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(15.dp))
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Column(modifier = Modifier.clickable { }) {
                Image(
                    painter = painterResource(id = R.drawable.banner_rng),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(120.dp)
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            Row {
                Text(text = "Exclusive Offer", fontSize = 24.sp)
                Text(
                    text = "See all",
                    textAlign = TextAlign.End,
                    color = Color.Green,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 7.dp)
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            LazyRow(
                modifier = Modifier
                    .fillMaxSize()

            ) {
                items(dataExlusiveOffer) { item ->
                    Card(
                        modifier = Modifier
                            .padding(10.dp)
                            .border(BorderStroke(2.dp, Black), shape = RoundedCornerShape(10.dp))
                            .background(Transparent)
                            .clickable { }
                    ) {
                        Column(
                            modifier = Modifier
                                .width(180.dp)
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Image(
                                    painter = painterResource(id = item.image),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(120.dp)
                                        .padding(10.dp)
                                )
                            }
                            Column {
                                Text(
                                    text = item.name,
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Black,
                                    modifier = Modifier.padding(10.dp)
                                )
                                Text(
                                    text = item.price.toString(),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Black,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }


                        }


                    }

                }

            }
            Spacer(modifier = Modifier.height(30.dp))

            Row {
                Text(text = "Best Selling", fontSize = 24.sp)
                Text(
                    text = "See all",
                    textAlign = TextAlign.End,
                    color = Color.Green,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 7.dp)
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            LazyRow(
                contentPadding = PaddingValues(bottom = 50.dp),
                modifier = Modifier
                    .fillMaxSize()

            ) {
                items(dataBestSelling) { item ->
                    Card(
                        modifier = Modifier
                            .padding(10.dp)
                            .border(BorderStroke(2.dp, Black), shape = RoundedCornerShape(10.dp))
                            .background(Transparent)
                            .clickable { }

                    ) {
                        Column(
                            modifier = Modifier
                                .width(180.dp)
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Image(
                                    painter = painterResource(id = item.image),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(120.dp)
                                        .padding(10.dp)
                                )
                            }
                            Column {
                                Text(
                                    text = item.name,
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Black,
                                    modifier = Modifier.padding(10.dp)
                                )
                                Text(
                                    text = item.price.toString(),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Black,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }


                        }


                    }

                }

            }

        }
    }
}


@Preview
@Composable
fun Preview() {
    HomeScreenUI(navController = rememberNavController())

}



