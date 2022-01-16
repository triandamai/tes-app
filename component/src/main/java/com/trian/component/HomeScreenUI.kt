package com.trian.component

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreenUI() {
    var search by remember {
        mutableStateOf("Search Store")
    }
    val items = listOf(
        NavigationItem.Shop,
        NavigationItem.Explore,
        NavigationItem.Cart,
        NavigationItem.Favourite,
        NavigationItem.Account

    )
    Scaffold(bottomBar = {
        BottomNavigation(
            backgroundColor = Color.Black,
            contentColor = Color.Black
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
                    onClick = { })


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
                    modifier = Modifier.size(30.dp)
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
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.magnifier),
                            contentDescription = null,
                            modifier = Modifier.size(18.dp)
                        )

                    },
                    colors = TextFieldDefaults.textFieldColors(
                        Color.Black
                    ),
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

            Row {
                Column(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .border(
                            border = BorderStroke(3.dp, Color.Black),
                            shape = RoundedCornerShape(15.dp)
                        )
                        .background(Color.Transparent)
                        .clickable {}
                        .width(170.dp)) {
                    Column(
                        Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.banana),
                            contentDescription = null,
                            modifier = Modifier.size(80.dp)
                        )

                    }
                    Column(modifier = Modifier.padding(start = 5.dp)) {
                        Text(
                            text = "Organic Bananas",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                        Text(text = "7pcs, Price")
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Row {
                        Text(text = "$4.99", Modifier.padding(start = 5.dp, top = 5.dp))
                        Spacer(Modifier.width(65.dp))
                        Button(
                            onClick = { },
                            modifier = Modifier.clip(
                                RoundedCornerShape(10.dp)
                            ), colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.vector_plus),
                                contentDescription = null,
                                modifier = Modifier.size(20.dp)
                            )

                        }


                    }

                }

                Spacer(modifier = Modifier.width(10.dp))

                Column(
                    modifier = Modifier

                        .clip(RoundedCornerShape(15.dp))
                        .border(
                            border = BorderStroke(3.dp, Color.Black),
                            shape = RoundedCornerShape(15.dp)
                        )
                        .background(Color.Transparent)
                        .clickable {}
                        .width(170.dp)) {
                    Column(
                        Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.apple),
                            contentDescription = null,
                            modifier = Modifier.size(80.dp)
                        )

                    }
                    Column(modifier = Modifier.padding(start = 5.dp)) {
                        Text(text = "Red Apple", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                        Text(text = "1kg, Price")
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Row {
                        Text(text = "$4.99", Modifier.padding(start = 5.dp, top = 5.dp))
                        Spacer(Modifier.width(65.dp))
                        Button(
                            onClick = { },
                            modifier = Modifier.clip(
                                RoundedCornerShape(10.dp)
                            ), colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.vector_plus),
                                contentDescription = null,
                                modifier = Modifier.size(20.dp)
                            )

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

            Row {
                Column(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .border(
                            border = BorderStroke(3.dp, Color.Black),
                            shape = RoundedCornerShape(15.dp)
                        )
                        .background(Color.Transparent)
                        .clickable {}
                        .width(170.dp)) {
                    Column(
                        Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.red_pepper),
                            contentDescription = null,
                            modifier = Modifier.size(80.dp)
                        )

                    }
                    Column(modifier = Modifier.padding(start = 5.dp)) {
                        Text(
                            text = "Bell Pepper Red",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                        Text(text = "1kg, Price")
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Row {
                        Text(text = "$4.99", Modifier.padding(start = 5.dp, top = 5.dp))
                        Spacer(Modifier.width(65.dp))
                        Button(
                            onClick = { },
                            modifier = Modifier.clip(
                                RoundedCornerShape(10.dp)
                            ), colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.vector_plus),
                                contentDescription = null,
                                modifier = Modifier.size(20.dp)
                            )

                        }


                    }

                }

                Spacer(modifier = Modifier.width(10.dp))

                Column(
                    modifier = Modifier

                        .clip(RoundedCornerShape(15.dp))
                        .border(
                            border = BorderStroke(3.dp, Color.Black),
                            shape = RoundedCornerShape(15.dp)
                        )
                        .background(Color.Transparent)
                        .clickable {}
                        .width(170.dp)) {
                    Column(
                        Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ginger),
                            contentDescription = null,
                            modifier = Modifier.size(80.dp)
                        )

                    }
                    Column(modifier = Modifier.padding(start = 5.dp)) {
                        Text(text = "Ginger", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                        Text(text = "250gm, Price")
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Row {
                        Text(text = "$4.99", Modifier.padding(start = 5.dp, top = 5.dp))
                        Spacer(Modifier.width(65.dp))
                        Button(
                            onClick = { },
                            modifier = Modifier.clip(
                                RoundedCornerShape(10.dp)
                            ), colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.vector_plus),
                                contentDescription = null,
                                modifier = Modifier.size(20.dp)
                            )

                        }

                    }

                }
            }
        }
    }

}

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Shop : NavigationItem("shop", R.drawable.vector_shop, "Shop")
    object Explore : NavigationItem("explore", R.drawable.vector_explore, "Explore")
    object Cart : NavigationItem("cart", R.drawable.vector_cart, "Cart")
    object Favourite : NavigationItem("favourite", R.drawable.vector_heart, "Favourite")
    object Account : NavigationItem("account", R.drawable.vector_account, "Account")
}


@Preview
@Composable
fun Preview() {
    HomeScreenUI()
}