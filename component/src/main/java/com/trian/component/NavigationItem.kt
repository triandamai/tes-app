package com.trian.component

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home",R.drawable.home, "Home")
    object Shop : NavigationItem("shop", R.drawable.vector_shop, "Shop")
    object Explore : NavigationItem("Explore", R.drawable.vector_explore, "Explore")
    object Cart : NavigationItem("cart", R.drawable.vector_cart, "Cart")
//    object Favourite : NavigationItem("favourite", R.drawable.vector_heart, "Favourite")
    object Account : NavigationItem("account", R.drawable.vector_account, "Account")
}
